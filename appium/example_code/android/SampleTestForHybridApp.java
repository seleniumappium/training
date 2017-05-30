package com.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.reporters.jq.Main;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForHybridApp {
	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator"); 
		caps.setCapability("avd", "Nexus_4_API_21"); 
		
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.testapp");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.testapp.MainActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Enter text(url) on the text field
		WebElement urlElement = driver.findElement(By.id("urlField"));
		urlElement.sendKeys("https://www.google.com");
		
		//Click on Go Button
		WebElement goButton = driver.findElement(By.name("Go"));
		goButton.click();
		
		//Switching to WebApp from Native
		Set<String> contextHandles = driver.getContextHandles();
		for (String id : contextHandles) 
		{
			System.out.println(id);  //NATIVE_APP, WEBVIEW_com.example.testapp
		}
		
		driver.context("WEBVIEW_com.example.testapp");
		
		//Its going to launch google.com application, want to enter a text called "Appium"
		WebElement textElement = driver.findElement(By.id("lst-ib"));
		textElement.clear();
		textElement.sendKeys("Appium");
		
		driver.closeApp();
		
		
	}
}
