package com.wordpress.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.wordpress.listeners.EventListener;
import com.wordpress.utils.ReadProperties;

public class AbstractTest 
{
	private static WebDriver driver;
	public static  EventFiringWebDriver firingDriver;
	public static ReadProperties configProp = new ReadProperties("./src/test/resources/objectrepo/config.properties");
	public AbstractTest()
	{
		if (firingDriver == null) 
		{
			String browser = configProp.getPropertyValue("browser_name");
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "/Users/dnreddy/Documents/selenium/driver/geckodriver");
				driver  = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "/Users/dnreddy/Documents/Selenium/chrome");
				driver  = new ChromeDriver();
			}
			
			EventListener listener = new EventListener();
			firingDriver = new EventFiringWebDriver(driver);
			driver.manage().window().maximize();
			firingDriver.register(listener);
			firingDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	}
}
