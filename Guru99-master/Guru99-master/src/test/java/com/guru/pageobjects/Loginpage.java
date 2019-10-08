package com.guru.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver hdriver) {

		driver = hdriver;
		PageFactory.initElements(hdriver, this);
	}

	@FindBy(xpath = ".//input[@type='text']")
	WebElement username;

	@FindBy(xpath = ".//input[@type='password']")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement loginbutton;
	
	@FindBy(xpath=".//a[contains(text(),'Log out']")
	WebElement	logoutButton;

	public void setusername(String UN) {                                                
		username.sendKeys(UN);
	}

	public void setpassword(String PW) {
		password.sendKeys(PW);
	}

	public void setloginbutton() {
		loginbutton.click();
	}
	
	public void setlogoutButton() {
		logoutButton.click();
	}

}
