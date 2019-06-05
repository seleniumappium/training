package com.wordpress.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties 
{
	
	Properties prop;
	
	public ReadProperties(String filePath)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e) 
		{ 
			e.printStackTrace();
		}
	}
	
	
	public String getPropertyValue(String key)
	{
		return prop.getProperty(key);
	}

}
