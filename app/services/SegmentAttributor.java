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
		
		attributes.add(this.getSampleStdDevArea(seg));
		attributes.add(this.getSampleStdDevPerimeter(seg));
		
		attributes.add(this.getRelativeX(seg, imp));
		attributes.add(this.getRelativeY(seg, imp));
		attributes.add(this.getRelativeArea(seg, imp));
		
		attributes.add(this.getSegmentCount(seg, segmentTable.getSegmentTableAsList().size()));
		
		//attributes.add(this.getAverageEdgeAngle(seg));
		
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
	
	public SegmentAttribute getSampleStdDevArea(Segment seg){
		return new SegmentAttribute("SAMPLEstdDevArea", segmentTable.getSampleStdDevArea());
	}
	
	public SegmentAttribute getSampleStdDevPerimeter(Segment seg){
		return new SegmentAttribute("SAMPLEstdDevPerimeter", segmentTable.getSampleStdDevPerimeter());
	}
	
	public SegmentAttribute getRelativeX(Segment seg, ImagePlus orig) {
		return new SegmentAttribute("RelativeX", seg.getRelativeX(orig));
	}
	
	public SegmentAttribute getRelativeY(Segment seg, ImagePlus orig) {
		return new SegmentAttribute("RelativeY", seg.getRelativeY(orig));
	}
	
	public SegmentAttribute getRelativeArea(Segment seg, ImagePlus orig) {
		return new SegmentAttribute("RelativeArea", seg.getRelativeArea(orig));
	}
	
	public SegmentAttribute getSegmentCount(Segment seg, int segmentCount) {
		return new SegmentAttribute("SegmentCount", seg.getSegmentCount(segmentCount));
	}
	
	public SegmentAttribute getAverageEdgeAngle(Segment seg) {
		return new SegmentAttribute("AverageEdgeAngle", seg.getAverageEdgeAngle());
	}
	
}
