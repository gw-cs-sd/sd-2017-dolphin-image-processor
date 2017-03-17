package wekapack;

import weka.classifiers.*;
import weka.classifiers.trees.J48;
import weka.core.Instances;

public class WekaTester
{
	
	public void runClassifier(Instances train, Instances test)
	{
		/*
		Instances train = readDataFromFile("public/wekafiles/training.arff");
		Instances test = readDataFromFile("public/wekafiles/test.arff");
		*/
		train.setClassIndex(train.numAttributes() - 1);
		test.setClassIndex(test.numAttributes() - 1);
		
		// train classifier
		Classifier cls = new J48();
		try
		{
			cls.buildClassifier(train);
			
			// evaluate classifier and print some statistics
			Evaluation eval = new Evaluation(train);
			eval.evaluateModel(cls, test);
			System.out.println(eval.toSummaryString("\nResults\n======\n", false));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public Instances readDataFromFile(String filepath)
	{
		WekaFileWriterAuto wfw = new WekaFileWriterAuto();
		return wfw.readDataFromFile(filepath);
	}
}
