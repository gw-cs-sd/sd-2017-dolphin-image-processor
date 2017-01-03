package services;

public class SegmentAttribute
{
	private String name;
	private Object value;
	
	public SegmentAttribute(String attrName, Object attrValue)
	{
		name = attrName;
		value = attrValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String toString()
	{
		return ("(" + name + ", " + value.toString() + ")");
	}
}
