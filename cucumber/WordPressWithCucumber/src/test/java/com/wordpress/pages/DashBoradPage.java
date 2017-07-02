package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wordpress.utils.ReadProperties;

public class DashBoradPage {

	public WebDriver driver;
	ReadProperties properties = new ReadProperties("./src/test/resources/objectrepo/object.properties");
	
	public DashBoradPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void clickOnProfileIcon()
	{
		String profile_icon_value = properties.getPropertyValue("dashboard_page_profile_icon_button_xpath");
		WebElement element = driver.findElement(By.xpath(profile_icon_value));
		element.click();
	}
	
	
}
