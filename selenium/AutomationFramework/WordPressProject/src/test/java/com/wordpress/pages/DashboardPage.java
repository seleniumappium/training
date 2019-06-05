package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	WebDriver driver;
	public DashboardPage(WebDriver wd) 
	{
		driver=wd;
	}
	
	public void clickOnProfileLink() {
		WebElement ProfileIcon = driver.findElement(By.className("gravatar"));
		ProfileIcon.click();	
	}
	
	public boolean isProfileIconExists() {
		WebElement ProfileIcon = driver.findElement(By.className("gravatar"));
		return ProfileIcon.isDisplayed();	
	}
	
	
}
