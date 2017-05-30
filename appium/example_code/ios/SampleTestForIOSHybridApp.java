package com.ios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForIOSHybridApp 
{
	public static void main(String[] args) throws MalformedURLException {
		//Create desired capability object
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, “9.3”);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		File file = new File("/Users/dnreddy/Documents/Appium/iosHybrid.app");
		caps.setCapability(MobileCapabilityType.APP,file );
		
		//Create IOS Driver
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		//Idetify the elements and perform actions on those elements
		WebElement textElement = driver.findElement(By.className("UIATextField"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		textElement.clear();
		textElement.sendKeys("https://www.google.com");
		
		WebElement goButton = driver.findElement(By.name("Go"));
		goButton.click();
		
		
		Set<String> contextHandles = driver.getContextHandles();
		for (String contextId : contextHandles) 
		{
			System.out.println(contextId);
		}
		
		driver.context("WEBVIEW_1");
		WebElement imageElement = driver.findElement(By.linkText("IMAGES"));
		imageElement.click();
	}
}


