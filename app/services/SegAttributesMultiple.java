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

public class SegAttributesMultiple
{
	ArrayList<SegmentAttribute> arr;
	
	public SegAttributesMultiple()
	{
		arr = new ArrayList<SegmentAttribute>();
	}
	
	public SegAttributesMultiple(ArrayList<SegmentAttribute> attrs)
	{
		arr = attrs;
	}
	
	public void add(SegmentAttribute attr)
	{
		arr.add(attr);
	}
	
	public ArrayList<SegmentAttribute> getAttributesAsList()
	{
		return arr;
	}
	
}
