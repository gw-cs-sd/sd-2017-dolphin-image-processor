package controllers;
/*Application.java
 * This is the main controller of the application.
 * When the user uploads an image, Application.java 
 * creates the objects that will carry out the primary operations.
 * 
 */
import play.mvc.*;
import views.html.*;
import java.io.*;
import java.nio.file.StandardCopyOption;

import ij.IJ;
import ij.ImageJ;
import ij.plugin.MacroInstaller;
import ij.ImagePlus;
import ij.macro.Interpreter;


import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;
import ij.gui.Toolbar;

import services.DolphinAnalyzer;
import services.GenericDialog_Test;
import services.*;
import java.util.*;
import java.awt.*;
import ij.gui.GenericDialog;

public class Application extends Controller {

/* this method is required because several of the ImageJ methods
   say they take a macro, but this is not the fileName of the macro,
   it is the very long text of the macro.

   So this method converts the fileName into a very long String

   increased StringBuffer size but if it fails, make it bigger
*/
String fileToString(String path) {
		if (path==null) return null;
		try {
			StringBuffer sb = new StringBuffer(10000);
			BufferedReader r = new BufferedReader(new FileReader(path));
			while (true) {
				String s=r.readLine();
				if (s==null)
					break;
				else
					sb.append(s+"\n");
			}
			r.close();
			return new String(sb);
		}
		catch (Exception e) {
			IJ.error(e.getMessage());
			return null;
		}
	}

/*==============================================================================================
 * 	UPLOAD
 * ============================================================================================
 * This method is called when the user presses the upload button on the start screen.
 */
public Result upload() {
    try {
	// Must open and show an image before any operations on it can be executed.
	// The upload button has been pressed.

	System.out.println("1 of X: OPEN FILE FROM REMOTE get source image Application.upload() version="+IJ.getFullVersion());
	//
	Http.MultipartFormData<Object> formData = request().body().asMultipartFormData();
	Http.MultipartFormData.FilePart<Object> filePart = formData.getFile("fileupload");
        String fileName = filePart.getFilename();
        File srcFile = (File) filePart.getFile();


	System.out.println("2 of X: COPY FILE TO LOCAL given source image, copy it to destination ");
	//	   public/dolphinImages/image1.jpg, replace existing
	File dstFile = new File("public/dolphinImages/image1.jpg");
	java.nio.file.Files.copy(
		srcFile.toPath(), 
		dstFile.toPath(),
		StandardCopyOption.REPLACE_EXISTING
	);

	System.out.println("3 of X: OPEN LOCAL FILE AS IMAGE open the newly created file as an image");
	//
	ImageJ imageJApplication = new ImageJ(2);
	Opener opener = new Opener();
	ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");
	if (null == imp) {
		System.out.println("Application.java line 66: imp == null");
        		flash("error", "Missing file");
        		return badRequest();
	}

	System.out.println("4 of X: DISPLAY IMAGE");
    imp.show();

	System.out.println("5 of X: DISPLAY TOOLBAR");
	// secret way of displaying the Toolbar as this is not documented anywhere

	System.out.println("5.1 of X: get the frame that the toolbar belongs to:");
	ImageJ ij = IJ.getInstance(); // ij is actually a frame
	if (null == ij) {
		System.out.println("Dolphin: no image file is open");
		return ok(index.render("Dolphin: no image file is open"));
	}

	System.out.println("5.2 of X: the frame is too small so make its size a little bigger");
	ij.setSize(600,100);

	System.out.println("5.3 of X: make it visible");
	ij.setVisible(true);
	
	System.out.println("6 of X: Thresholding: DolphinAnalyzer Creates Image Mask");
	
	//set current test color threshold to find blood
	//turns out this is a background threshold
	
	DolphinAnalyzer da = new DolphinAnalyzer();
	Color minColor = new Color(0, 0, 0);
	Color maxColor = new Color(255, 88, 88);
	Threshold thresh = new Threshold(minColor, maxColor);
	ImagePlus maskImage = da.mask(imp, thresh);
	maskImage.show();
	
	System.out.println("7.1 of X: Segmentation: ImageSegmenter calculates Image Segments");
	
	ImageSegmenter is = new ImageSegmenter(maskImage, imp);
	int[][] labels = is.calculateSegments();
	int curlab = is.getCurrentLabel();
	
	System.out.println("Current Label = " + curlab);
	
	
	System.out.println("7.2 of X: Segmentation: ImageSegmenter produces SegmentTable");
	SegmentTable st = is.getSegmentTable();
	
	System.out.println("8.0 of X: Calculate Segment Attributes: SegmentAttributor produces SegAttributesTable");
	SegmentAttributor sa = new SegmentAttributor(st);
	SegAttributesTable sat = sa.getSegAttributesTable();

	sat.printTable();
    /*
	System.out.println("Install Macro");
	// can skip and run the macro without installing
	// but we do this so we can run multiple times
	//

	System.out.println("Setup of automatic macro install");
	//
	String macroDirName = "dolphin/ijmacros/";
	System.out.println(macroDirName);

	String macroFileName = "SetThresholdRGB.ijm";
	System.out.println(macroFileName);

	MacroInstaller mi = new MacroInstaller();
	mi.setFileName(macroFileName); // This line is critical it seems, else name will not appear in menu

	System.out.println("actual install mi.install(fileToString(dirName+fileName))");
        //
	int result = mi.install(fileToString(macroDirName+macroFileName)); 
	System.out.println("result=="+result);
	
	System.out.println("RUN MACRO IJ.runMacroFile(macroDirName+macroFileName)");
	IJ.runMacroFile(macroDirName+macroFileName); // not converting file to string
	*/


/* COMMENT OUT DOLPHIN ANALYZER NO NEED FOR IT NOW

	System.out.println("6 of X: DolphinAnalyzer()");
	//
        DolphinAnalyzer da = new DolphinAnalyzer();
        da.grayscaleUpload();
        da.isolateRedUpload();
        da.redifyUpload();
        
        //imp.setRoi(100, 100, 50, 50); //add selection
        //IJ.run("To Selection"); //zoom to selection
        
	da.isolateRed(imp);
        
        Rectangle rect = da.highestScoreRect(imp);
        imp.setRoi(rect); //add selection

	imp.show("my status bar message");
        
        //GenericDialog_Test gdt = new GenericDialog_Test();
        //gdt.run("Test");
        
        //IJ.run("To Selection");
        
   	FileSaver fs = new FileSaver(imp);
   	boolean ret = fs.saveAsJpeg("public/dolphinImages/imageEdited.jpg");
  
END COMMENT OUT DOLPHIN ANALYZER NO NEED FOR IT NOW */

	return ok(index.render("File Uploaded"));
    } catch (Exception e) {
	e.printStackTrace(System.out);
    }
    return ok("Should not reach this line, there must have been an error..");
}

} // end Application class

