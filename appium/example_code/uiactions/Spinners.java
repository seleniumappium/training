package com.uiactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Spinners {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "B1-730HD"); 
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement soundElement = driver.findElement(By.name("Sound"));
		soundElement.click();
		
		WebElement notifictionsElement = driver.findElement(By.name("Default notification sound"));
		notifictionsElement.click();
		
		driver.scrollToExact("Xenon");
		WebElement xenonElement = driver.findElement(By.name("Xenon"));
		xenonElement.click();
		
		
	}
}
