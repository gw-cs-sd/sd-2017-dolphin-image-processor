/*TrainingSetBuilder.java
 * 
 * Interacts with SampleController to populate the training set according to user's input in the Samples View.
 * 
 * THIS IS THE CLASS WHERE YOU WILL BE CHANGING ATTRIBUTES!!!
 */

package services;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.common.base.Strings;

import db.MySQLCon;
import models.DBSample;
import models.DBSegment;
import play.data.DynamicForm;
import weka.core.Instances;
import wekapack.WekaFileWriterAuto;

public class DataSetBuilder
{
	
	ArrayList<String> attributeNames;
	ArrayList<String> attributeFormValues;
	
	public Instances populateDataSet(DynamicForm requestData, String prefix, String filepath)
	{
		Instances data = null;
        String userId = requestData.get("userId");
        System.out.println("userId:"+userId);
        
        attributeNames = buildAttributeNamesList();
        attributeFormValues = buildAttributeFormValuesList(requestData, attributeNames);
        
        //check if all elements in attributeFormValues are null; i.e. no attributes have been chosen
        if(allElementsAreNull(attributeFormValues))
        {
        	System.out.println("ATTRIBUTE FORM VALUES: ALL ELEMENTS ARE NULL!");
        }
        
        MySQLCon db = new MySQLCon();
        
        //Check all the user's samples to see which ones he/she chose to populate
        ArrayList<DBSample> userSamples = db.getSamples(userId);
        for(DBSample s : userSamples)
        {
        	String currentSampleId = requestData.get(prefix+s.getSampleId());
        	System.out.println("currentSampleId:"+currentSampleId);
        	if(Strings.isNullOrEmpty(currentSampleId))
        	{
        		
        	}
        	else
        	{
        		System.out.println("(currentSampleId NAME):"+db.getSample(currentSampleId).getName());
        		
        		//add all the segments of the current sample to the training set
        		ArrayList<DBSegment> segments = db.getSegments(currentSampleId);
        		data = appendSegmentsToFile(segments, filepath);
        		System.out.println("Added Segments from Sample " + currentSampleId + " to set " + filepath);
        		
        	}
        }
        
        return data;
	}
	
	public Instances populateTrainingSet(DynamicForm requestData)
	{
		String prefix = "training";
		String filepath = "public/wekafiles/training.arff";
		return populateDataSet(requestData, prefix, filepath);
	}
	
	public Instances populateTestSet(DynamicForm requestData)
	{
		String prefix = "test";
		String filepath = "public/wekafiles/test.arff";
		return populateDataSet(requestData, prefix, filepath);
	}
	
	public ArrayList<String> buildAttributeNamesList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("area");
		list.add("width");
		list.add("height");
		list.add("perimeter");
		list.add("meanR");
		list.add("meanG");
		list.add("meanB");
		list.add("convexity");
		list.add("circularity");
		list.add("stdDevR");
		list.add("relativeX");
		list.add("relativeY");
		list.add("relativeArea");
		list.add("segmentCount");
		list.add("bloodStatus");
		return list;
	}
	
	public ArrayList<String> buildAttributeFormValuesList(DynamicForm requestData, ArrayList<String> attributeNames)
	{
		ArrayList<String> attributeFormValues = new ArrayList<String>();
        for(String attrName : attributeNames)
        {
        	String attrFormValue;
        	if(attrName.equals("bloodStatus"))
        	{
        		attrFormValue = "bloodStatus";
        	}
        	else
        	{
        		attrFormValue = requestData.get(attrName);
        	}
        	attributeFormValues.add(attrFormValue);
        	System.out.println(attrName + " : " + attrFormValue);
        }
        
        //REMOVE NULLS from the form values
        int currentIndex = 0;
        Iterator<String> i = attributeFormValues.iterator();
		while (i.hasNext()) {
			String attrVal = i.next();
			System.out.println(attributeNames.get(currentIndex) + " : " + attrVal);
			if(Strings.isNullOrEmpty(attrVal))
			{
				attributeNames.remove(currentIndex);
				i.remove();
				currentIndex--;
			}
			currentIndex++;
		}
		
		
        return attributeFormValues;
	}
	
	//This should be updated to also return an object of type Instances
	public Instances appendSegmentsToFile(ArrayList<DBSegment> list, String filepath)
	{
		WekaFileWriterAuto wfw = new WekaFileWriterAuto(attributeNames, attributeFormValues);
		//Save to File
		//check if file defined by filepath exists
		File file = new File(filepath);
		Instances data;
		if(file.exists())
		{
			Instances existingData = wfw.readDataFromFile(filepath);
			data = wfw.saveDBSegmentsasInstances(list);
			data.addAll(existingData);
			wfw.writeDataToFile(data, filepath);
			System.out.println("Adding to existing " + filepath + " file");
		}
		else
		{
			data = wfw.saveDBSegmentsasInstances(list);
			wfw.writeDataToFile(data, filepath);
			System.out.println("Creating new " + filepath);
		}
		return data;
	}
	
	public void deleteDataSet(String filepath)
	{
		File file = new File(filepath);
		if(file.exists())
		{
			file.delete();
		}
	}
	
	public void deleteTrainingSet()
	{
		String filepath = "public/wekafiles/training.arff";
		deleteDataSet(filepath);
	}
	
	public void deleteTestSet()
	{
		String filepath = "public/wekafiles/test.arff";
		deleteDataSet(filepath);
	}
	
	//check if all values in an arraylist are NULL
	public boolean allElementsAreNull(ArrayList<String> list)
	{
		for(String s : list)
		{
			if(s != null)
			{
				return false;
			}
		}
		return true;
	}
}
