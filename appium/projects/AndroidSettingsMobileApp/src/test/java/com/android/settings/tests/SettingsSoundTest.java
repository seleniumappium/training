package com.android.settings.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.android.settings.pages.SettingsPage;
import com.android.settings.pages.SoundPage;
import com.android.settings.utils.ExcelUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SettingsSoundTest 
{
	
	AndroidDriver driver;
	SettingsPage settingsPage;
	SoundPage soundPage;
	
			
	@BeforeClass
	public void beforeClass() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "B1-730HD"); 
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		settingsPage = new SettingsPage(driver);
		soundPage = new SoundPage(driver);
	}
	
	@Test
	public void testAVolumePopupDisplay()
	{
		//Test-1 : click on sound,click on volumes.
		//Expected output: Volume screen should be opened.
		
		settingsPage.clickOnSound();
		soundPage.clickOnVoulumes();

		if(soundPage.isMediaButtonDisplayed())
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is Failed");
		}

		soundPage.clickOnOKButton();
		settingsPage.clickOnSound();
	}
	
	
	@Test
	public void testBSelectionOfXenonInDefaultNotification()
	{
		ExcelUtil excelUtil = new ExcelUtil("./src/test/resources/notificationdata.xls", 0);
		int numberOfRows = excelUtil.getNumberOfRows();
		for(int i =1;i<=numberOfRows;i++)
		{
			String notificationData = excelUtil.getCellValue(i, 0);
			settingsPage.clickOnSound();
			soundPage.clickOnNotificationSound();
			soundPage.selectDefaultNotificationSound(notificationData);
			soundPage.clickOnOKButton();
	
			if(soundPage.isDefaultNotificationSoundDisplayed(notificationData))
			{
				System.out.println("Test is pass");
			}
			else
			{
				System.out.println("Test is Failed");
			}
			settingsPage.clickOnSound();
		}
	}	
	
	@AfterClass
	public void afterClass()
	{
		driver.closeApp();
	}
	
	
	
	
}
