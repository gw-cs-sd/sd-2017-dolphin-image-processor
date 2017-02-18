package wekapack;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import services.*;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;

public class WekaFileWriter
{
	ArrayList<Attribute>	atts;
	ArrayList<String>		attVals;
	Instances			data;
	double[]			vals;
	
	
	public WekaFileWriter()
	{
		
	}
	
	public void convertSATtoARFF(SegAttributesTable sat)
	{
		if(sat.getNumSegments() > 0)
		{
			initAttributes(sat.getAttributes(0));
			initInstanceObject();
			populateData(sat);
			writeDataToFile("public/dolphinImages/test.arff");
		}
		else
		{
			System.out.println("ERROR: SAT is empty");
		}
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
	
	//takes input of type SegAttributesMultiple. Alternatively can be taken from a SAT at index 0.
	public void initAttributes(SegAttributesMultiple segAttsMultiple)
	{
		ArrayList<SegmentAttribute> segAtts = segAttsMultiple.getAttributesAsList();
		int i;
		// 1. set up attributes
	    atts = new ArrayList<Attribute>();
	    // - numeric
	    //pick and choose attributes within for-loop. Some will be omitted
	    for(SegmentAttribute attr : segAtts)
	    {
	    	atts.add(new Attribute(attr.getName()));
	    }
	}
	
	public void initInstanceObject()
	{
		// 2. create Instances object
	    data = new Instances("MyRelation", atts, 0);
	}
	
	//populate all instances in the SAT
	public void populateData(SegAttributesTable sat)
	{
		int numSegments = sat.getNumSegments();
		for(int i = 0; i < numSegments; i++)
		{
			SegAttributesMultiple segAttsMultiple = sat.getAttributes(i);
			populateDataSingle(segAttsMultiple); //call method to populate a single instance
		}
	}
	
	//populate a single instance
	public void populateDataSingle(SegAttributesMultiple segAttsMultiple)
	{
		ArrayList<SegmentAttribute> segAtts = segAttsMultiple.getAttributesAsList();
		vals = new double[data.numAttributes()];
		int i = 0;
		for(SegmentAttribute attr : segAtts)
	    {
			if(attr.getValue() instanceof Double)
			{
			    vals[i] = (double)attr.getValue();
			}
			if(attr.getValue() instanceof Integer)
			{
			    vals[i] = (double)((Integer)attr.getValue()).intValue();
			}
			if(attr.getValue() instanceof Object)
			{
			    //System.out.println("Object");
			}
			//Converts value to Double. May need to change this
			String strVal = attr.getValue().toString();
			System.out.println(attr.getName() + ", " + strVal);
			vals[i] = Double.parseDouble(strVal);
			i++;
	    }
		data.add(new DenseInstance(1.0, vals));
	}
	
}
