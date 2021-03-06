package controllers;

import java.awt.Color;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.swing.JOptionPane;

import com.google.common.base.Strings;

import db.MySQLCon;
import ij.IJ;
import ij.ImageJ;
import ij.ImagePlus;
import ij.io.Opener;
import models.DBSample;
import models.DBSegment;
import play.data.*;
import play.mvc.*;
import play.twirl.api.Content;
import services.*;
import views.html.*;
import weka.core.Instances;
import wekapack.*;

public class SamplesController extends Controller
{
	@Inject FormFactory formFactory;
	
	public Result backToUsers()
	{
		//render users view
        MySQLCon db = new MySQLCon();
		Content html = users.render("Dolphin Image Processor", db.getUsers());
		return ok(html);
	}
	
	public Result addSample()
	{
		System.out.println("1 of X: GATHER DATA FROM HTML");
		DynamicForm requestData = formFactory.form().bindFromRequest();
		System.out.println("requestData.get().toString():"+requestData.get().toString());
        String userId = requestData.get("userId");//works
        System.out.println("userId:"+userId);
        String bloodStatus = requestData.get("bloodStatusRadio");
        System.out.println("bloodStatus:"+bloodStatus);
        
        boolean classifyThisSample = false;
        
		MySQLCon db = new MySQLCon();
		DBSample sample = new DBSample();
		
		//if bloodStatus is unknown, need to assign it correctly
		if(bloodStatus.equals("unknown"))
		{
			bloodStatus = "notBlood";
			classifyThisSample = true;
		}
		
		System.out.println("2 of X: OPEN FILE FROM REMOTE get source image");
		//
		Http.MultipartFormData<Object> formData = request().body().asMultipartFormData();
		Http.MultipartFormData.FilePart<Object> filePart = formData.getFile("fileupload");
	    String fileName = filePart.getFilename();
	    File srcFile = (File)filePart.getFile();
	    
	    sample.setName(fileName);

		System.out.println("3 of X: COPY FILE TO LOCAL USER DIRECTORY given source image, copy it to destination");
		//	   public/dolphinImages/image1.jpg, replace existing
		
		String directory = "public/dolphinImages/users/"+db.getUserName(userId);
        File directoryFile = new File(directory);
        if(!directoryFile.exists())
        {
        	System.out.println("directory did not exist, so creating it:" + directory);
        	directoryFile.mkdir();
        }
        String destination = directoryFile + "/" + fileName;
        File dstFile = new File(destination);
        
		try{
			java.nio.file.Files.copy(srcFile.toPath(), dstFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("4 of X: COPY FILE TO HARD-CODED WORKING AREA");
		
		File dstFileWorking = new File("public/dolphinImages/image1.jpg");
		try{
			java.nio.file.Files.copy(srcFile.toPath(), dstFileWorking.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("5 of X: OPEN LOCAL FILE AS IMAGE open the newly created file as an image");
		//
		ImageJ imageJApplication = new ImageJ(2);
		Opener opener = new Opener();
		ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");
		if (imp == null)
		{
			System.out.println("imp == null");
	        		//flash("error", "Missing file");
	        		//return badRequest();
		}
		
		System.out.println("6 of X: BUILD DBSAMPLE: width, height, bytes, bloodStatus");
		//
		
		Integer width = imp.getWidth();
		sample.setWidth(width.toString());
		
		Integer height = imp.getHeight();
		sample.setHeight(height.toString());
		
		Long length = dstFile.length();
		sample.setNumBytes(length.toString());
		
		System.out.println("6.1 of X: BUILD DBSAMPLE: set bloodStatus of SAMPLE");
		sample.setBloodStatus(bloodStatus);
		
		//COMMENT THIS OUT---------------------------------------
		/*
		System.out.println("7 of X: DISPLAY IMAGE");
		imp.show();

		System.out.println("8 of X: DISPLAY TOOLBAR");
		System.out.println("8.1 of X: get the frame that the toolbar belongs to");
		ImageJ ij = IJ.getInstance(); // ij is actually a frame
		if (ij == null)
		{
			System.out.println("Dolphin: no image file is open");
			return ok("Dolphin: no image file is open");
		}

		System.out.println("8.2 of X: The frame is too small, so make its size slightly bigger");
		ij.setSize(600, 100);

		System.out.println("8.3 of X: Make it Visible");
		ij.setVisible(true);
		*/
		//END COMMENT---------------------------------------
		
		System.out.println("9 of X: Thresholding: DolphinAnalyzer Creates Image Mask");

		// set current test color threshold to find blood
		// turns out this is a background threshold

		DolphinAnalyzer da = new DolphinAnalyzer();
		Color minColor = new Color(0, 0, 0);
		Color maxColor = new Color(255, 88, 88);
		Threshold thresh = new Threshold(minColor, maxColor);
		//ImagePlus maskImage = da.mask(imp, thresh);
		ImagePlus maskImage = da.maskAuto(imp);
		//maskImage.show();
				
		//add in max RGB values of threshold
        sample.setR(((Integer)thresh.getMinRed()).toString());
        sample.setG(((Integer)thresh.getMinGreen()).toString());
        sample.setB(((Integer)thresh.getMinBlue()).toString());
        sample.setComment("comment");
        
		System.out.println("10.1 of X: Segmentation: ImageSegmenter calculates Image Segments");
		
		ImageSegmenter is = new ImageSegmenter(maskImage, imp);
		is.calculateSegments();
		int curlab = is.getCurrentLabel();
		System.out.println("Current Label = " + curlab);
		System.out.println("10.2 of X: Segmentation: ImageSegmenter produces SegmentTable");
		SegmentTable st = is.getSegmentTable();	        
        
        System.out.println("10.3 of X: FILTERING: Filter out segments with Area <= 4");
        SegmentTableFilterer stf = new SegmentTableFilterer();
        stf.removeSegmentsOfLessArea(st, 4);
        
        int segmentCount = st.size();
        String segmentCountStr = Integer.toString(segmentCount);
        //sample.setSegmentCount(Integer.toString(st.size()));
        sample.setSegmentCount(segmentCountStr);
        System.out.println("10.4 of X: SegmentCount = " + segmentCountStr);

		System.out.println("11.0 of X: Calculate Segment Attributes: SegmentAttributor produces SegAttributesTable");
		SegmentAttributor sa = new SegmentAttributor(st, imp);
		SegAttributesTable sat = sa.getSegAttributesTable();
		
		//sat.printTable();
		
		System.out.println("12.0 of X: DB SAVE SAMPLE: Add this sample to the sample table in the database");
		String sampleId = db.addSample(userId, sample);
		
		System.out.println("13.0 of X: DB SAVE SEGMENTS: Add all the segments of this sample to the database");
		sat.saveSegmentsToDB(sampleId);
		
		//System.out.println("13.1 of X: DB SAVE SEGMENTS: Add bloodStatus to all the segments of this sample in DB");
		//db.populateSegmentBloodStatus(sample);
		
		/*
		System.out.println("14.0 of X: WEKA: Convert SAT to .ARFF and save file");
		WekaFileWriter wfw = new WekaFileWriter();
		wfw.saveSATasARFF(sat);
		wfw.writeDataToFile("public/dolphinImages/test.arff");
		
		System.out.println("14.1 of X: WEKA: Convert DBSegment to Instances object");
		ArrayList<DBSegment> wekaSegments = db.getSegments(sampleId);
		WekaFileWriterDB wfwdb = new WekaFileWriterDB();
		wfwdb.saveDBSegmentsasInstances(wekaSegments);
		*/
		
		System.out.println("14.0 of X: CLASSIFY THE SAMPLE, classifyThisSample = " + classifyThisSample);
		
		System.out.println("classifyThisSample == " + classifyThisSample);
		if(classifyThisSample)
		{
			/*
			 * need to somehow get the segments from this sample into a test set
			 * and then check it against an existing training set
			 * 
			 * read the attributes of the training set?
			 * and then use those attributes in the test set?
			 */
			
			SingleUploadTrainer sut = new SingleUploadTrainer();
	        String permTrainingFilepath = "public/wekafiles/training.arff";
	        //String singleUploadTestFilepath = "public/wekafiles/test.arff";
			sut.trainSingleSample(sampleId, permTrainingFilepath, true);
		}
		/*
		DataSetBuilder dsb = new DataSetBuilder();
		//CHANGE THIS TO A PERMANENT TRAINING SET!
		WekaFileWriterAuto wfw = new WekaFileWriterAuto();
		Instances train = wfw.readDataFromFile("public/wekafiles/training.arff");
		Instances test = wfw.readDataFromFile("public/wekafiles/test.arff");
		*/
		
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	
	public Result populateDataSets()
	{
		System.out.println("1 of X: GATHER DATA FROM HTML");
		DynamicForm requestData = formFactory.form().bindFromRequest();
        String userId = requestData.get("userId");
        System.out.println("userId:"+userId);
        
        if(Strings.isNullOrEmpty(userId))
        {
        	userId = requestData.get("clearUserId");
        	if(Strings.isNullOrEmpty(requestData.get("clearUserId")))
        	{
        		
        	}
        	else
        	{
        		//user requested to clear data set
        		return clearDataSets(userId);
        	}
        }
        
        DataSetBuilder dsb = new DataSetBuilder();
        Instances train = dsb.populateTrainingSet(requestData);
        Instances test = dsb.populateTestSet(requestData);
        
        //run weka test
        /*
        WekaTester wekaTester = new WekaTester();
        wekaTester.runClassifier(train, test);
        */
        
        MySQLCon db = new MySQLCon();
		
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	
	public Result clearDataSets(String userId)
	{
        DataSetBuilder dsb = new DataSetBuilder();
        dsb.deleteTrainingSet();
        dsb.deleteTestSet();
        
        MySQLCon db = new MySQLCon();
		
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	
	//this is shitty and broken
	public Result runClassifier()
	{
		System.out.println("1 of X: GATHER DATA FROM HTML");
		DynamicForm requestData = formFactory.form().bindFromRequest();
        String userId = requestData.get("userId");
        System.out.println("userId:"+userId);
        
		WekaFileWriterAuto wfw = new WekaFileWriterAuto();
		Instances train = wfw.readDataFromFile("public/wekafiles/training.arff");
		Instances test = wfw.readDataFromFile("public/wekafiles/test.arff");
		
		if(train == null || test == null)
		{
			System.out.println("Error: Training or Test set do not exist");
		}
		else
		{
			WekaTester wekaTester = new WekaTester();
		    wekaTester.runClassifier(train, test);
		}
        
		MySQLCon db = new MySQLCon();
		
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	
	public Result runClassifierSample()
	{
		System.out.println("1 of X: GATHER DATA FROM HTML");
		DynamicForm requestData = formFactory.form().bindFromRequest();
        String sampleId = requestData.get("sampleId");
        System.out.println("sampleId:"+sampleId);
        
		WekaFileWriterAuto wfw = new WekaFileWriterAuto();
		Instances train = wfw.readDataFromFile("public/wekafiles/training.arff");
		Instances test = wfw.readDataFromFile("public/wekafiles/test.arff");
		
		if(train == null || test == null)
		{
			System.out.println("Error: Training or Test set do not exist");
		}
		else
		{
			WekaTester wekaTester = new WekaTester();
		    wekaTester.runClassifier(train, test);
		    
		    SingleUploadTrainer sut = new SingleUploadTrainer();
	        String permTrainingFilepath = "public/wekafiles/training.arff";
			sut.trainSingleSample(sampleId, permTrainingFilepath, false);
		}
        
		MySQLCon db = new MySQLCon();
		
		String userId = db.getSample(sampleId).getUserId();
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	
	//COMMENT OUT OLD "ADD TO TRAINING" AND "ADD TO TEST" BUTTONS
	/*
	public Result addToDataset()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String sampleId = requestData.get("trainingSampleId");
		String filepath;
		if(Strings.isNullOrEmpty(sampleId))
		{
			//user pushed button to add to TEST
			sampleId = requestData.get("testSampleId");
			filepath = "public/wekafiles/test.arff";
		}
		else
		{
			//user pushed button to add to TRAINING
			filepath = "public/wekafiles/training.arff";
		}
		
		MySQLCon db = new MySQLCon();
		DBSample sample = db.getSample(sampleId);
		
		//WekaFileWriterDB wfw = new WekaFileWriterDB();
		ArrayList<DBSegment> list = db.getSegments(sampleId);
		//wfw.saveDBSegmentsasInstances(list);
		
		appendSegmentsToFile(list, filepath);
		System.out.println("Added Segments from Sample " + sampleId + " to set " + filepath);
		
		String userId = sample.getUserId();
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	*/
	
	/*
	public void appendSegmentsToFile(ArrayList<DBSegment> list, String filepath)
	{
		WekaFileWriterDB wfw = new WekaFileWriterDB();
		//check if file "public/wekafiles/training.arff" exists
		File trainingFile = new File(filepath);
		Instances data;
		if(trainingFile.exists())
		{
			Instances existingData = wfw.readDataFromFile(filepath);
			data = wfw.saveDBSegmentsasInstances(list);
			//data = Instances.mergeInstances(existingData, data);
			data.addAll(existingData);
			wfw.writeDataToFile(data, filepath);
			System.out.println("Adding to existing " + filepath + " file");
		}
		else
		{
			data = wfw.saveDBSegmentsasInstances(list);
			wfw.writeDataToFile(data, filepath);
			System.out.println("Creating new " + filepath);
		}
	}
	*/
	
	public Result requestDeleteSample()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String sampleId = requestData.get("sampleId");
		MySQLCon db = new MySQLCon();
		
		String userId = db.getSample(sampleId).getUserId();
		String userName = db.getUserName(userId);
		
		//go to confirmUserDelete view
		Content html = confirmSampleDelete.render(sampleId, userId, userName);
		return ok(html);
	}
	
	public Result viewSample()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String sampleId = requestData.get("sampleId");//works
		MySQLCon db = new MySQLCon();
		
		System.out.println("1 OF X: GET USERID");
		
		String userId = db.getSample(sampleId).getUserId();
		
		System.out.println("2 OF X: GET USERNAME");
		
		String userName = db.getUserName(userId);
		
		System.out.println("3 OF X: GET SAMPLE");
		
		DBSample sample = db.getSample(sampleId);
		
		System.out.println("4 OF X: GET IMAGE PATH");
		String directory = "dolphinImages/users/"+userName;
		String filename = db.getSample(sampleId).getName();
		String imagePath = directory + "/" + filename;
		
		System.out.println("5 OF X: GET DISPLAY WIDTH AND HEIGHT");
		
		String displayWidth = db.getSample(sampleId).getWidth();
		String displayHeight = db.getSample(sampleId).getHeight();
		
		Integer width = Integer.parseInt(displayWidth);
		Integer height = Integer.parseInt(displayHeight);
		
		//fit image to scale --> longest side becomes 300 pixels long
		Integer scaler;
		if(width >= height)
		{
			scaler = width / 300;
		}
		else
		{
			scaler = height / 300;
		}
		if(scaler <= 0)
		{
			scaler = 1;
		}
		width = width / scaler;
		height = height / scaler;
		displayWidth = width.toString();
		displayHeight = height.toString();
		
		System.out.println("6 OF X: GET LIST[DBSEGMENT]");
		ArrayList<DBSegment> segmentList = db.getSegments(sampleId);
		
		Content html = segments.render(sampleId, userName, sample, imagePath, displayWidth, displayHeight, segmentList, "");
		return ok(html);
	}
	
}
