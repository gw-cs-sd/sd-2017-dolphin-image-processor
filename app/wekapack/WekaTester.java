package wekapack;

import weka.classifiers.*;
import weka.classifiers.trees.J48;
import weka.core.Instances;

public class WekaTester
{
	
	public Evaluation runClassifier(Instances train, Instances test)
	{
		/*
		Instances train = readDataFromFile("public/wekafiles/training.arff");
		Instances test = readDataFromFile("public/wekafiles/test.arff");
		*/
		train.setClassIndex(train.numAttributes() - 1);
		test.setClassIndex(test.numAttributes() - 1);
		
		// train classifier
		Classifier cls = new J48();
		Evaluation eval = null;
		try
		{
			cls.buildClassifier(train);
			
			// evaluate classifier and print some statistics
			eval = new Evaluation(train);
			eval.evaluateModel(cls, test);
			System.out.println(eval.toSummaryString("\nSummary Results\n======\n", false));
			
			System.out.println(eval.toMatrixString("\nMatrix Results\n======\n"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return eval;
	}
	
	public Instances readDataFromFile(String filepath)
	{
		WekaFileWriterAuto wfw = new WekaFileWriterAuto();
		return wfw.readDataFromFile(filepath);
	}
}
