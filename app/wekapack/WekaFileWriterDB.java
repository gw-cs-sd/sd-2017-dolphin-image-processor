package wekapack;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import models.DBSegment;
import services.*;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaFileWriterDB
{
	ArrayList<Attribute>	atts;
	ArrayList<String>		attVals;
	Instances			data;
	double[]			vals;
	
	
	public WekaFileWriterDB()
	{
		
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
		ArrayList<String> segAttNames = seg.getAttributeNamesAsList();
		int i;
		// 1. set up attributes
	    atts = new ArrayList<Attribute>();
	    // - numeric
	    //pick and choose attributes within for-loop. Some will be omitted
	    for(String name : segAttNames)
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
			populateDataSingle(seg); //call method to populate a single instance
		}
		
		return data;
	}
	
	//populate a single instance
	public void populateDataSingle(DBSegment seg)
	{
		vals = new double[data.numAttributes()];
		ArrayList<String> attrList = seg.getAttributeValuesAsList();
		ArrayList<String> attrNameList = seg.getAttributeNamesAsList();
		int i = 0;
		for(String strVal : attrList)
		{
			//System.out.println(i + " : " + strVal);
			if(attrNameList.get(i).equals("bloodStatus"))
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
	
}
