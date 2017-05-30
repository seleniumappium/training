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

public class SampleTestForAndroidNativeApp 
{
	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
		//if its real device, give actual device name
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator"); 
		caps.setCapability("avd", "Nexus_4_API_21"); //is not required if its real device
		//Identifiying application using desired capabilities - for android
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		
		//Create Android Driver
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement digit8 = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
		digit8.click();
		
		WebElement plusElement = driver.findElementByAccessibilityId("plus");
		plusElement.click();
		
		WebElement digit7 = driver.findElement(By.name("7"));
		digit7.click();
		
		WebElement eqElement = driver.findElement(By.id("eq"));
		eqElement.click();
		
		driver.closeApp();	
	}
}
