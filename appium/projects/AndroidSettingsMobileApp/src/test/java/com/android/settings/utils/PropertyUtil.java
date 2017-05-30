package com.android.settings.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil 
{
	String file;
	Properties properties;
	
	public PropertyUtil(String filePath) 
	{
		file = filePath;
		properties = new Properties();
		try
		{
			FileInputStream fis = new FileInputStream(file);
			properties.load(fis);
		}catch(Exception e)
		{
			System.out.println("Exception occured while initialize the FIS object");
		}
	}
	
	
	public String getPropertyValue(String key)
	{
		String value =  properties.getProperty(key);
		value = value.trim();
		return value;
	}
}
