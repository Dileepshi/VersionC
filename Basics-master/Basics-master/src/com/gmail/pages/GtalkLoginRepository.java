package com.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GtalkLoginRepository {
	 //POm is a design pattern not a framework
     // This class will store all the locators of login page
	
	WebDriver driver;
	
	By username =By.id("identifierId");
	By password =By.id("pass");
	By loginButton =By.xpath("//span[@class='RveJvd snByac']");
	
	public GtalkLoginRepository(WebDriver driver){  // THis is constructor
		this.driver= driver; // here i am passing the test case driver to the local driver.
		}
	public void typeusername(String un){// here this method will be called by the test case
		driver.findElement(username).sendKeys(un);
		}
	public WebElement typepassword(){
		return driver.findElement(username);// here we used return statement 
		}
	public void clicklogin(){
		driver.findElement(loginButton).click();
		}
	
	//or -- All in one meethod
	//public void loginpagecase (String un){
		//driver.findElement(username).sendKeys(un);
		//driver.findElement(loginButton).click();
		
	//}
}
