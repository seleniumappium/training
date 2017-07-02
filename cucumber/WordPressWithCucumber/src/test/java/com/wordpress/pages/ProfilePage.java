package com.wordpress.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wordpress.utils.ReadProperties;

public class ProfilePage 
{
	WebDriver driver;
	ReadProperties properties = new ReadProperties("./src/test/resources/objectrepo/object.properties");
	
	public ProfilePage(WebDriver driver){
		this.driver= driver;
	}
	
	public void setFirstName(String firstName){
		String firstname_value = properties.getPropertyValue("profile_page_firstname_text_id");
		driver.findElement(By.id(firstname_value)).sendKeys(firstName);
	}
	
	public void setLastName(String lastName){
		String lastname_value = properties.getPropertyValue("profile_page_lastname_text_id");
		driver.findElement(By.id(lastname_value)).sendKeys(lastName);
	}
	
	public void setDisplayName(String displayName){
		String display_name_value = properties.getPropertyValue("profile_page_displayname_text_id");
		driver.findElement(By.id(display_name_value)).sendKeys(displayName);
	}
	
	public void setAboutMe(String aboutMe){
		String about_me_value = properties.getPropertyValue("profile_page_aboutme_text_id");
		WebElement element = driver.findElement(By.id(about_me_value));
		element.clear();
		element.sendKeys(aboutMe);
	}
	
	public void clickOnSaveButton(){
		String savebutton_value = properties.getPropertyValue("profile_savebutton_button_xpath");
		driver.findElement(By.xpath(savebutton_value)).click();
	}
	
	public void verifySaveMessage(){
		String success_message_value =properties.getPropertyValue("profile_success_message_xpath");
		String success_message = driver.findElement(By.xpath(success_message_value)).getText();
		Assert.assertEquals(success_message, "Settings saved successfully!");
	}
	
}
