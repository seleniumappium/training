package com.ocucs.cac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ocucs.cac.utils.PropertyUtil;

public class LoginPage 
{
	WebDriver driver;
	PropertyUtil propUtil= null;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		propUtil = new PropertyUtil("./src/test/resources/objrepo/object.properties");
	}
	
	public void setUserName(String userName)
	{
		String value = propUtil.getPropertyValue("login_username_text_id");
		WebElement userNameElement = driver.findElement(By.id(value));
		userNameElement.clear();
		userNameElement.sendKeys(userName);
	}
	
	public void setPassword(String password)
	{
		String value = propUtil.getPropertyValue("login_password_text_id");
		WebElement passwordElement = driver.findElement(By.id(value));
		passwordElement.clear();
		passwordElement.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		String value = propUtil.getPropertyValue("login_login_button_xpath");
		WebElement loginButton = driver.findElement(By.xpath(value));
		loginButton.click();
	}
	
	public boolean isAppTitleExists()
	{
		boolean result = true;
		try
		{
			String value = propUtil.getPropertyValue("login_apptitle_lable_xpath");
			WebElement titleOfApp =  driver.findElement(By.xpath(value));
			result = titleOfApp.isDisplayed();
		}
		catch(Exception e)
		{
			result = false;
		}
		return result;
	}
	
	public String getLoginErrorMessage()
	{
		WebElement element = driver.findElement(By.className("loginError"));
		return element.getText();
	}
	
	
	
}
