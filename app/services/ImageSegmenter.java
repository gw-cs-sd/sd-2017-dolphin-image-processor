package services;

/*ImageSegmenter.java
 * Class that takes the mask image and original image as input,
 * and calculates the image segments.
 * Produces SegmentTable.
 */
import ij.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.nio.file.StandardCopyOption;

import ij.ImagePlus;
import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

public class ImageSegmenter
{
    int[][] labels;
    ImagePlus mask;
    ImagePlus orig;
    int currentLabel;
    
    public ImageSegmenter(ImagePlus maskImage, ImagePlus original)
    {
    	mask = maskImage;
        orig = original;
        labels = new int[mask.getWidth()][mask.getHeight()];
        currentLabel = 0;
    }
    
    public int getCurrentLabel()
    {
        return currentLabel;
    }
    
    //ASSUMPTION: getSegmentTable() is called after calculateSegments has been called
    public SegmentTable getSegmentTable()
    {
    	return new SegmentTable(orig, labels);
    }

    /*==========================================================================
     * CALCULATE SEGMENTS
     * =========================================================================
     * Populate the 2D labels array with the input pixels from the Mask Image.
     * This is done by performing a depth-first search on every pixel within the threshold.
     */
    public int[][] calculateSegments()
    {
    	initLabels();
    	currentLabel = 0;
        int height = mask.getHeight();
		int width = mask.getWidth();
		//perform depth first search on every pixel, and label accordingly
		for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
            	Pixel p = getPixel(i, j);
            	if(p.isBlack() && pixelNotMarkedAt(i, j))
            	{
            		dfs(i, j);
            		currentLabel++;
            	}
            }
        }
        
        return labels;
    }
    //----------------------------------------dfs primary--------------------------------------------
    
    public void dfs(int x, int y)
    {
        Pixel p = getPixel(x, y);
        Stack<Pixel> dfsStack= new Stack<Pixel>();
        
        dfsStack.push(p);
        
        while(!dfsStack.isEmpty())
        {
        	p = dfsStack.pop();
        	int i = p.getX();
        	int j = p.getY();
        	
        	if(pixelNotMarkedAt(i, j))
        	{
        		//print p
        		markPixelAt(i, j);
        	}
        	
        	ArrayList<Pixel> neighbors = getNeighborPixels(p);
        	for(Pixel n : neighbors)
            {
        		i = n.getX();
        		j = n.getY();
                if(pixelNotMarkedAt(i, j))
                {
                	dfsStack.push(n);
                }
            }
        }
    }
    
    //----------------------------------------dfs helper functions---------------------------------------
    
    public Pixel getPixel(int x, int y)
    {
        ImageProcessor ip = mask.getProcessor();
        int[] rgb = new int[3];
        ip.getPixel(x, y, rgb);
        Pixel p = new Pixel(x, y, rgb);
        return p;
    }
    
    public boolean pixelNotMarkedAt(int x, int y){
        return labels[x][y] == -1;
    }
    
    public void markPixelAt(int x, int y){
        labels[x][y] = currentLabel;
    }
    
    public ArrayList<Pixel> getNeighborPixels(Pixel p)
    {
        ArrayList<Pixel> neighbors = new ArrayList<Pixel>();
		int x = p.getX();
		int y = p.getY();
		
		Pixel potentialNeighbor;

		if(coordsInBounds(x - 1, y))
		{
		    potentialNeighbor = getPixel(x - 1, y);
		    if(potentialNeighbor.isBlack()){
		        neighbors.add(potentialNeighbor);   
		    }
		}
		if(coordsInBounds(x + 1, y))
		{
		    potentialNeighbor = getPixel(x + 1, y);
		    if(potentialNeighbor.isBlack()){
		        neighbors.add(potentialNeighbor);   
		    }
		}
		if(coordsInBounds(x, y - 1))
		{
		    potentialNeighbor = getPixel(x, y - 1);
		    if(potentialNeighbor.isBlack()){
		        neighbors.add(potentialNeighbor);   
		    }
		}
		if(coordsInBounds(x, y + 1))
		{
		    potentialNeighbor = getPixel(x, y + 1);
		    if(potentialNeighbor.isBlack()){
		        neighbors.add(potentialNeighbor);   
		    }
		}
		
        return neighbors;
    }
    
    public boolean coordsInBounds(int x, int y)
    {
        if(x >= 0 && y >= 0 && x < mask.getWidth() && y < mask.getHeight())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void initLabels()
    {
    	int height = mask.getHeight();
		int width = mask.getWidth();
		for(int i = 0; i < width; i++)
        {
            for(int j = 0; j < height; j++)
            {
            	labels[i][j] = -1;
            }
        }
    }
}