package services;

import java.util.ArrayList;

import db.MySQLCon;
import models.DBSample;
import models.DBSegment;
import weka.classifiers.Evaluation;
import weka.core.Attribute;
import weka.core.Instances;
import wekapack.WekaFileWriterAuto;
import wekapack.WekaTester;

public class SingleUploadTrainer {
	
	public SingleUploadTrainer()
	{
		
	}
	
	public Instances trainSingleSample(String sampleId, String permTrainingFilepath, boolean update)
	{
		System.out.println("TRAIN SINGLE SAMPLE");
		WekaFileWriterAuto wfw = new WekaFileWriterAuto();
		//String permTrainingFilepath = "public/wekafiles/training.arff"; //path subject to change
		Instances permTrainingSet = wfw.readDataFromFile(permTrainingFilepath);
		
		//determine which attributes are in the perm training set
		int numAttributes = permTrainingSet.numAttributes();
		ArrayList<String> attributeNames = new ArrayList<String>();
		for(int i = 0; i < numAttributes; i++)
		{
			Attribute attribute = permTrainingSet.attribute(i);
			String attrName = attribute.name();
			attributeNames.add(attrName);
			System.out.println("Attribute : " + attrName);
		}
		wfw.setAttributeNames(attributeNames);
		wfw.setAttributeFormValues(attributeNames);
		
		//write the actual segment values into an Instances object
		MySQLCon db = new MySQLCon();
		ArrayList<DBSegment> segments = db.getSegments(sampleId);
		
		
		wfw.saveDBSegmentsasInstances(segments);
		Instances singleUploadTestSet = wfw.populateData(segments);
		//wfw.writeDataToFile(singleUploadTestSet, singleUploadTestFilepath);
		
		//run evaluation with this training and test set
		WekaTester wekaTester = new WekaTester();
		Evaluation eval = wekaTester.runClassifier(permTrainingSet, singleUploadTestSet);
		
		//determine if the sample is blood
		if(update == true)
		{
			double percentNotBlood = eval.pctCorrect();
			double percentBlood = eval.pctIncorrect();
			System.out.println("percentNotBlood = " + percentNotBlood);
			System.out.println("percentBlood = " + percentBlood);
			
			double confidence = Math.abs(percentNotBlood - percentBlood);
			String classifiedBloodStatus;
			if(percentBlood > percentNotBlood)
			{
				System.out.println("This image is BLOOD with " + confidence + "% confidence.");
				classifiedBloodStatus = "blood";
			}
			else
			{
				System.out.println("This image is NOT BLOOD with " + confidence + "% confidence.");
				classifiedBloodStatus = "notBlood";
			}
			
			//if there are no segments in the sample, classify it as NOT BLOOD
			DBSample sample = db.getSample(sampleId);
			int segmentCount = Integer.parseInt(sample.getSegmentCount());
			if(segmentCount == 0)
			{
				System.out.println("segmentCount == 0");
				classifiedBloodStatus = "notBlood";
			}
			
				//update DB with the newly classified blood status
				db.updateBloodStatus(sampleId, classifiedBloodStatus);
		}
		
		return singleUploadTestSet;
	}
}
