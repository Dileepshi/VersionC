package com.ivy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ivy.baseclass.Baseclass;

public class UserManagement_Location extends Baseclass {

	WebDriver driver;

	@FindBy(xpath = ".//span[text()='Location']")
	WebElement locationComponentlink;

	@FindBy(xpath = "//*[@id='DynamicLocationLevel']/div[1]")
	WebElement salesOrgLink;

	@FindBy(xpath = "//*[@id='DynamicLocationLevel']/div[2]")
	WebElement nationalLink;

	@FindBy(xpath = ".//*[@id='btnAdd']")
	WebElement addButton;

	@FindBy(xpath = "//*[@id='AL_Code']")
	WebElement addLocationCode;

	@FindBy(xpath = "//*[@id='AL_Name']")
	WebElement addLocationName;

	@FindBy(xpath = "//*[@id='btnSave']/label")
	WebElement locationSavebutton;

	@FindBy(xpath = "//button[@id='btnAlertClose']")
	WebElement closeAlert;

	public UserManagement_Location(WebDriver idriver) {

		driver = idriver;

		PageFactory.initElements(idriver, this);
	}

	public void locationcomponentLink() {

		locationComponentlink.click();
	}

	public void verfifySalesorglink() {

		salesOrgLink.click();
	}

	public void verifyNationallink() {

		nationalLink.click();
	}

	public void verfiyAddbutton() {

		addButton.click();
	}

	public void addCode(String locationcode) {

		addLocationCode.sendKeys(locationcode);
	}

	public void addName(String locationName) {

		addLocationName.sendKeys(locationName);
	}

	public void verifyLocationSaveButton() {

		locationSavebutton.click();
	}

	public void clickAddedAlert() {

		closeAlert.click();
	}

}
