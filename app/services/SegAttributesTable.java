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

public class SegAttributesTable {
	
	ArrayList<SegAttributesMultiple> attributesTable;
	SegmentTable segmentTable;
	SegmentAttributor attributor;
	int numSegments;
	
	public SegAttributesTable(SegmentTable st, SegmentAttributor sa)
	{
		attributesTable = new ArrayList<SegAttributesMultiple>();
		segmentTable = st;
		attributor = sa;
		numSegments = segmentTable.size();
		populate();
	}
	
	public SegAttributesMultiple getAttributes(int segmentLabel)
	{
		return attributesTable.get(segmentLabel);
	}
	
	public void populate()
	{
		for(int i = 0; i < numSegments; i++)
		{
			Segment seg = segmentTable.getSegment(i);
			SegAttributesMultiple attributes = attributor.getAllAttributes(seg);
			attributesTable.add(attributes);
		}
	}
	
	public void printTable()
	{
		for(int i = 0; i < numSegments; i++)
		{
			SegAttributesMultiple attrs = attributesTable.get(i);
			ArrayList<SegmentAttribute> arr = attrs.getAttributesAsList();
			System.out.print(i + ": ");
			for(SegmentAttribute s : arr)
			{
				System.out.print(s.toString() + ", ");
			}
			System.out.println();
		}
	}
	
	
	
}
