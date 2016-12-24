package services;

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

public class Segment
{
	ArrayList<Pixel> arr;
	
	public Segment()
	{
		arr = new ArrayList<Pixel>();
	}
	
	public Segment(ArrayList<Pixel> pixels)
	{
		arr = pixels;
	}
	
	public void add(Pixel p){
		arr.add(p);
	}
	
	public ArrayList<Pixel> getSegmentAsList(){
		return arr;
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
	
	public boolean pixelIsOuterBorder(int[][] boundingBox, int w, int h, int x, int y)
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
	
	public boolean coordsInBounds(int width, int height, int x, int y)
	{
		if(x >= width || y >= height || x < 0 || y < 0){
			return false;
		}
		return true;
	}
	
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
	
	
}
