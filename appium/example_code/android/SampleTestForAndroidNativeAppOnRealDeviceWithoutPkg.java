package com.android.realdevice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTestForAndroidNativeAppOnRealDeviceWithoutPkg {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		File file = new File("/Users/dnreddy/Documents/Appium/BMICalculator.apk");
		caps.setCapability(MobileCapabilityType.APP, file);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "B1-730HD");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> textElement = driver.findElements(By.className("android.widget.EditText"));
		textElement.get(0).sendKeys("Sudheer");
		
		
		List<WebElement> buttonElement = driver.findElements(By.className("android.widget.Button"));
		buttonElement.get(0).click();
		
		WebElement metricElement = driver.findElement(By.name("Metric"));
		metricElement.click();
		
		
		
		
		
		
	}
}
