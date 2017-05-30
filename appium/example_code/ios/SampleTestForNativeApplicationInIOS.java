package com.ios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.reporters.jq.Main;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForNativeApplicationInIOS {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		File file = new File("/Users/dnreddy/Documents/Appium/TestApp.app");
		caps.setCapability(MobileCapabilityType.APP, file);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement textElement1 = driver.findElement(By.name("TextField1"));
		textElement1.clear();
		textElement1.sendKeys("10");
		
		WebElement textElement2 = driver.findElement(By.name("TextField2"));
		textElement2.clear();
		textElement2.sendKeys("20");
		
		WebElement computeButton = driver.findElement(By.name("ComputeSumButton"));
		computeButton.click();
		
		driver.closeApp();
		
		
		
		
		
	}
}



--native-instruments-lib


Harware -> 