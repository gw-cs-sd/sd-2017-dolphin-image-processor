package services;

import ij.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.nio.file.StandardCopyOption;

import ij.ImagePlus;
import ij.gui.PolygonRoi;
import ij.gui.Roi;
import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

public class Segment
{
	ArrayList<Pixel> pixels;
	
	public Segment()
	{
		pixels = new ArrayList<Pixel>();
	}
	
	public Segment(ArrayList<Pixel> arr)
	{
		pixels = arr;
	}
	
	public void add(Pixel p){
		pixels.add(p);
	}
	
	public ArrayList<Pixel> getSegmentAsList(){
		return pixels;
	}
	
	public int getArea(){
		return this.getSegmentAsList().size();
	}
	
	//add 1 to to include min, max, and all pixel lengths in between
	public int getWidth(){
		return getMaxX() - getMinX() + 1;
	}
	
	//add 1 to to include min, max, and all pixel lengths in between
	public int getHeight(){
		return getMaxY() - getMinY() + 1;
	}
	
	public int getMinX()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		int minX = arr.get(0).getX();
		for(Pixel p : arr){
			if(p.getX() < minX){
				minX = p.getX();
			}
		}
		return minX;
	}
	
	public int getMaxX()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		int maxX = arr.get(0).getX();
		for(Pixel p : arr){
			if(p.getX() > maxX){
				maxX = p.getX();
			}
		}
		return maxX;
	}
	
	public int getMinY()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		int minY = arr.get(0).getY();
		for(Pixel p : arr){
			if(p.getY() < minY){
				minY = p.getY();
			}
		}
		return minY;
	}
	
	public int getMaxY()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		int maxY = arr.get(0).getY();
		for(Pixel p : arr){
			if(p.getY() > maxY){
				maxY = p.getY();
			}
		}
		return maxY;
	}
	
	public int getPerimeter()
	{
		int minX = getMinX();
		int minY = getMinY();
		int width = getWidth() + 2;
		int height = getHeight() + 2;
		int[][] boundingBox = new int[width][height];
		ArrayList<Pixel> arr = this.getSegmentAsList();
		for(Pixel p : arr)
		{
			boundingBox[p.getX() - minX + 1][p.getY() - minY + 1] = 1;
		}
		int perimeter = 0;
		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < height; j++)
			{
				if(pixelIsOuterBorder(boundingBox, width, height, i, j))
				{
					perimeter++;
				}
			}
		}
		
		return perimeter;
	}
	
	public int getMeanX()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		int meanX = 0;
		for(Pixel p : arr){
			meanX += p.getX();
		}
		meanX = meanX / arr.size();
		return meanX;
	}
	
	public int getMeanY()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		int meanY = 0;
		for(Pixel p : arr){
			meanY += p.getY();
		}
		meanY = meanY / arr.size();
		return meanY;
	}
	
	public double getCircularity()
	{
		int area = this.getArea();
		int perimeter = this.getPerimeter();
		double circularity = (double)(4 * Math.PI * area) / (double)(perimeter * perimeter);
		if(circularity > 1.0)
		{
			circularity = 1.0;
		}
		return circularity;
	}
	
	public double getConvexity(ImagePlus orig)
	{
		Segment convexHull = this.getConvexHull(orig);
		double convexity = (double)convexHull.getPerimeter() / (double)this.getPerimeter();
		return convexity;
	}
	
	public double getMeanR()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		double meanR = 0;
		for(Pixel p : arr)
		{
			meanR += p.getR();
		}
		meanR = meanR / arr.size();
		return meanR;
	}
	
	public double getMeanG()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		double meanG = 0;
		for(Pixel p : arr)
		{
			meanG += p.getG();
		}
		meanG = meanG / arr.size();
		return meanG;
	}
	
	public double getMeanB()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		double meanB = 0;
		for(Pixel p : arr)
		{
			meanB += p.getB();
		}
		meanB = meanB / arr.size();
		return meanB;
	}
	
	public double getStandardDevR()
	{
		SegmentHistogram hist = new SegmentHistogram(this);
		return hist.getStandardDevR();
	}
	
	public double getStandardDevG()
	{
		SegmentHistogram hist = new SegmentHistogram(this);
		return hist.getStandardDevG();
	}
	
	public double getStandardDevB()
	{
		SegmentHistogram hist = new SegmentHistogram(this);
		return hist.getStandardDevB();
	}
	
	public double getAverageEdgeAngle()
	{
		int minX = getMinX();
		int minY = getMinY();
		int width = getWidth() + 2;
		int height = getHeight() + 2;
		int[][] boundingBox = new int[width][height];
		ArrayList<Pixel> arr = this.getSegmentAsList();
		for(Pixel p : arr)
		{
			boundingBox[p.getX() - minX + 1][p.getY() - minY + 1] = 1;
		}
		int xStart = 0;
		while(!pixelIsOuterBorder(boundingBox, width, height, xStart, 1))
		{
			xStart++;
		}
		
		ConvexHullCalculator angleCalculator = new ConvexHullCalculator(); //used for calculating angle (radians)
		ArrayList<Double> angleList = new ArrayList<Double>(); //contains the angles iteratively
		boolean done = false;
		int i = xStart;
		int j = 1;
		int currentState = 0;
		int currentX = i;
		int currentY = j;
		while(!done)
		{
			System.out.println("CURRENT STATE = " + currentState);
			System.out.println("i = " + i);
			System.out.println("j = " + j);
			System.out.println("currentX = " + currentX);
			System.out.println("currentY = " + currentY);
			switch(currentState)
			{
			case 0:	currentX = i + 1;
					currentY = j;
					break;
			case 1:	currentX = i + 1;
					currentY = j + 1;
					break;
			case 2:	currentX = i;
					currentY = j + 1;
					break;
			case 3:	currentX = i - 1;
					currentY = j + 1;
					break;
			case 4:	currentX = i - 1;
					currentY = j;
					break;
			case 5:	currentX = i - 1;
					currentY = j - 1;
					break;
			case 6:	currentX = i;
					currentY = j - 1;
					break;
			case 7:	currentX = i + 1;
					currentY = j - 1;
					break;
			}
			
			double xDiff = currentX - i;
			double yDiff = currentY - j;
			double angle = angleCalculator.angle(xDiff, yDiff);
			if(pixelIsOuterBorder(boundingBox, width, height, currentX, currentY))
			{
				angleList.add(angle);
				boundingBox[i][j] = 2; //mark pixel i,j as visited
				i = currentX;
				j = currentY;
				currentState = 0;
			}
			else
			{
				currentState++;
			}
			
			if(currentState >= 8)
			{
				done = true;
			}
		}
		double averageAngle = angleList.stream().mapToDouble(a -> a).average().getAsDouble(); //playing with java 8 stream
		System.out.println("AVERAGE EDGE ANGLE = " + averageAngle);
		return averageAngle;
	}
	
	/*============================================================================
	 * METHODS WITH RESPECT TO A SEGMENTCOUNT
	 *============================================================================
	 */
	
	public int getSegmentCount(int segmentCount)
	{
		return segmentCount;
	}
	
	/*============================================================================
	 * METHODS WITH RESPECT TO AN IMAGEPLUS
	 *============================================================================
	 */
	
	//paint the perimeter of this segment with respect to the target image imp
	public void paintPerimeter(ImagePlus imp)
	{
		int minX = getMinX();
		int minY = getMinY();
		int width = getWidth() + 2;
		int height = getHeight() + 2;
		int[][] boundingBox = new int[width][height];
		ArrayList<Pixel> arr = this.getSegmentAsList();
		for(Pixel p : arr)
		{
			boundingBox[p.getX() - minX + 1][p.getY() - minY + 1] = 1;
		}
		ImageProcessor ip = imp.getProcessor();
		int[] yellowPixel = {255, 255, 0};
		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < height; j++)
			{
				if(pixelIsOuterBorder(boundingBox, width, height, i, j))
				{
					ip.putPixel(i + minX, j + minY, yellowPixel);
				}
			}
		}
	}
	
	public Roi setBoundingBoxRoi(ImagePlus imp)
	{
		int minX = getMinX();
		int minY = getMinY();
		int width = getWidth() + 2;
		int height = getHeight() + 2;
		Roi roi = new Roi(minX, minY, width, height);
		imp.setRoi(roi);
		return roi;
	}
	
	public double getRelativeX(ImagePlus imp)
	{
		double meanX = this.getMeanX();
		double maxX = imp.getWidth() - 1;
		
		return meanX / maxX;
	}
	
	public double getRelativeY(ImagePlus imp)
	{
		double meanY = this.getMeanY();
		double maxY = imp.getHeight() - 1;
		return meanY / maxY;
	}
	
	public double getRelativeArea(ImagePlus imp)
	{
		double segArea = this.getArea();
		double width = imp.getWidth();
		double height = imp.getHeight();
		double totalArea = width * height;
		return segArea / totalArea;
	}
	
	/*============================================================================
	 * CONVEX HULL HELPER METHODS
	 *============================================================================
	 */
	
	public Polygon getSegmentAsPolygon()
	{
		Polygon polygon = new Polygon();
		int minX = getMinX();
		int minY = getMinY();
		int width = getWidth() + 2;
		int height = getHeight() + 2;
		int[][] boundingBox = new int[width][height];
		ArrayList<Pixel> arr = this.getSegmentAsList();
		for(Pixel p : arr)
		{
			boundingBox[p.getX() - minX + 1][p.getY() - minY + 1] = 1;
		}
		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < height; j++)
			{
				if(pixelIsOuterBorder(boundingBox, width, height, i, j))
				{
					polygon.addPoint(i, j);
				}
			}
		}
		return polygon;
	}
	
	public Pixel getMinYPixel()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		Pixel minYPixel = arr.get(0);
		for(Pixel p : arr){
			if(p.getY() < minYPixel.getY()){
				minYPixel = p;
			}
		}
		for(Pixel p : arr){
			if(p.getY() <= minYPixel.getY() && p.getX() < minYPixel.getX()){
				minYPixel = p;
			}
		}
		return minYPixel;
	}
	
	/*=================================================================================
	 * DEMONSTRATION/TESTING METHODS
	 * ================================================================================
	 */
	
	public void print()
	{
		ArrayList<Pixel> arr = this.getSegmentAsList();
		System.out.print("[");
		for(Pixel p : arr)
		{
			System.out.print(p.toStringXY() + ", ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	/* ================================================================================
	 * SECONDARY METHODS
	 * ================================================================================
	 */
	
	public Segment getConvexHull(ImagePlus orig)
	{
		ConvexHullCalculator chc = new ConvexHullCalculator();
		Segment convexHull = chc.convexHullSegment(this, orig);
		return convexHull;
	}
	
	private boolean pixelIsOuterBorder(int[][] boundingBox, int w, int h, int x, int y)
	{
		if(coordsInBounds(w, h, x, y) && boundingBox[x][y] == 0)
		{
			if(coordsInBounds(w, h, x + 1, y) && boundingBox[x + 1][y] == 1){
				return true;
			}
			if(coordsInBounds(w, h, x - 1, y) && boundingBox[x - 1][y] == 1){
				return true;
			}
			if(coordsInBounds(w, h, x, y + 1) && boundingBox[x][y + 1] == 1){
				return true;
			}
			if(coordsInBounds(w, h, x, y - 1) && boundingBox[x][y - 1] == 1){
				return true;
			}
		}
		return false;
	}
	
	private boolean coordsInBounds(int width, int height, int x, int y)
	{
		if(x >= width || y >= height || x < 0 || y < 0){
			return false;
		}
		return true;
	}
	
	
}
