package services;

public class SegmentAttribute
{
	String name;
	Object value;
	
	public SegmentAttribute(String attrName, Object attrValue)
	{
		name = attrName;
		value = attrValue;
	}
	
	public String toString()
	{
		return ("(" + name + ", " + value.toString() + ")");
	}
}
