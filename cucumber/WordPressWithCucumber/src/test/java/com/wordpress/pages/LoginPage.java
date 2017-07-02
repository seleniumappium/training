package com.wordpress.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wordpress.utils.ReadProperties;

public class LoginPage 
{
	WebDriver driver;
	ReadProperties properties = new ReadProperties("./src/test/resources/objectrepo/object.properties");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setUserName(String userName)
	{
		 String username_value = properties.getPropertyValue("loginpage_username_text_id");
		  WebElement userNameElement = driver.findElement(By.id(username_value));
		  userNameElement.clear();
		  userNameElement.sendKeys(userName);
	}
	
	public void setPassWord(String password)
	{ 
		  String password_value = properties.getPropertyValue("login_page_password_text_id");
		  WebElement passwordElement = driver.findElement(By.id(password_value));
		  passwordElement.clear();
		  passwordElement.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		String login_button_value = properties.getPropertyValue("loginpage_login_button_id");
		 WebElement loginButton = driver.findElement(By.id(login_button_value));
		 loginButton.click();
	}
	
	public void clickOnLoginLink()
	{
		String login_link_value = properties.getPropertyValue("login_page_loginlink_link_linktext");
		WebElement loginLink = driver.findElement(By.linkText(login_link_value));
		loginLink.click();
	}
	
}
