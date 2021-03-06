package models;

import java.util.ArrayList;

public class DBSegment
{
	private String segmentId;
	private String sampleId;
	private String label;
	private String area;
	private String width;
	private String height;
	private String perimeter;
	private String meanR;
	private String meanG;
	private String meanB;
	private String convexity;
	private String circularity;
	private String stdDevR;
	private String relativeX;
	private String relativeY;
	private String relativeArea;
	private String segmentCount;
	private String bloodStatus;

	/*
	 * THESE 2 METHODS ARE THE PRIMARY COMMUNICATION WITH WEKA:
	 * getAttributeNamesAsList()
	 * getAttributeValuesAsList()
	 * 
	 */
	
	public ArrayList<String> getAttributeNamesAsList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("areaByPerimeter");
		//list.add("width");
		//list.add("height");
		//list.add("perimeter");
		list.add("convexity");
		list.add("circularity");
		list.add("meanR");
		list.add("stdDevR");
		list.add("bloodStatus");
		
		return list;
	}
	
	public ArrayList<String> getAttributeValuesAsList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add(((Double)(Double.parseDouble(area) / Double.parseDouble(perimeter))).toString());
		//list.add(width);
		//list.add(height);
		//list.add(perimeter);
		list.add(convexity);
		list.add(circularity);
		list.add(meanR);
		list.add(stdDevR);
		list.add(bloodStatus);
		
		return list;
	}
	
	public String getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}
	public String getSampleId() {
		return sampleId;
	}
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(String perimeter) {
		this.perimeter = perimeter;
	}
	public String getMeanR() {
		return meanR;
	}
	public void setMeanR(String meanR) {
		this.meanR = meanR;
	}
	public String getMeanG() {
		return meanG;
	}
	public void setMeanG(String meanG) {
		this.meanG = meanG;
	}
	public String getMeanB() {
		return meanB;
	}
	public void setMeanB(String meanB) {
		this.meanB = meanB;
	}
	
	public String getConvexity() {
		return convexity;
	}

	public void setConvexity(String convexity) {
		this.convexity = convexity;
	}

	public String getCircularity() {
		return circularity;
	}

	public void setCircularity(String circularity) {
		this.circularity = circularity;
	}
	
	public String getStdDevR() {
		return stdDevR;
	}

	public void setStdDevR(String stdDevR) {
		this.stdDevR = stdDevR;
	}
	public String getRelativeX() {
		return relativeX;
	}
	public void setRelativeX(String relativeX) {
		this.relativeX = relativeX;
	}
	public String getRelativeY() {
		return relativeY;
	}
	public void setRelativeY(String relativeY) {
		this.relativeY = relativeY;
	}
	public String getRelativeArea() {
		return relativeArea;
	}
	public void setRelativeArea(String relativeArea) {
		this.relativeArea = relativeArea;
	}
	public String getSegmentCount() {
		return segmentCount;
	}
	public void setSegmentCount(String segmentCount) {
		this.segmentCount = segmentCount;
	}
	public String getBloodStatus() {
		return bloodStatus;
	}
	public void setBloodStatus(String bloodStatus) {
		this.bloodStatus = bloodStatus;
	}
}
