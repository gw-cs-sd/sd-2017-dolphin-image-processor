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
		ImagePlus maskImage = da.mask(examImp, thresh);
        
		System.out.println("3.2 of X: Segmentation: ImageSegmenter calculates Image Segments");
		
		ImageSegmenter is = new ImageSegmenter(maskImage, imp);
		is.calculateSegments();
		System.out.println("3.3 of X: Segmentation: ImageSegmenter produces SegmentTable");
		SegmentTable st = is.getSegmentTable();
		
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
		Content html = examination.render(sampleId, imagePath, examImpPath, buttonVisibility);
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
}
