package controllers;

import play.mvc.*;
import views.html.*;
import java.io.File;
import java.nio.file.StandardCopyOption;

import ij.*;
import ij.ImagePlus;
import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

import services.DolphinAnalyzer;
import services.GenericDialog_Test;
import java.util.*;
import java.awt.*;

import ij.gui.GenericDialog;

public class Application extends Controller {

int imageID = 0;
    /*
    imageID increments for each image uploaded. Need a way to make it static across multiple loads,
    and need a way to avoid redundant image uploads.
    imageID solves the problem of 
    */
public Result upload() {
    try {
	Http.MultipartFormData formData = request().body().asMultipartFormData();
	Http.MultipartFormData.FilePart filePart = formData.getFile("fileupload");
	if (filePart != null) {
		// 1 of X: given an uploaded image, copy it to public/dolphinImages/, replace exsisting
		//
        	String fileName = filePart.getFilename();
        	File srcFile = (File) filePart.getFile();
        	imageID++;
		File dstFile = new File("public/dolphinImages/image1.jpg");
		java.nio.file.Files.copy(
			srcFile.toPath(), 
			dstFile.toPath(),
			StandardCopyOption.REPLACE_EXISTING
		);
		
		
		ImageJ imageJApplication = new ImageJ(2);
		
		Opener opener = new Opener();
		ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");

        imp.show();
        //Activate plug-ins that will be used
        IJ.runPlugIn("ij.plugin.Zoom", null);
        IJ.runPlugIn("ij.plugin.frame.RoiManager", null);
        
        DolphinAnalyzer da = new DolphinAnalyzer();
        da.grayscaleUpload();
        da.isolateRedUpload();
        da.redifyUpload();
        
        //imp.setRoi(100, 100, 50, 50); //add selection
        //IJ.run("To Selection"); //zoom to selection
        
		da.isolateRed(imp);
        
        /*
        GenericDialog gd = new GenericDialog("Dolphin Image Controller");
        gd.addMessage("User Control");
        String[] array = new String[1];
        array[0] = "OK";
        gd.addChoice("Zoom to Selection?", array, "OK");
        gd.show();
        String answer = gd.getNextChoice();
        if(answer.equals("OK"))
        {
            IJ.run("To Selection");
        }
        */
        
        /*
        GenericDialog_Test gdt = new GenericDialog_Test();
        gdt.run("Test");
        */
        
        Rectangle rect = da.highestScoreRect(imp);
        imp.setRoi(rect); //add selection
        
        IJ.run("To Selection");
        
   		FileSaver fs = new FileSaver(imp);
   		boolean ret = fs.saveAsJpeg("public/dolphinImages/imageEdited.jpg");
  
   		//navigate back to index?
		if (ret) {
			return ok(index.render("File Uploaded"));
		} else {
			return ok("ERROR: File uploaded to public/dolphinImages/" + fileName ); 
		}
	} else {
        	flash("error", "Missing file");
        	return badRequest();
    	}
    } catch (Exception e) {
	e.printStackTrace(System.out);
    }
    return ok("Should not reach this line, there must have been an error");
}

} // end Application class

