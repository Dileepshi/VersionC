package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	// page factory - object repository
	@FindBy(xpath = ".//input[@name='email']")
	WebElement username;

	@FindBy(xpath = ".//input[@name='password']")
	WebElement password;

	@FindBy(xpath = ".//div[text()='Login']")
	WebElement loginButton;

	// Initializing page objects
	public Loginpage(WebDriver hdriver) {

		driver = hdriver;
		PageFactory.initElements(hdriver, this);
	}

	public String getTitle() {
		String titleName = driver.getTitle();
		return titleName;
	}

	public void setusername(String UN) {
		username.sendKeys(UN);
	}

	public void setpassword(String PW) {
		password.sendKeys(PW);
	}

	public Homepage setloginbutton() {
		loginButton.click();
		
		return new Homepage(driver);
	}

}
