package com.ocucs.cac.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil 
{

	Properties properties;
	
	public PropertyUtil(String filePath)
	{
		properties = new Properties();
		FileReader reader;
		try {
			reader = new FileReader(filePath);
			properties.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getPropertyValue(String key)
	{
		String property = properties.getProperty(key);
		return property.trim();
	}
	
	
	
	
}
