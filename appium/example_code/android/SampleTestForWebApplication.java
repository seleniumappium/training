package com.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForWebApplication 
{
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator"); 
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser"); //"chrome"
		caps.setCapability("avd", "Nexus_4_API_21"); 
		
		//Create Android Driver
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		//Enter "appium" on the text field
		WebElement textElement = driver.findElement(By.id("lst-ib"));
		textElement.clear();
		textElement.sendKeys("Appium");
		
		driver.close();
	
		
		
	}
}
