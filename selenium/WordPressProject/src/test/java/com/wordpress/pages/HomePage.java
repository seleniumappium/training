package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver webDriver)
	{
		driver = webDriver;
	}
	
	
	
	public void clickOnLoginLink()
	{
		WebElement LoginLinkElement = driver.findElement(By.linkText("Log In"));
		LoginLinkElement.click();
	}
}
