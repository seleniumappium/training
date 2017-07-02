package com.wordpress.stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import com.wordpress.pages.LoginPage;
import com.wordpress.test.AbstractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintions extends AbstractTest {

	LoginPage loginPage = new LoginPage(firingDriver);

	@Given("^Open wordpress application$")
	public void open_wordpress_application() throws Throwable {
		String url="";
		String environment = configProp.getPropertyValue("environment");
		if(environment.equalsIgnoreCase("UAT"))
		{
			url = configProp.getPropertyValue("url_uat");
		}
		else if(environment.equalsIgnoreCase("SystemTest"))
		{
			url = configProp.getPropertyValue("url_systemtest");
		}
		else
		{
			url = configProp.getPropertyValue("url_autotest");
		}
		firingDriver.get(url);
		firingDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Click on Login Link$")
	public void click_on_Login_Link() throws Throwable {
		loginPage.clickOnLoginLink();
	}

	@When("^Enter user name with \"([^\"]*)\"$")
	public void enter_user_name_with(String arg1) throws Throwable {
		loginPage.setUserName(arg1);
	}

	@When("^Enter password \"([^\"]*)\"$")
	public void enter_password(String arg1) throws Throwable {
		loginPage.setPassWord(arg1);
	}

	@When("^Clic on Login Button$")
	public void clic_on_Login_Button() throws Throwable {
		Thread.sleep(2 * 1000);
		loginPage.clickOnLoginButton();
		Thread.sleep(2 * 1000);
	}

	@Then("^Login should be failed$")
	public void login_should_be_failed() throws Throwable {
		Thread.sleep(3 * 1000);
		boolean result = firingDriver.getPageSource().contains("Invalid email or username");
		Assert.assertEquals(result, true);
	}

	@Then("^Close browser$")
	public void Close_browser() throws Throwable {
		firingDriver.quit();
		firingDriver = null;
	}

}
