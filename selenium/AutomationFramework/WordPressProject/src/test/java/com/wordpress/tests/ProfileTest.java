package com.wordpress.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.HomePage;
import com.wordpress.pages.LoginPage;
import com.wordpress.pages.ProfilePage;

public class ProfileTest extends BaseTest
{

	public LoginPage lPage;
	public HomePage hPage;
	public DashboardPage dPage;
	public ProfilePage pPage;
	
	@BeforeMethod
	public void beforeMethodInChildClass() throws InterruptedException
	{	
		//this method gets executed before every test method
		hPage = new HomePage(driver);
		lPage = new LoginPage(driver);
		pPage = new ProfilePage(driver);
		dPage = new DashboardPage(driver);
		
		
		//Click Login Link
		hPage.clickOnLoginLink();
	}
	
	@Test
	public void testUpdateProfile() throws InterruptedException
	{
		lPage.login(valid_user_name, valid_password);
		dPage.clickOnProfileLink();
		pPage.setFirstName("sudheer");
		pPage.setLastName("kumar");
		pPage.setAboutMe("Trainer");
		pPage.setDescription("Selenium Trainer");
		pPage.clickOnSaveButton();
	}
	

	
	
}
