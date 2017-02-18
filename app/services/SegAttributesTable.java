package services;

import ij.*;
import java.util.*;

import db.MySQLCon;

import java.awt.*;
import java.io.File;
import java.nio.file.StandardCopyOption;

import ij.ImagePlus;
import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;
import models.DBSegment;

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
	
	public int getNumSegments()
	{
		return numSegments;
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
	
	public void saveSegmentsToDB(String sampleId)
	{
		MySQLCon db = new MySQLCon();
		
		for(int i = 0; i < numSegments; i++)
		{
			SegAttributesMultiple attrs = attributesTable.get(i);
			ArrayList<SegmentAttribute> arr = attrs.getAttributesAsList();
			
			DBSegment segment = new DBSegment();
			segment.setSampleId(sampleId);
			segment.setLabel(((Integer)i).toString());
			
			//pass the segment attribute derived data to the DBSegment
			for(SegmentAttribute s : arr)
			{
				if(s.getName().equals("Area"))
				{
					segment.setArea(s.getValue().toString());
				}
				if(s.getName().equals("Width"))
				{
					segment.setWidth(s.getValue().toString());
				}
				if(s.getName().equals("Height"))
				{
					segment.setHeight(s.getValue().toString());
				}
				if(s.getName().equals("Perimeter"))
				{
					segment.setPerimeter(s.getValue().toString());
				}
			}
			db.addSegment(segment);
		}
	}
	
	
	
}
