package services;

import ij.*; 
import ij.process.*; 
import ij.gui.*; 
import java.awt.*; 
import ij.plugin.frame.*; 
import ij.plugin.PlugIn; 
import ij.IJ.*; 
import ij.ImagePlus.*; 

public class GenericDialog_Test implements PlugIn, DialogListener{ 
 private String divider = "----------";
 private String defaultText = "abcdef";
 String text;

 public void run(String arg) 
 { 
	showDialog();
	IJ.log("run() Text: "+text);
 }

 void showDialog() {

  GenericDialog gd = new GenericDialog("Dolphin");
  gd.addStringField("Text: ", defaultText);
  gd.addMessage(divider+"\n"+defaultText+"\n"+divider);
  gd.addDialogListener(this);
  gd.showDialog(); 
  gd.centerDialog(true);
  //if(dialog.wasOKed()) IJ.run("To Selection");

  //Of course, here I would call a function to do calculations 
 }

 public boolean dialogItemChanged(GenericDialog gd, AWTEvent e) {
	text = gd.getNextString();
	MultiLineLabel label = (MultiLineLabel)gd.getMessage();
        label.setText(divider+"\n"+text+"\n"+divider);
	return true;
 } 
}
