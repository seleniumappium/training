package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

	WebDriver driver;
	public ProfilePage(WebDriver wd) {
		driver= wd;
	}
	
	public void setFirstName(String FirstName) {
		
		WebElement first_nameElement = driver.findElement(By.name("first_name"));
		first_nameElement.clear();
		first_nameElement.sendKeys(FirstName);
				
	}
	
	public void setLastName(String LastName) {
		
		WebElement last_nameElement = driver.findElement(By.name("last_name"));
		last_nameElement.clear();
		last_nameElement.sendKeys(LastName);
			
	}
	
	
	public void setDisplayName(String DisplayNmae) {
		
		WebElement display_nameElement1 = driver.findElement(By.name("display_name"));
		display_nameElement1.clear();
		display_nameElement1.sendKeys(DisplayNmae);
		
		
	}
	
	public void setDescription(String Description) {
		
		WebElement descriptionElement = driver.findElement(By.name("description"));
		descriptionElement.clear();
		descriptionElement.sendKeys(Description);
	}

	
	
	public void setAboutMe(String aboutMe)
	{
		WebElement inputDescription = driver.findElement(By.id("description"));
		inputDescription.clear();
		inputDescription.sendKeys(aboutMe);
		
	}
	
	public void clickOnSaveButton()
	{
		WebElement clickOnSubmitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		clickOnSubmitBtn.click();
	}
	
	
	
	
	
}
