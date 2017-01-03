package services;
/*DolphinAnalyzer.java
 * The DolphinAnalyzer performs operations to edit images on the pixel level.
 * Most notably, it is critical in the Thresholding step, as it creates the Mask (Binary) image,
 * which will be passed to the ImageSegmenter for the Segmentation step.
 */

import ij.*;
import java.awt.*;

import ij.ImagePlus;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

public class DolphinAnalyzer
{
    public DolphinAnalyzer()
    {
    }

    /*======================================================================================
     * 	MASK
     * =====================================================================================
     * Creates image mask based on the input original image, and color threshold.
     * An image mask is an image of just white (255,255,255) and back (0,0,0) pixels.
     * White pixels will be ignored later by ImageSegmenter.
     */
    public ImagePlus mask(ImagePlus imp, Threshold thresh)
    {
        ImagePlus maskImage = imp.duplicate();
        int height = maskImage.getHeight();
		int width = maskImage.getWidth();
        ImageProcessor ip = maskImage.getProcessor();
        
        int[] rgb = new int[3];
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                ip.getPixel(i, j, rgb);
                Pixel p = new Pixel(i, j, rgb);
                if(p.isBackground(thresh))
                {
                    //black
                    rgb[0] = 0;
                    rgb[1] = 0;
                    rgb[2] = 0;
                }
                else
                {
                    //white
                    rgb[0] = 255;
                    rgb[1] = 255;
                    rgb[2] = 255;
                }
                ip.putPixel(i, j, rgb);
            }
        }
        return maskImage;
    }
    
    public Pixel getPixel(ImagePlus imp, int x, int y)
    {
        ImageProcessor ip = imp.getProcessor();
        int[] rgb = new int[3];
        ip.getPixel(x, y, rgb);
        Pixel p = new Pixel(x, y, rgb);
        return p;
    }

    /* ===============================================================================================================
     * UPLOAD METHODS
     * ===============================================================================================================
     * Methods to perform specified operations on images, and upload them as a saved image.
     */
    public void redifyUpload()
    {
        Opener opener = new Opener();
		ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");
		
		redify(imp);
		
		FileSaver fs = new FileSaver(imp);
   		boolean ret = fs.saveAsJpeg("public/dolphinImages/redified.jpg");
    }
    
    public void isolateRedUpload()
    {
        Opener opener = new Opener();
		ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");
		
		isolateRed(imp);
		
		FileSaver fs = new FileSaver(imp);
   		boolean ret = fs.saveAsJpeg("public/dolphinImages/redIsolated.jpg");
    }
    
    public void grayscaleUpload()
    {
        Opener opener = new Opener();
		ImagePlus imp = opener.openImage("public/dolphinImages/image1.jpg");
		
		grayscale(imp);
		
		FileSaver fs = new FileSaver(imp);
   		boolean ret = fs.saveAsJpeg("public/dolphinImages/grayscaled.jpg");
    }
    
    /* ===============================================================================================================
     * OPERATION METHODS
     * ===============================================================================================================
     * Methods to perform specified operations on images on the pixel level.
     */
    
    public void isolateRed(ImagePlus imp)
    {
        int height = imp.getHeight();
		int width = imp.getWidth();
        ImageProcessor ip = imp.getProcessor();
		int[] rgb = new int[3];
		
        //Go through every pixel and greyscale unless the pixel is 1.5 times more red than green or blue.
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                ip.getPixel(i, j, rgb);
                if(rgb[0] < rgb[1] * 1.5 || rgb[0] < rgb[2] * 1.5)
                {
                    int grayscale = (int)((rgb[0] * 0.21) + (rgb[1] * 0.72) + (rgb[2] * 0.07));
                    rgb[0] = grayscale;
                    rgb[1] = grayscale;
                    rgb[2] = grayscale;
                    ip.putPixel(i, j, rgb);
                }
            }
        }
    }
    
    public void redify(ImagePlus imp)
    {
		int height = imp.getHeight();
		int width = imp.getWidth();

		ImageProcessor ip = imp.getProcessor();
		int[] rgb = new int[3];

        //red-ify every pixel
        for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
                ip.getPixel(i, j, rgb);
                rgb[1] = 0;
                rgb[2] = 0;
                ip.putPixel(i, j, rgb);
            }
        }
    }
    
    public void grayscale(ImagePlus imp)
    {
        //grayscale every pixel
        int height = imp.getHeight();
		int width = imp.getWidth();

		ImageProcessor ip = imp.getProcessor();
		int[] rgb = new int[3];
		
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
    }
    
    /* ===============================================================================================================
     * EXECUTIVE CONTROL METHODS
     * ===============================================================================================================
     * Methods to "score" regions of an image to determine a best selection for the user to look at.
     * The contents of the scoring methods are subject to change.
     */
    
    public int selectionScore(ImagePlus imp, Rectangle rect)
    {
        //calculate the score, AKA importance, of this selection
        //In this implementation, the score algorithm is the number of red-isolatable pixels with threshold of 1.5
        int score = 0;
        
        ImageProcessor ip = imp.getProcessor();
        
		int[] rgb = new int[3];
		ip.getPixel(0,0,rgb);
		for(int i = (int)rect.getX(); i < (int)rect.getX() + rect.getWidth(); i++)
        {
            for(int j = (int)rect.getY(); j < (int)rect.getY() + rect.getHeight(); j++)
            {
                ip.getPixel(i, j, rgb);
                if(rgb[0] < rgb[1] * 1.5 || rgb[0] < rgb[2] * 1.5)
                {
                    //edit non-red pixels
                    /*
                    int grayscale = (int)((rgb[0] * 0.21) + (rgb[1] * 0.72) + (rgb[2] * 0.07));
                    rgb[0] = grayscale;
                    rgb[1] = grayscale;
                    rgb[2] = grayscale;
                    ip.putPixel(i, j, rgb);
                    */
                }
                else
                {
                    score++;
                }
            }
        }
        return score;
    }
    
    public Rectangle highestScoreRect(ImagePlus imp)
    {
        int xInterval = imp.getWidth() / 4;
        int yInterval = imp.getHeight() / 4;
        
        Rectangle resultRect = new Rectangle (0, 0, xInterval, yInterval);
        
        
        int maxScore = 0;
        int currentScore = 0;
        for(int i = 0; i <= imp.getWidth() - xInterval; i = i + xInterval)
        {
            for(int j = 0; j <= imp.getHeight() - yInterval; j = j + yInterval)
            {
                Rectangle rect = new Rectangle(i, j, xInterval, yInterval);
                currentScore = selectionScore(imp, rect);
                if(currentScore > maxScore)
                {
                    System.out.println("maxScore = " + currentScore);
                    maxScore = currentScore;
                    resultRect = rect;
                }
            }
        }
        
        return resultRect;
    }
    
    
}
