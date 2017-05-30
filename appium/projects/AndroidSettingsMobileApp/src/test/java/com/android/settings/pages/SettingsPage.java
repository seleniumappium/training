package com.android.settings.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.android.settings.utils.PropertyUtil;

import io.appium.java_client.AppiumDriver;

public class SettingsPage 
{
		AppiumDriver driver;
		PropertyUtil propertyUtil;
		
		public SettingsPage(AppiumDriver driver)
		{
			this.driver = driver;
			propertyUtil = new PropertyUtil("./src/test/resources/object.properties");
		}
		
		public void clickOnSound()
		{
			String propertyValue = propertyUtil.getPropertyValue("settingspage_sound_item_name");
			WebElement soundElement = driver.findElement(By.name(propertyValue));
			soundElement.click();
		}
}
