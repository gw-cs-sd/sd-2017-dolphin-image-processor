package services;

/*Pixel.java
 * Pixel class that includes x,y location and RGB values.
 * Includes helper methods for Thresholding and Segmentation steps.
 * 
 */
public class Pixel
{
    private int x;
    private int y;
    private int rgb[];
    
    public Pixel(int x1, int y1, int[] rgb1)
    {
        x = x1;
        y = y1;
        
        rgb = new int[3];
        for(int i = 0; i < 3; i++)
        {
            rgb[i] = rgb1[i];
        }
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int[] getRGB()
    {
        return rgb;
    }

    public boolean isBackground(Threshold thresh)
    {
        if(rgb[0] < thresh.getMinRed() || rgb[0] > thresh.getMaxRed()
            || rgb[1] < thresh.getMinGreen() || rgb[1] > thresh.getMaxGreen()
            || rgb[2] < thresh.getMinBlue() || rgb[2] > thresh.getMaxBlue())
        {
            return false;
        }
        
        return true;
    }
    
    public boolean isBlack()
    {
        for(int i = 0; i < 3; i++)
        {
            if(rgb[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean isWhite()
    {
        for(int i = 0; i < 3; i++)
        {
            if(rgb[i] != 255)
            {
                return false;
            }
        }
        return true;
    }
    
    public String toString()
    {
    	return "(x=" + x + ", y=" + y + ", R=" + rgb[0] + ", G=" + rgb[1] + ", B=" + rgb[2] + ")";
    }
    
    public String toStringXY()
    {
    	return "(x=" + x + ", y=" + y + ")";
    }
}