package wekapack;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import models.DBSegment;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaFileWriterAuto {
	ArrayList<Attribute>	atts;
	ArrayList<String>		attVals;
	Instances			data;
	double[]			vals;
	
	ArrayList<String> attributeNames;
	ArrayList<String> attributeFormValues;
	
	public WekaFileWriterAuto()
	{
	}
	
	public WekaFileWriterAuto(ArrayList<String> attrNames, ArrayList<String> attrValues)
	{
		setAttributeNames(attrNames);
		setAttributeFormValues(attrValues);
	}
	
	public void setAttributeNames(ArrayList<String> attrNames)
	{
		attributeNames = attrNames;
	}
	
	public void setAttributeFormValues(ArrayList<String> attrValues)
	{
		attributeFormValues = attrValues;
	}
	
	
	public Instances getInstances()
	{
		return data;
	}
	
	public Instances saveDBSegmentsasInstances(ArrayList<DBSegment> segList)
	{
		Instances result = null;
		if(segList.size() > 0)
		{
			initAttributes(segList.get(0));
			initInstanceObject();
			result = populateData(segList);
			//writeDataToFile("public/dolphinImages/test.arff");
		}
		else
		{
			System.out.println("ERROR: list is empty");
		}
		return result;
	}
	
	public void writeDataToFile(String filepath)
	{
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	            new FileOutputStream(filepath), "utf-8")))
		{
			writer.write(data.toString());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void writeDataToFile(Instances data, String filepath)
	{
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	            new FileOutputStream(filepath), "utf-8")))
		{
			writer.write(data.toString());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public Instances readDataFromFile(String filepath)
	{
		Instances readData = null;
		try
		{
			DataSource source = new DataSource(filepath);
			readData = source.getDataSet();
			// setting class attribute if the data format does not provide this information
			readData.setClassIndex(data.numAttributes() - 1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return readData;
	}
	
	//takes input of type SegAttributesMultiple. Alternatively can be taken from a SAT at index 0.
	public void initAttributes(DBSegment seg)
	{
		int i;
		// 1. set up attributes
		atts = new ArrayList<Attribute>();
		// - numeric
		//pick and choose attributes within for-loop. Some will be omitted
		for(String name : attributeNames)
		{
		    if(name.equals("bloodStatus"))
		    {
		    	// - nominal
		    	attVals = new ArrayList<String>();
		    	attVals.add("blood");
		    	attVals.add("notBlood");
		    	atts.add(new Attribute(name, attVals));
		    }
		    else
		    {
		    	atts.add(new Attribute(name));
		    }
		}
	}
	
	public void initInstanceObject()
	{
		// 2. create Instances object
	    data = new Instances("MyRelation", atts, 0);
	}
	
	//populate all instances in the list of segments
	//return data instances
	public Instances populateData(ArrayList<DBSegment> list)
	{
		int numSegments = list.size();
		for(int i = 0; i < numSegments; i++)
		{
			DBSegment seg = list.get(i);
			ArrayList<String> attributeValues = buildAttributeValuesList(seg);
			populateDataSingle(attributeValues); //call method to populate a single instance
		}
		
		return data;
	}
	
	//populate a single instance
	public void populateDataSingle(ArrayList<String> attributeValues)
	{
		vals = new double[data.numAttributes()];
		int i = 0;
		for(String strVal : attributeValues)
		{
			//System.out.println(i + " : " + strVal);
			if(attributeNames.get(i).equals("bloodStatus"))
			{
				vals[i] = attVals.indexOf(strVal);
			}
			else
			{
				vals[i] = Double.parseDouble(strVal);
			}
			i++;
		}
		data.add(new DenseInstance(1.0, vals));
	}
	
	public ArrayList<String> buildAttributeValuesList(DBSegment seg)
	{
		ArrayList<String> attributeValues = new ArrayList<String>();
		
		for(String formValue : attributeFormValues)
		{
			if(formValue.equals("area"))
			{
				attributeValues.add(seg.getArea());
			}
			if(formValue.equals("width"))
			{
				attributeValues.add(seg.getWidth());
			}
			if(formValue.equals("height"))
			{
				attributeValues.add(seg.getHeight());
			}
			if(formValue.equals("perimeter"))
			{
				attributeValues.add(seg.getPerimeter());
			}
			if(formValue.equals("meanR"))
			{
				attributeValues.add(seg.getMeanR());
			}
			if(formValue.equals("meanG"))
			{
				attributeValues.add(seg.getMeanG());
			}
			if(formValue.equals("meanB"))
			{
				attributeValues.add(seg.getMeanB());
			}
			if(formValue.equals("convexity"))
			{
				attributeValues.add(seg.getConvexity());
			}
			if(formValue.equals("circularity"))
			{
				attributeValues.add(seg.getCircularity());
			}
			if(formValue.equals("stdDevR"))
			{
				attributeValues.add(seg.getStdDevR());
			}
			if(formValue.equals("relativeX"))
			{
				attributeValues.add(seg.getRelativeX());
			}
			if(formValue.equals("relativeY"))
			{
				attributeValues.add(seg.getRelativeY());
			}
			if(formValue.equals("relativeArea"))
			{
				attributeValues.add(seg.getRelativeArea());
			}
			if(formValue.equals("segmentCount"))
			{
				attributeValues.add(seg.getSegmentCount());
			}
		}
		attributeValues.add(seg.getBloodStatus());
		
		/*
		System.out.println("TEST PRINT");
		for(int i = 0; i < attributeNames.size(); i++)
		{
			System.out.println(attributeNames.get(i) + " : " + attributeValues.get(i));
		}
		*/
		return attributeValues;
	}
}
