package com.ivy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='SUA_Login_Id']")
	WebElement usernameEdit;

	@FindBy(xpath = "//*[@id='SUA_Password']")
	WebElement passwordEdit;

	@FindBy(xpath = "//*[@id='Login']")
	WebElement loginButton;

	public LoginPage(WebDriver idriver) {

		driver = idriver;

		PageFactory.initElements(idriver, this);
	}

	public void setUsername(String un) {

		usernameEdit.sendKeys(un);
	}

	public void setPassword(String pw) {

		passwordEdit.sendKeys(pw);
	}

	public void clickLoginButton() {

		loginButton.click();
	}

}
