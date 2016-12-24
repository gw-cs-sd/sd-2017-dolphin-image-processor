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
	
	public SegmentAttributor(SegmentTable st)
	{
		segmentTable = st;
	}
	
	public SegAttributesTable getSegAttributesTable()
	{
		return new SegAttributesTable(segmentTable, this);
	}
	
	//calculate each attribute and add it to the list of attributes for this segment
	public SegAttributesMultiple getAllAttributes(Segment seg)
	{
		SegAttributesMultiple attributes = new SegAttributesMultiple();
		attributes.add(this.getArea(seg));
		attributes.add(this.getWidth(seg));
		attributes.add(this.getHeight(seg));
		attributes.add(this.getPerimeter(seg));
		return attributes;
	}
	
	//WRAPPER METHODS
	//Wraps pure outputs of attribute calculations as type SegmentAttribute
	//0
	public SegmentAttribute getArea(Segment seg){
		return new SegmentAttribute("Area", new Integer(seg.getArea()));
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
}
