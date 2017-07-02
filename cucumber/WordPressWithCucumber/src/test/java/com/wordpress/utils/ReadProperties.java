package com.wordpress.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadProperties 
{
	String filepath;
	Properties properties = null;
	
	public ReadProperties(String filePath)
	{
		this.filepath = filePath;
		try
		{
		properties = new Properties();
		FileReader reader = new FileReader(filepath);
		properties.load(reader);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public String getPropertyValue(String key)
	{
		String value = properties.getProperty(key);
		return value;
		
	}
}
