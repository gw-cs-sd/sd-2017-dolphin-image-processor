package services;

import java.util.ArrayList;

public class SegmentHistogram
{
	int[] freqR;
	int[] freqG;
	int[] freqB;
	
	public SegmentHistogram(Segment segment)
	{
		freqR = new int[256];
		freqG = new int[256];
		freqB = new int[256];
		
		init(segment);
	}
	
	public void init(Segment segment)
	{
		ArrayList<Pixel> segList = segment.getSegmentAsList();
		
		for(Pixel p : segList)
		{
			freqR[p.getR()]++;
			freqG[p.getG()]++;
			freqB[p.getB()]++;
		}
	}
	
	public double getStandardDev(int[] arr)
	{
		double mean = getMean(arr);
		double squaredSum = 0;
		double totalNum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i]; j++)
			{
				squaredSum = squaredSum + Math.pow((i - mean), 2);
				totalNum++;
			}
		}
		double result = squaredSum / totalNum;
		result = Math.sqrt(result);
		return result;
	}
	
	public double getMean(int[] arr)
	{
		double sum = 0;
		double totalNum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i]; j++)
			{
				sum = sum + i;
				totalNum++;
			}
		}
		return (sum / totalNum);
	}
	
	public double getStandardDevR()
	{
		return getStandardDev(freqR);
	}
	
	public double getStandardDevG()
	{
		return getStandardDev(freqG);
	}
	
	public double getStandardDevB()
	{
		return getStandardDev(freqB);
	}
}
