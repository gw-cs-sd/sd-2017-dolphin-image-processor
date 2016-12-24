package services;

/*SegmentTable.java
 * Data structure produced by ImageSegmenter.
 * SegmentTable is a list of segments.
 * Each segment contains all the pixels in each segment of the image.
 * Each segment corresponds to the integer index (label) of its segment.
 * 
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

public class SegmentTable
{
	ArrayList<Segment> segmentTable;
	int[][] labels;
	ImagePlus orig;
	int numSegments;
	
	public SegmentTable(ImagePlus original, int segmentLabels[][])
	{
		labels = segmentLabels;
		orig = original;
		
		//determine number of segments ==> maximum segment number
		numSegments = labels[0][0];
		for(int i = 0; i < orig.getWidth(); i++)
    	{
    		for(int j = 0; j < orig.getHeight(); j++)
    		{
    			if(labels[i][j] > numSegments)
    			{
    				numSegments = labels[i][j];
    			}
    		}	
    	}
		numSegments++;
		
		segmentTable = new ArrayList<Segment>();
    	for(int k = 0; k < numSegments; k++)
    	{
    		segmentTable.add(new Segment());
    	}
    	populate();
	}
	
	//Build a list of sublists. Each index in the list represents a segment label.
	//Each Segment attached to each index is the list of all pixels in that segment.
	public void populate()
	{
		int height = orig.getHeight();
		int width = orig.getWidth();
		
    	for(int i = 0; i < width; i++)
    	{
    		for(int j = 0; j < height; j++)
    		{
    			int segmentLabel = labels[i][j];
    			if(segmentLabel >= 0)
    			{
    				Segment currentSegment = segmentTable.get(segmentLabel);
        			Pixel p = getPixelFromOrig(i, j);
        			currentSegment.add(p);
    			}
    		}
    	}
	}
	
	//return the Segment of the given index segmentLabel
	public Segment getSegment(int segmentLabel)
	{
		return segmentTable.get(segmentLabel);
	}
	
	public int size()
	{
		return segmentTable.size();
	}
	
	//return the index label of the given pixel
	public int getLabel(Pixel p)
	{
		return labels[p.getX()][p.getY()];
	}
	
	public Pixel getPixelFromOrig(int x, int y)
    {
        ImageProcessor ip = orig.getProcessor();
        int[] rgb = new int[3];
        ip.getPixel(x, y, rgb);
        Pixel p = new Pixel(x, y, rgb);
        return p;
    }
	
	public void printTable()
	{
		for(int i = 0; i < numSegments; i++)
		{
			Segment seg = segmentTable.get(i);
			System.out.print(i + ": ");
			seg.print();
			System.out.println();
		}
	}
}