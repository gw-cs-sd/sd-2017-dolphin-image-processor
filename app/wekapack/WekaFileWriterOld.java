package wekapack;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WekaFileWriterOld
{
	public WekaFileWriterOld()
	{
		
	}
	
	public void test()
	{
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("public/dolphinImages/test.arff"), "utf-8")))
		{
			writer.write("something\nsomething");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void writeRelation(Writer writer, String relation)
	{
		try
		{
			writer.write("@relation " + relation);
			writer.write("\n\n");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void writeAttributes(Writer writer, String[] attributes)
	{
		int length = attributes.length;
		try
		{
			for(int i = 0; i < length; i++)
			{
				writer.write("@attribute " + attributes[i] + " numeric\n");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void writeClassAttribute(Writer writer, String[] classAttributes)
	{
		int length = classAttributes.length;
		try
		{
			writer.write("@attribute class {");
			for(int i = 0; i < length; i++)
			{
				writer.write(classAttributes[i]);
				if(i != length - 1)
				{
					writer.write(",");
				}
			}
			writer.write("\n\n");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	/*
	public void writeData(Writer writer, String[][] attributeVector)
	{
		try
		{
			writer.write("@attribute class {");
			for(int i = 0; i < length; i++)
			{
				writer.write(classAttributes[i]);
				if(i != length - 1)
				{
					writer.write(",");
				}
			}
			writer.write("\n\n");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	*/
}
