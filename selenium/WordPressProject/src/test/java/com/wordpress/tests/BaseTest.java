package com.wordpress.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.wordpress.constants.Constants;
import com.wordpress.utils.ReadProperties;

public class BaseTest implements Constants{

	
	public WebDriver driver;
	public ReadProperties configProp;
	
	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(@Optional(CHROME)String browser) throws InterruptedException
	{
		configProp = new ReadProperties("./src/test/resources/config.properties");
		String webdriver_chrome_driver=configProp.getPropertyValue("webdriver_chrome_driver");
		String webdriver_gecko_driver=configProp.getPropertyValue("webdriver_gecko_driver");
		String url=configProp.getPropertyValue("url");
		
		if(browser.equalsIgnoreCase(CHROME))
		{
			  System.setProperty(property_webdriver_chrome_driver,webdriver_chrome_driver);			
			  driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(FIREFOX))
		{
			System.setProperty(property_webdriver_gecko_driver, webdriver_gecko_driver);
			driver = new FirefoxDriver();			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Navigate Method is using to Load URL - https://wordpress.com/
		driver.navigate().to(url);
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();	
	}
	
	
}
