package com.wordpress.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.constants.Constants;
import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.HomePage;
import com.wordpress.pages.LoginPage;
import com.wordpress.utils.ExcelUtil;

public class LoginTest extends BaseTest 
{
	
		public LoginPage lPage;
		public HomePage hPage;
		public DashboardPage dPage;

		
		@BeforeMethod
		public void beforeMethodInChildClass() throws InterruptedException
		{
			//this method gets executed before every test method
			hPage = new HomePage(driver);
			lPage = new LoginPage(driver);
			
			//Click Login Link
			hPage.clickOnLoginLink();
			
			
		}
		
		@Test(priority=1)
		public void testLoginWithValidCredentials() throws InterruptedException
		{
			lPage.login(valid_user_name, valid_password);
			Assert.assertTrue(dPage.isProfileIconExists());
		}
		
		
		@Test(priority=2)
		public void testLoginWithInvalidCredentials_InvalidUser() throws InterruptedException
		{
			ExcelUtil eUtil = new ExcelUtil("./src/test/resources/Login.xls", 0);
			int size = eUtil.getNumberOfRows();
			for(int i=1;i<=size;i++)
			{
				String userName = eUtil.getCellValue(i, 0); 
				String errorMessage = eUtil.getCellValue(i, 1);
				if(errorMessage==null || errorMessage.equalsIgnoreCase(""))
				{
					continue;
				}
				lPage.setUserName(userName);
				lPage.clickOnContinueButton();
				Thread.sleep(2*1000);
				String actualErrorMessage = lPage.getErrorMessge();	
				Assert.assertEquals(actualErrorMessage, errorMessage);
				Assert.assertTrue(actualErrorMessage.contains(errorMessage));
				driver.navigate().refresh();
				Thread.sleep(2*1000);
			}
		}
		
	/*	@Test(priority=3)
		public void testLoginWithNumbersOnly() throws InterruptedException
		{

			lPage.setUserName("42342343423423432");
			lPage.clickOnContinueButton();
			//validate error message		
		}
		
		
		@Test(priority=4)
		public void testLoginWithMixedChars() throws InterruptedException
		{

			lPage.setUserName("abcd123456789!@#");
			lPage.clickOnContinueButton();
			//validate error message		
		} */
}
