package services;

import java.lang.Math;
/*PolarPixel.java
 * 
 */

public class PixelPolar {
	
	double distance;
	double angle;
	int[] rgb;
	
	public PixelPolar(double r, double theta, int[] rgb1)
	{
		distance = r;
		angle = theta;
		rgb = rgb1;
	}
	
	public PixelPolar(Pixel p)
	{
		translateFromPixel(p);
	}
	
	public double getDistance(){
		return distance;
	}
	
	public double getAngle(){
		return angle;
	}
	
	public void translateFromPixel(Pixel p)
	{
		double x = p.getX();
		double y = p.getY();
		
		distance = Math.hypot(x, y);
		angle = Math.atan(x / y);
		rgb = p.getRGB();
	}
	
	public Pixel translateToPixel()
	{
		int x = (int)(distance * Math.cos(angle));
		int y = (int)(distance * Math.sin(angle));
		return new Pixel(x, y, rgb);
	}
	
	public String toString()
    {
    	return "(r=" + distance + ", theta=" + angle + ", R=" + rgb[0] + ", G=" + rgb[1] + ", B=" + rgb[2] + ")";
    }
    
    public String toStringXY()
    {
    	return "(r=" + distance + ", theta=" + angle + ")";
    }
}
