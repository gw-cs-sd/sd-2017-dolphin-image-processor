/* ConvexHullCalculator.java
 * Returns the Convex Hull of a Segment as an object of type Segment.
 * 
 */

package services;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;

import ij.ImagePlus;
import ij.gui.Line;
import ij.gui.PolygonRoi;
import ij.gui.Roi;
import ij.process.FloatPolygon;
import ij.process.FloodFiller;
import ij.process.ImageProcessor;

public class ConvexHullCalculator
{
    
    public Segment convexHullSegment(Segment segment, ImagePlus imp)
    {
    	PolygonRoi roi = convexHullRoi(segment, imp);
    	Segment convexHull = convertRoiToSegment(roi, imp);
    	//System.out.println("Convex Hull SEGMENT perimeter = " + convexHull.getPerimeter());
    	/*
    	if convex Hull area is less than the original segment's area,
    	correct this by assigning the convex hull as the segment
    	*/
    	if(convexHull.getArea() < segment.getArea()
    			|| convexHull.getPerimeter() > segment.getPerimeter())
    	{
    		convexHull = segment;
    	}
    	return convexHull;
    }
    
    public PolygonRoi convexHullRoi(Segment segment, ImagePlus imp)
    {
    	Polygon polygon = new Polygon();
    	
    	ArrayList<Pixel> segList = segment.getSegmentAsList();
    	ArrayList<Pixel> convexHullPixels = new ArrayList<Pixel>();
    	//convexHullPixels is a superset of segList
    	for(Pixel p : segList){
    		convexHullPixels.add(p);
    	}
    	
    	Pixel minYPixel = segment.getMinYPixel();
    	Pixel currentPixel = minYPixel;
    	
    	Pixel minAnglePixel;
    	double currentAngle = 0;
    	boolean done = false;
    	while(!done)
    	{
    		minAnglePixel = null;
    		double minAngle = Double.MAX_VALUE;
    		double minDistance = Double.MIN_VALUE;
    		double angle = Double.MAX_VALUE;
    		//Find a Pixel at the smallest angle relative to this one
    		for(Pixel p : segList)
    		{
    			double x = (double)(p.getX() - currentPixel.getX());
    			double y = (double)(p.getY() - currentPixel.getY());
    			angle = angle(x, y);
    			double distance = distance(x, y);
    			if(angle >= currentAngle && angle <= minAngle)
    			{
    				minAngle = angle;
    				minAnglePixel = p;
    				minDistance = distance;
    			}
    		}
    		
    		//Find the FARTHEST Pixel at that minimum angle
    		for(Pixel p : segList)
    		{
    			double x = (double)(p.getX() - currentPixel.getX());
    			double y = (double)(p.getY() - currentPixel.getY());
    			angle = angle(x, y);
    			double distance = distance(x, y);
    			if(angle == minAngle && distance > minDistance)
    			{
    				minAnglePixel = p;
    				minDistance = distance;
    			}
    		}
    		
    		if(minYPixel.equals(minAnglePixel) || minAnglePixel == null)
    		{
    			done = true;
    			minAnglePixel = minYPixel;
    			double x = (double)(minAnglePixel.getX() - currentPixel.getX());
    			double y = (double)(minAnglePixel.getY() - currentPixel.getY());
    			minDistance = distance(x, y);
    		}
    		
    		//drawLine(imp, currentPixel.getX(), currentPixel.getY(), minAnglePixel.getX(), minAnglePixel.getY());
    		addPolygonPoint(polygon, minAnglePixel, minAngle);
    		currentPixel = minAnglePixel;
    		currentAngle = minAngle;
    	}
    	
    	PolygonRoi roi = new PolygonRoi(polygon, Roi.POLYGON);
    	return roi;
    }
    
    public Segment convertRoiToSegment(Roi roi, ImagePlus orig)
    {
    	Segment segment = new Segment();
    	Rectangle boundingRect = roi.getBounds();
    	int minX = (int)boundingRect.getX();
    	int minY = (int)boundingRect.getY();
    	int maxX = minX + (int)boundingRect.getWidth();
    	int maxY = minY + (int)boundingRect.getHeight();
    	
    	DolphinAnalyzer da = new DolphinAnalyzer();
    	for(int i = minX; i < maxX; i++)
    	{
    		for(int j = minY; j < maxY; j++)
    		{
    			if(roi.contains(i, j))
    			{
    				Pixel pixel = da.getPixel(orig, i, j);
    				segment.add(pixel);
    				//System.out.println("Convex Hull: Add Point " + pixel.toStringXY());
    			}
    		}
    	}
    	return segment;
    }
    
    //get the pure angle (radians) of a DIRECTION: x units in the x direction, y units in the y direction
    public double angle(double x, double y)
    {
		double theta = 0;
		double xPos = Math.abs(x);
		double yPos = Math.abs(y);

		//x positive, y positive
		if(x >= 0 && y >= 0)
		{
			theta = Math.atan(yPos / xPos);
		}
		//x negative, y positive
		else if(x <= 0 && y >= 0)
		{
			theta = complement(Math.atan(yPos / xPos)) + (Math.PI / 2);
		}
		//x negative, y negative
		else if(x <= 0 && y <= 0)
		{
			theta = Math.atan(yPos / xPos) + Math.PI;
		}
		//x positive, y negative
		else if(x >= 0 && y <= 0)
		{
			theta = complement(Math.atan(yPos / xPos)) + (3 * Math.PI / 2);
		}
    	return theta;
    }
    
    public double distance(double x, double y)
    {
    	double xPos = Math.abs(x);
		double yPos = Math.abs(y);
    	return Math.hypot(xPos, yPos);
    }
    
    public static double complement(double theta)
	{
		return (Math.PI / 2) - theta;
	}
    
    public void addPolygonPoint(Polygon polygon, Pixel pixel, double angle)
    {
    	int x = pixel.getX();
		int y = pixel.getY();
		
		//because imageJ Polygon draws the point at the top left of the pixel
		if(((angle >= 0) && (angle < Math.PI / 4))
				|| ((angle >= 7 * Math.PI / 4) && (angle < 2 * Math.PI)))
		{
			x++;
		}
		else if((angle >= Math.PI / 4) && (angle < 3 * Math.PI / 4))
		{
			x++;
			y++;
		}
		else if((angle >= 3 * Math.PI / 4) && (angle < 5 * Math.PI / 4))
		{
			y++;
		}
		polygon.addPoint(x, y);
    }
    
    /*===========================================================================
     * DEMONSTRATION/TESTING METHODS
     * ==========================================================================
     */
    public void drawConvexHulls(ArrayList<Segment> arr, ImagePlus imp)
    {
    	for(Segment s : arr)
    	{
    		Segment cvs = convexHullSegment(s, imp);
    		System.out.println("=====================================");
    		System.out.println("Segment Center = (" + s.getMeanX() + ", " + s.getMeanY() + ")");
    		System.out.println("Segment Perimeter = " + s.getPerimeter());
    		System.out.println("Convex Hull Perimeter = " + cvs.getPerimeter());
    	}
    }
    
    public void drawLine(ImagePlus imp, int x1, int y1, int x2, int y2)
    {
    	ImageProcessor ip = imp.getProcessor();
    	ip.setColor(Color.RED);
    	ip.drawLine(x1, y1, x2, y2);
    }
    
    public void drawPolygon(ImagePlus imp, Segment seg)
    {
    	ImageProcessor ip = imp.getProcessor();
    	Polygon polygon = seg.getSegmentAsPolygon();
    	PolygonRoi roi = new PolygonRoi(polygon, Roi.POLYGON);
    	imp.setRoi(roi);
    }
    
}
