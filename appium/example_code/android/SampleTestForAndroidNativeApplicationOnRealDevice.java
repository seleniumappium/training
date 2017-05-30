package com.android.realdevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForAndroidNativeApplicationOnRealDevice 
{
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "B1-730HD"); 
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element8 = driver.findElement(By.name("8"));
		element8.click();
		
		WebElement elementPlus = driver.findElement(By.id("com.android.calculator2:id/plus"));
		elementPlus.click();
		
		WebElement element7 = driver.findElement(By.id("digit7"));
		element7.click();
		
		WebElement equalsElement = driver.findElementByAccessibilityId("equals");
		equalsElement.click();
		
	}
}
