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
	private String bloodStatus;

	public ArrayList<String> getAttributeNamesAsList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("area");
		list.add("width");
		list.add("height");
		list.add("perimeter");
		list.add("bloodStatus");
		
		return list;
	}
	
	public ArrayList<String> getAttributeValuesAsList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add(area);
		list.add(width);
		list.add(height);
		list.add(perimeter);
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

	public String getBloodStatus() {
		return bloodStatus;
	}
	public void setBloodStatus(String bloodStatus) {
		this.bloodStatus = bloodStatus;
	}
}
