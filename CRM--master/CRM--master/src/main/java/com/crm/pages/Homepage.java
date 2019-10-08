package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;

	@FindBy(xpath = "//span[@class='user-display']")
	@CacheLookup//stores in cache
	WebElement userDisplayLabel;

	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement calenderLink;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;

	// intitialize page objects

	public Homepage(WebDriver ldriver) {

		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyUserDisplayLabel() {

		boolean userDLabel = userDisplayLabel.isDisplayed();
		return userDLabel;
	}

	public String verifyHomepageTitle() {

		String homePagetitle = driver.getTitle();
		return homePagetitle;
	}

	public String UDisplayLabel() {

		String uDisplaylable = userDisplayLabel.getText();
		return uDisplaylable;
	}

	public calenderPage clickcalenderLink() {

		calenderLink.click();

		return new calenderPage(driver);
	}

	public contactsPage clickcontactsLink() {

		contactsLink.click();
		return new contactsPage(driver);
	}

}
