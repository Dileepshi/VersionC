package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactsPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@href='/contacts/new']//button[@class='ui linkedin button']//i[@class='edit icon']")
	WebElement NewContactLink;

	@FindBy(name = "first_name")
	WebElement contactsFirstName;

	@FindBy(name = "last_name")
	WebElement contactsLastName;

	@FindBy(xpath = "//button[@class='ui linkedin button']//i[@class='save icon']")
	WebElement contactsSaveButton;

	public contactsPage(WebDriver ldriver) {

		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public void clickNewContactLink() {

		NewContactLink.click();
	}

	public void createNewContact(String firstname, String lastname) {

		contactsFirstName.sendKeys(firstname);
		contactsLastName.sendKeys(lastname);
		contactsSaveButton.click();
	}

}
