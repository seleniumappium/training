package com.uiactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SeekBar {
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
		
		WebElement volumesElement = driver.findElement(By.name("Volumes"));
		volumesElement.click();
		
		WebElement mediaVolumeElement = driver.findElement(By.id("com.android.settings:id/media_volume_seekbar"));
		Point location = mediaVolumeElement.getLocation();
		int xAxis = location.getX();
		int yAxis = location.getY();
		
		Dimension size = mediaVolumeElement.getSize();
		int xAxisEnd = xAxis + size.getWidth();
		
		TouchAction actions = new TouchAction(driver);
		actions.press(xAxis,yAxis).moveTo(xAxisEnd-1, yAxis).release().perform();

	}
}
