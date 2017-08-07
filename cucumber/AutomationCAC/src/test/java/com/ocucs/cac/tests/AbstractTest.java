package com.ocucs.cac.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ocucs.cac.constants.Constants;
import com.ocucs.cac.utils.PropertyUtil;

public class AbstractTest implements Constants
{
	protected WebDriver driver;
	
	public void initializeDriver()
	{
		PropertyUtil prop = new PropertyUtil("./src/test/resources/config/config.properties");
		String browser_val = prop.getPropertyValue(browser);
		if(browser_val.equalsIgnoreCase(browser_firefox))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/dnreddy/sudheer/Selenium/drivers/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		}
		else if(browser_val.equalsIgnoreCase(browser_chrome))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/dnreddy/sudheer/Selenium/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		}

	}
	
}
