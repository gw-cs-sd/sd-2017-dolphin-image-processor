package services;

import ij.*; 
import ij.process.*; 
import ij.gui.*; 
import java.awt.*; 
import ij.plugin.frame.*; 
import ij.IJ.*; 
import ij.ImagePlus.*; 

public class GenericDialog_Test extends PlugInFrame { 

 public GenericDialog_Test() { 
   super("Testing"); 
 } 

 public void run(String arg) { 
  double width=0.0; 
  double height=0.0; 
  boolean validInputs = false; 

  while (!validInputs) { 
   GenericDialog dialog = new GenericDialog("Tools"); 

   String choices[] = new String[2];
   choices[0] = "Yes";
   choices[1] = "No";
   dialog.addChoice("Zoom to selection?", choices, "-"); 
   validInputs = true; 
   dialog.showDialog(); 

   if (dialog.wasCanceled()) return; 

  } 

  //Of course, here I would call a function to do calculations 
  IJ.showMessage("Inputs were " + width + ", " + height); 
  return; 
  } 
} 