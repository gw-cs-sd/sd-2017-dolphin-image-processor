package models;

import java.sql.Date;

public class DBSample
{
	String sampleId;
	String userId;
	String name;
	Date dateCreated;
	String R;
	String G;
	String B;
	String segmentCount;
	String width;
	String height;
	String numBytes;
	String comment;
	String bloodStatus;
	//automatically made getters and setters with eclipse
	//so that's kinda cool
	public String getSampleId() {
		return sampleId;
	}
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getR() {
		return R;
	}
	public void setR(String r) {
		R = r;
	}
	public String getG() {
		return G;
	}
	public void setG(String g) {
		G = g;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getSegmentCount() {
		return segmentCount;
	}
	public void setSegmentCount(String segmentCount) {
		this.segmentCount = segmentCount;
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
	public String getNumBytes() {
		return numBytes;
	}
	public void setNumBytes(String numBytes) {
		this.numBytes = numBytes;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getBloodStatus() {
		return bloodStatus;
	}
	public void setBloodStatus(String bloodStatus) {
		this.bloodStatus = bloodStatus;
	}
	
}
