package controllers;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.inject.Inject;

import db.MySQLCon;
import ij.*;
import ij.io.FileSaver;
import ij.io.Opener;
import ij.process.ImageProcessor;
import ij.ImagePlus;
import models.DBSample;
import models.DBSegment;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.*;
import play.twirl.api.Content;
import services.DolphinAnalyzer;
import services.ImageSegmenter;
import services.Pixel;
import services.Segment;
import services.SegmentTable;
import services.Threshold;
import views.html.examination;
import views.html.index;
import views.html.samples;
import views.html.segments;

public class ExaminationController extends Controller
{
	@Inject FormFactory formFactory;
	
	boolean hasBeenClicked;
	boolean viewingOriginalExam;
	SegmentTable segmentTable;
	ImagePlus examImp;
	
	public Result backToSegments()
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
		
		hasBeenClicked = false;
		
		Content html = segments.render(sampleId, userName, sample, imagePath, displayWidth, displayHeight, segmentList);
		return ok(html);
	}
	
	public Result clickImage()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String xCoord = requestData.get("xClick");
		String yCoord = requestData.get("yClick");
		String sampleId = requestData.get("sampleId");
		String origImagePath = requestData.get("origImagePath");
		String examImagePath = requestData.get("examImagePath");
		
		System.out.println("RECEIVED BY JAVA:");
		System.out.println("xCoord = " + xCoord);
		System.out.println("yCoord = " + yCoord);
		System.out.println("sampleId = " + sampleId);
		
		if(hasBeenClicked == false)
		{
			System.out.println("if(visited == false)");
			
			System.out.println("1 of X: get Segment Table from original image Path: " + origImagePath);
			segmentTable = getSegmentTableFromPath(origImagePath);
			
			System.out.println("2 of X: get examination image from exam image path: " + examImagePath);
			examImp = getImageFromPath(examImagePath);
		    
			System.out.println("3 of X: set hasBeenClicked = true");
			hasBeenClicked = true;
			viewingOriginalExam = true;
		}
		
		//CASE: We are not viewing the Original Exam image, so do not any zooming
		if(viewingOriginalExam == false)
		{
			Content html = examination.render(sampleId, origImagePath, examImagePath, "visible");
			return ok(html);
		}
		//Determine the Segment who owns the pixel who was clicked
		
		Segment containingSegment = getContainingSegment(xCoord, yCoord);
		
		//CASE: User Clicked a pixel that was not a segment
		if(containingSegment == null)
		{
			System.out.println("containingSegment == null, render page again with no zoom");
			viewingOriginalExam = true;
			Content html = examination.render(sampleId, origImagePath, examImagePath, "hidden");
			return ok(html);
		}
		//Tell the program that we are not viewing the original image
		viewingOriginalExam = false;
		
		//Select the bounding box ROI of the owner Segment
		containingSegment.setBoundingBoxRoi(examImp);
		
		//Duplicate Exam and call it subExam
		ImagePlus subExamImp = examImp.duplicate();
		
		//Crop subExam according to the Roi
		ImageProcessor subIp = subExamImp.getProcessor();
		subIp.crop();
		
		//Resize subExamImp. Call that subExamImpResized
		ImageProcessor subIpResized = subIp.resize(examImp.getWidth());
		ImagePlus subExamImpResized = new ImagePlus("subExamination", subIpResized);
		
		//Save subExamImpResized as jpeg
	    FileSaver fs = new FileSaver(subExamImpResized);
	    fs.saveAsJpeg("public/dolphinImages/subExamination.jpg");
		
		String buttonVisibility = "visible";
		Content html = examination.render(sampleId, origImagePath, examImagePath, buttonVisibility);
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
	
	public SegmentTable getSegmentTableFromPath(String imagePath)
	{
		System.out.println("1 OF X: GET ORIGINAL IMAGE: " + imagePath);
		
		ImagePlus origImp = getImageFromPath(imagePath);
		
		System.out.println("2 OF X: GET SEGMENT TABLE OF ORIGINAL IMAGE");
		System.out.println("2.1 of X: Thresholding: DolphinAnalyzer Creates Image Mask");

		DolphinAnalyzer da = new DolphinAnalyzer();
		Color minColor = new Color(0, 0, 0);
		Color maxColor = new Color(255, 88, 88);
		Threshold thresh = new Threshold(minColor, maxColor);
		ImagePlus maskImage = da.mask(origImp, thresh);
        
		System.out.println("2.2 of X: Segmentation: ImageSegmenter calculates Image Segments");
		
		ImageSegmenter is = new ImageSegmenter(maskImage, origImp);
		is.calculateSegments();
		System.out.println("2.3 of X: Segmentation: ImageSegmenter produces SegmentTable");
		return is.getSegmentTable();
	}
	
	//returns null if not found
	public Segment getContainingSegment(String xCoord, String yCoord)
	{
		ArrayList<Segment> segList = segmentTable.getSegmentTableAsList();
		Segment containingSegment = null;
		for(Segment s : segList)
		{
			ArrayList<Pixel> pixelList = s.getSegmentAsList();
			for(Pixel p : pixelList)
			{
				int xCoordInt = Integer.parseInt(xCoord);
				int yCoordInt = Integer.parseInt(yCoord);
				if(p.getX() == xCoordInt && p.getY() == yCoordInt)
				{
					return s;
				}
			}
		}
		return containingSegment;
	}
	
	public Result revertToOriginal()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String sampleId = requestData.get("sampleId");
		String origImagePath = requestData.get("origImagePath");
		String examImagePath = requestData.get("examImagePath");
		String buttonVisibility = "hidden";
		
		//Save Examination image as the subExamination --> reverting to original examination
		FileSaver fs = new FileSaver(examImp);
	    fs.saveAsJpeg("public/dolphinImages/subExamination.jpg");
	    
	    viewingOriginalExam = true;
		
		Content html = examination.render(sampleId, origImagePath, examImagePath, buttonVisibility);
		return ok(html);
	}
	
}
