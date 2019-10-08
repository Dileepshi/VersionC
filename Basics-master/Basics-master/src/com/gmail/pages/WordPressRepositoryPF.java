package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WordPressRepositoryPF {

	WebDriver driver;

	public WordPressRepositoryPF(WebDriver ldriver) {

		this.driver = ldriver;
		// we can use this at the page factory class also
	PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email") //@FindBy is an annotation
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@id='pass']")
	WebElement password;

	@FindBy(how = How.ID, using = "u_0_2")
	WebElement Login_button;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Forgotten account?")
	WebElement Forgot_password_link;

	public void facebooklogin(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		Login_button.click();
	}
}
