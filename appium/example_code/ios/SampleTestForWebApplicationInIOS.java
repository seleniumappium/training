package com.ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.reporters.jq.Main;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForWebApplicationInIOS {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		Thread.sleep(3*1000);
		
		
		WebElement textElement = driver.findElement(By.id("lst-ib"));
		textElement.clear();
		textElement.sendKeys("Appium");

	}
}
