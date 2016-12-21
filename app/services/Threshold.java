package services;

/*Threshold.java
 * This is a class that stores two Color objects to determine the color threshold.
 * Color Objects are defined as minimum and maximum.
 * When the image is processed, pixels within the threshold are included in the image segments.
 * Pixels outside the threshold are ignored.
 */

import ij.*;
import java.util.*;
import java.awt.*;
import java.io.File;
import java.nio.file.StandardCopyOption;

import ij.ImagePlus;
import ij.process.ImageConverter;
import ij.io.Opener;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

public class Threshold
{
    private Color min;
    private Color max;
    
    //Assumptions:
    //minimum is less than maximum
    public Threshold(Color minimum, Color maximum)
    {
        //should we pass by value?
        min = minimum;
        max = maximum;
    }
    
    public int getMinRed()
    {
        return min.getRed();
    }
    
    public int getMaxRed()
    {
        return max.getRed();
    }
    
    public int getMinGreen()
    {
        return min.getGreen();
    }
    
    public int getMaxGreen()
    {
        return max.getGreen();
    }
    
    public int getMinBlue()
    {
        return min.getBlue();
    }
    
    public int getMaxBlue()
    {
        return max.getBlue();
    }
}