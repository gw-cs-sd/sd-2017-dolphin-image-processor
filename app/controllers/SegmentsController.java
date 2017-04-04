package controllers;

import java.awt.Color;
import java.io.File;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.inject.Inject;

import db.MySQLCon;
import ij.ImagePlus;
import ij.io.FileSaver;
import ij.io.Opener;
import models.DBSample;
import models.DBSegment;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.*;
import play.twirl.api.Content;
import services.DolphinAnalyzer;
import services.ImageSegmenter;
import services.Segment;
import services.SegmentTable;
import services.SegmentTableFilterer;
import services.SingleUploadTrainer;
import services.Threshold;
import views.html.*;

public class SegmentsController extends Controller
{
	@Inject FormFactory formFactory;
	
	public Result backToSamples()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String userId = requestData.get("backUserId");
		
		//render samples view
        MySQLCon db = new MySQLCon();
        Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
	
	public Result viewExamination()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String sampleId = requestData.get("sampleId");//works
		String imagePath = requestData.get("imagePath");
		MySQLCon db = new MySQLCon();
		
		System.out.println("1 OF X: GET ORIGINAL IMAGE: " + imagePath);
		
		ImagePlus imp = getImageFromPath(imagePath);
		
		System.out.println("2 OF X: DUPLICATE IMAGE --> EXAMINATION IMAGE");
		
		ImagePlus examImp = imp.duplicate();
		
		System.out.println("3 OF X: DRAW PERIMETERS ON EXAMINATION IMAGE");
		
		System.out.println("3.1 of X: Thresholding: DolphinAnalyzer Creates Image Mask");

		DolphinAnalyzer da = new DolphinAnalyzer();
		Color minColor = new Color(0, 0, 0);
		Color maxColor = new Color(255, 88, 88);
		Threshold thresh = new Threshold(minColor, maxColor);
		//ImagePlus maskImage = da.mask(examImp, thresh);
		ImagePlus maskImage = da.maskAuto(examImp);
		da.saveImpAsImage1(examImp);
		da.isolateRedUpload();
        
		System.out.println("3.2 of X: Segmentation: ImageSegmenter calculates Image Segments");
		
		ImageSegmenter is = new ImageSegmenter(maskImage, imp);
		is.calculateSegments();
		System.out.println("3.3 of X: Segmentation: ImageSegmenter produces SegmentTable");
		SegmentTable st = is.getSegmentTable();
		
		System.out.println("3.4 of X: FILTERING: Filter out segments with Area <= 4");
        SegmentTableFilterer stf = new SegmentTableFilterer();
        stf.removeSegmentsOfLessArea(st, 4);
		
		ArrayList<Segment> segList = st.getSegmentTableAsList();
		for(Segment s : segList)
		{
			s.paintPerimeter(examImp);
		}
		
		System.out.println("4 OF X: SAVE DUPLICATE IMAGE AS public/dolphinImages/examination.jpg");
		
		FileSaver fs = new FileSaver(examImp);
		String examImpPath = "dolphinImages/examination.jpg";
		fs.saveAsJpeg("public/" + examImpPath);
		
		System.out.println("5 of X: Save examImp as public/dolphinImages/subExamination.jpg");
	    fs.saveAsJpeg("public/dolphinImages/subExamination.jpg");
		
		String buttonVisibility = "hidden";
		Content html = examination.render(sampleId, imagePath, examImpPath, "", buttonVisibility);
		return ok(html);
	}
	
	public ImagePlus getImageFromPath(String imagePath)
	{
		String imagePathPublic = "public/" + imagePath; //add public to the path that is passed through View
		Opener opener = new Opener();
		ImagePlus imp = opener.openImage(imagePathPublic);
		if (null == imp) {
			System.out.println("Application.java line 66: imp == null");
	        	flash("error", "Missing file");
		}
		return imp;
	}
	
	public Result evaluateSample()
	{
		//copied from SamplesController.viewSample... shitty
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
		
		System.out.println("7 OF X: EVALUATE SAMPLE");
		
		SingleUploadTrainer sut = new SingleUploadTrainer();
        String permTrainingFilepath = "public/wekafiles/training.arff";
        //String singleUploadTestFilepath = "public/wekafiles/test.arff";
		String evalSummary = sut.trainSingleSample(sampleId, permTrainingFilepath, false);
		
		Content html = segments.render(sampleId, userName, sample, imagePath, displayWidth, displayHeight, segmentList, evalSummary);
		return ok(html);
	}
}
