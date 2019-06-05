package com.selenium.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFirstScript
{
		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver", "/Users/test/drivers/chrome_74/chromedriver"); //chromedriver.exe
			//open the browser - chrome
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			//load the url - https://www.mortgagecalculator.org/
			driver.get("https://www.mortgagecalculator.org/");
			
			//Enter 1000 in the HomeValue text field
			WebElement homeValueElement = driver.findElement(By.id("homeval"));
			homeValueElement.clear();
			homeValueElement.sendKeys("1000");
			
			WebElement  selectMonthElement = driver.findElement(By.name("param[start_month]"));
			Select selectMonth = new Select(selectMonthElement);
			//selectMonth.selectByIndex(10);
			//selectMonth.selectByVisibleText("Nov");
			selectMonth.selectByValue("11");
			
			WebElement viewLoanLink = driver.findElement(By.linkText("View Loan Breakdown"));
			viewLoanLink.click();
			
			WebElement viewLoadPartial = driver.findElement(By.linkText("Loan Breakdown"));
			viewLoadPartial.click();
			
			//close the browser
			driver.close();
			
			
		}
}
