package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
		WebDriver driver;
	
		@FindBy( how=How.ID, using="usernameOrEmail")
		WebElement userNameElement;
		
		
		@FindBy( how=How.ID, using="password")
		WebElement passwordElement;
		
		
		@FindBy( how=How.XPATH, using="//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button")
		WebElement continueButtonElement;
		
		@FindBy( how=How.XPATH, using="//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button")
		WebElement loginButtonElement;
		
		@FindBy(how = How.XPATH,using="//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[1]/div[1]/span")
		WebElement errorMessage;
	
		public LoginPage(WebDriver webDriver)
		{
			driver = webDriver;
			PageFactory.initElements(driver, this);
		}
	
		public boolean isUserNameExists()
		{
			return userNameElement.isDisplayed();

		}
		
		
		public void setUserName(String userName)
		{
			userNameElement.clear();
			userNameElement.sendKeys(userName);
		}
		
		
		public void clickOnContinueButton() throws InterruptedException
		{
			
			 
			Thread.sleep(2000);	
			continueButtonElement.click();
		}
		
		public void setPassword(String password)
		{
			
			passwordElement.clear();
			passwordElement.sendKeys(password);
		}
		
		
		public void clickOnLoginButton() throws InterruptedException
		{
			
			Thread.sleep(2000);	
			loginButtonElement.click();
		}
		
		public String getErrorMessge()
		{
			return errorMessage.getText();
		}
		
		public void login(String userName,String password) throws InterruptedException
		{
			setUserName(userName);
			clickOnContinueButton();
			Thread.sleep(2*1000);
			setPassword(password);
			clickOnLoginButton();
		}
		
}
