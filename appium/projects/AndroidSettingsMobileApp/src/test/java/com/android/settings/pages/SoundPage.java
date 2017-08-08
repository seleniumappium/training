package com.android.settings.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.android.settings.utils.PropertyUtil;

import io.appium.java_client.AppiumDriver;

public class SoundPage 
{
	AppiumDriver driver;
	PropertyUtil propertyUtil;
	
	public SoundPage(AppiumDriver driver)
	{
		this.driver = driver;
		propertyUtil = new PropertyUtil("./src/test/resources/object.properties");
	}
	
	public void clickOnVoulumes()
	{
		String propertyValue = propertyUtil.getPropertyValue("soundpage_volumes_item_name");
		WebElement volumesElement = driver.findElement(By.name(propertyValue));
		volumesElement.click();
	}
	
	public void clickOnNotificationSound()
	{
		String propertyValue = propertyUtil.getPropertyValue("soundpage_defaultnotificationsound_item_name");
		WebElement notificationElement = driver.findElement(By.name(propertyValue));
		notificationElement.click();
	}
	
	public void clickOnOKButton()
	{
		String propertyValue = propertyUtil.getPropertyValue("soundpage_ok_button_id");
		WebElement okButton = driver.findElement(By.id(propertyValue));
		okButton.click();
	}
	

	
	public void selectDefaultNotificationSound(String defaultSound)
	{
		WebElement xenonElement = driver.findElement(By.name(defaultSound));
		xenonElement.click();
	}

	
	public boolean isMediaButtonDisplayed()
	{
		String propertyValue = propertyUtil.getPropertyValue("soundpage_mediamute_button_id");
		WebElement mediaButton = driver.findElement(By.id(propertyValue));
		return mediaButton.isDisplayed();
	}
	
	public boolean isDefaultNotificationSoundDisplayed(String defaultSound)
	{
		WebElement xenonText = driver.findElement(By.name(defaultSound));
		return xenonText.isDisplayed();
	}
}
