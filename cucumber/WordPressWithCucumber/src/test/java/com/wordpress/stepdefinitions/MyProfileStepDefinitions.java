package com.wordpress.stepdefinitions;

import java.util.List;

import com.wordpress.pages.DashBoradPage;
import com.wordpress.pages.ProfilePage;
import com.wordpress.test.AbstractTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyProfileStepDefinitions extends AbstractTest {
	
	ProfilePage profilePage = new ProfilePage(firingDriver);
	DashBoradPage dashBoardPage = new DashBoradPage(firingDriver);
	
	@When("^click on profile icon$")
	public void click_on_profile_icon() throws Throwable {
		dashBoardPage.clickOnProfileIcon();
	}

	@When("^click on save profile button$")
	public void click_on_save_profile_button() throws Throwable {
		profilePage.clickOnSaveButton();
		Thread.sleep(2*1000);
	}

	@Then("^verify save message displayed$")
	public void verify_save_message_displayed() throws Throwable {
		profilePage.verifySaveMessage();
		Thread.sleep(2*1000);
	}

	@When("^enter first name <\"([^\"]*)\">$")
	public void enter_first_name(String firstName) throws Throwable {
		Thread.sleep(3*1000);
	   profilePage.setFirstName(firstName);
	}

	@When("^enter last name <\"([^\"]*)\">$")
	public void enter_last_name(String lastName) throws Throwable {
		Thread.sleep(3*1000);
		 profilePage.setLastName(lastName);
	}

	@When("^enter about me <\"([^\"]*)\">$")
	public void enter_about_me(String aboutMe) throws Throwable {
	   profilePage.setAboutMe(aboutMe);
	}

	@When("^enter display name <\"([^\"]*)\">$")
	public void enter_display_name(String displayName) throws Throwable {
	   profilePage.setDisplayName(displayName);
	}
	
	@When("^Enter the form details$")
	public void enter_the_form_details(DataTable dataTable) throws Throwable {
		Thread.sleep(3*1000);
		List<List<String>> raw = dataTable.raw();
		profilePage.setFirstName(raw.get(1).get(1));
		profilePage.setLastName(raw.get(2).get(1));
		profilePage.setDisplayName(raw.get(3).get(1));
		profilePage.setAboutMe(raw.get(4).get(1)+System.currentTimeMillis());
	}

}
