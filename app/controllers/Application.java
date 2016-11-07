package controllers;

import play.mvc.*;
import views.html.*;
import java.io.File;
import java.nio.file.StandardCopyOption;

import ij.ImagePlus;
import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

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

		// 2 of X: open, transform, save as rotated.jpeg
		//
		//Red-ify------------------------------------------------------------------------------
		Opener opener = new Opener();
		ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");
		int height = imp.getHeight();
		int width = imp.getWidth();
		int[] pixel = imp.getPixel(0,0); /* get pixel at x,y */

		ImageProcessor ip = imp.getProcessor();
		// get 
		int[] rgb = new int[3];
		ip.getPixel(0,0,rgb);

        //red-ify every pixel
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                ip.getPixel(i, j, rgb);
                rgb[1] = 0;
                rgb[2] = 0;
                ip.putPixel(i, j, rgb);
                /*
                int[] myRgb = new int[3];
        		myRgb[0] = 10;
        		myRgb[1] = 20;
        		myRgb[2] = 30;
        		*/
            }
        }
		// put
		/*
		int[] myRgb = new int[3];
		myRgb[0] = 10;
		myRgb[1] = 20;
		myRgb[2] = 30;
		ip.putPixel(0,0,myRgb);
		*/

		//ip.rotateRight();
		/*
		ip.flipVertical();
		*/
		
   		// Save results
   		FileSaver fs = new FileSaver(imp);
   		boolean ret = fs.saveAsJpeg("public/dolphinImages/redified.jpg");
   		
   		//Grayscale--------------------------------------------------------------------
   		imp = opener.openImage("public/dolphinImages/image1.jpg");
   		height = imp.getHeight();
		width = imp.getWidth();

		ip = imp.getProcessor();
		// get 
		rgb = new int[3];
		ip.getPixel(0,0,rgb);

        //grayscale every pixel
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                ip.getPixel(i, j, rgb);
                int grayscale = (int)((rgb[0] * 0.21) + (rgb[1] * 0.72) + (rgb[2] * 0.07));
                rgb[0] = grayscale;
                rgb[1] = grayscale;
                rgb[2] = grayscale;
                ip.putPixel(i, j, rgb);
            }
        }
        FileSaver fs1 = new FileSaver(imp);
   		fs1.saveAsJpeg("public/dolphinImages/grayscaled.jpg");
   		
   		//isolate red----------------------------------------------------------------------
   		imp = opener.openImage("public/dolphinImages/image1.jpg");
   		height = imp.getHeight();
		width = imp.getWidth();

		ip = imp.getProcessor();
		// get 
		rgb = new int[3];
		ip.getPixel(0,0,rgb);

        //grayscale every pixel
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                ip.getPixel(i, j, rgb);
                if(rgb[0] < rgb[1] * 1.4 || rgb[0] < rgb[2] * 1.4)
                {
                    int grayscale = (int)((rgb[0] * 0.21) + (rgb[1] * 0.72) + (rgb[2] * 0.07));
                    rgb[0] = grayscale;
                    rgb[1] = grayscale;
                    rgb[2] = grayscale;
                    ip.putPixel(i, j, rgb);
                }
            }
        }
        FileSaver fs2 = new FileSaver(imp);
   		fs2.saveAsJpeg("public/dolphinImages/redIsolated.jpg");
   		
   		//navigate back to index?
		if (ret) {
		    /*
			return ok("File uploaded to public/dolphinImages/" + fileName 
			+ "\nheight:"+height
			+ "\nwidth:"+width
			+ "\nred:"+pixel[0]
			+ "\ngreen:"+pixel[1]
			+ "\nblue:"+pixel[2]
			+ "\nrgb.r:"+rgb[0]
			+ "\nrgb.g:"+rgb[1]
			+ "\nrgb.b:"+rgb[2]
			);
			*/
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

