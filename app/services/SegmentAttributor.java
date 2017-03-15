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

public class SegmentAttributor {
	
	SegmentTable segmentTable;
	ImagePlus imp;
	
	public SegmentAttributor(SegmentTable st, ImagePlus image)
	{
		segmentTable = st;
		imp = image;
	}
	
	public SegAttributesTable getSegAttributesTable()
	{
		return new SegAttributesTable(segmentTable, this);
	}
	
	public ImagePlus getImage()
	{
		return imp;
	}
	
	//calculate each attribute and add it to the list of attributes for this segment
	public SegAttributesMultiple getAllAttributes(Segment seg)
	{
		SegAttributesMultiple attributes = new SegAttributesMultiple();
		attributes.add(this.getArea(seg));
		attributes.add(this.getWidth(seg));
		attributes.add(this.getHeight(seg));
		attributes.add(this.getPerimeter(seg));
		attributes.add(this.getMeanR(seg));
		attributes.add(this.getMeanG(seg));
		attributes.add(this.getMeanB(seg));
		
		attributes.add(this.getCircularity(seg));
		attributes.add(this.getConvexity(seg, imp));
		attributes.add(this.getStandardDevR(seg));
		
		
		return attributes;
	}
	
	//WRAPPER METHODS
	//Wraps pure outputs of attribute calculations as type SegmentAttribute
	//0
	public SegmentAttribute getArea(Segment seg){
		return new SegmentAttribute("Area", seg.getArea());
	}
	
	//1
	public SegmentAttribute getWidth(Segment seg){
		return new SegmentAttribute("Width", seg.getWidth());
	}
	
	//2
	public SegmentAttribute getHeight(Segment seg){
		return new SegmentAttribute("Height", seg.getHeight());
	}
	
	//3
	public SegmentAttribute getPerimeter(Segment seg){
		return new SegmentAttribute("Perimeter", seg.getPerimeter());
	}
	
	public SegmentAttribute getMeanR(Segment seg){
		return new SegmentAttribute("MeanR", seg.getMeanR());
	}
	
	public SegmentAttribute getMeanG(Segment seg){
		return new SegmentAttribute("MeanG", seg.getMeanG());
	}
	
	public SegmentAttribute getMeanB(Segment seg){
		return new SegmentAttribute("MeanB", seg.getMeanB());
	}
	
	//4
	public SegmentAttribute getCircularity(Segment seg){
		return new SegmentAttribute("Circularity", seg.getCircularity());
	}
	
	//5
	public SegmentAttribute getConvexity(Segment seg, ImagePlus orig){
		return new SegmentAttribute("Convexity", seg.getConvexity(orig));
	}
	
	public SegmentAttribute getStandardDevR(Segment seg){
		return new SegmentAttribute("StandardDevR", seg.getStandardDevR());
	}
	
}
