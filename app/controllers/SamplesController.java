package controllers;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

import javax.inject.Inject;

import db.MySQLCon;
import ij.IJ;
import ij.ImageJ;
import ij.ImagePlus;
import ij.io.Opener;
import models.DBSample;
import play.data.*;
import play.mvc.*;
import play.twirl.api.Content;
import services.*;
import views.html.*;

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
        
        
		MySQLCon db = new MySQLCon();
		DBSample sample = new DBSample();
		
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
		
		System.out.println("6 of X: BUILD DBSAMPLE: width, height, bytes");
		//
		
		Integer width = imp.getWidth();
		sample.setWidth(width.toString());
		
		Integer height = imp.getHeight();
		sample.setHeight(height.toString());
		
		Long length = dstFile.length();
		sample.setNumBytes(length.toString());
		
		//COMMENT THIS OUT---------------------------------------
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
		//END COMMENT---------------------------------------
		
		System.out.println("9 of X: Thresholding: DolphinAnalyzer Creates Image Mask");

		// set current test color threshold to find blood
		// turns out this is a background threshold

		DolphinAnalyzer da = new DolphinAnalyzer();
		Color minColor = new Color(0, 0, 0);
		Color maxColor = new Color(255, 88, 88);
		Threshold thresh = new Threshold(minColor, maxColor);
		ImagePlus maskImage = da.mask(imp, thresh);
		maskImage.show();
				
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
        
        int segmentCount = st.size();
        sample.setSegmentCount(((Integer)segmentCount).toString());

		System.out.println("11.0 of X: Calculate Segment Attributes: SegmentAttributor produces SegAttributesTable");
		SegmentAttributor sa = new SegmentAttributor(st);
		SegAttributesTable sat = sa.getSegAttributesTable();
		//sat.printTable();
		
		System.out.println("12.0 of X: DB SAVE SAMPLE: Add this sample to the sample table in the database");
		String sampleId = db.addSample(userId, sample);
		
		System.out.println("13.0 of X: DB SAVE SEGMENTS: Add all the segments of this sample to the database");
		sat.saveSegmentsToDB(sampleId);
		
		//to be changed
		Content html = users.render("Dolphin Image Processor", db.getUsers());
		return ok(html);
	}
	
	//next step: Delete sample
	//re-route to delete confirmation screen first
	//then delete from there
}
