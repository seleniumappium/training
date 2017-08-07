package com.ocucs.cac.stepdefinitions;

import com.ocucs.cac.pages.LoginPage;
import com.ocucs.cac.tests.AbstractTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends AbstractTest{
	LoginPage lPage = null;

	@Given("^User Opens the CAC application$")
	public void user_Opens_the_CAC_application() throws Throwable {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		driver.get("http://kkm00cnx.in.oracle.com:7001/uasserver/login.html");
		lPage = new LoginPage(driver);
	}

	@When("^User enter username \"([^\"]*)\"$")
	public void user_enter_username(String userName) throws Throwable {
		lPage.setUserName(userName);
	}

	@When("^User enter password \"([^\"]*)\"$")
	public void user_enter_password(String password) throws Throwable {
		lPage.setPassword(password);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		lPage.clickOnLoginButton();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
		boolean result = lPage.isAppTitleExists();
		Assert.assertEquals("Title of app should appear", true, result);
	}

	@When("^User enter invalid username \"([^\"]*)\"$")
	public void user_enter_invalid_username(String username) throws Throwable {
		lPage.setUserName(username);
	}

	@When("^User enter invalid password \"([^\"]*)\"$")
	public void user_enter_invalid_password(String password) throws Throwable {
		lPage.setPassword(password);
	}

	@Then("^Login should be failed with \"([^\"]*)\"$")
	public void login_should_be_failed_with(String errorMessage) throws Throwable {
			String emessage = lPage.getLoginErrorMessage();
			Assert.assertEquals(emessage, errorMessage);
	}
	
	@After public void tearDown()
	{
		driver.close();
	}
	
	@Before public void setUp()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		initializeDriver();
	}
}
