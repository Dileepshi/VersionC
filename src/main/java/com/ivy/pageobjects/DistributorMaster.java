package com.ivy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DistributorMaster {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='_distributorLevel']/div[1]")
	WebElement distributorLevelLink;

	@FindBy(xpath = "//*[@id='add']/label")
	WebElement distributorAddLink;

	@FindBy(xpath = "//td[@class='td_label']/label[text()='Area Development Manager']//following::td[@class='td_text']//following::div[@class='button']/label[contains(text(),'Filter')]")
	WebElement ADMfilterLink;

	@FindBy(xpath = "//td[@class='td_label']/label[text()='Area Development Manager']//following::td[@class='td_text']//following::div[@class='button']/label[contains(text(),'?')]")
	WebElement locationfilterLink;

	@FindBy(xpath = "//*[@id='ADH_Code']")
	WebElement distributorCode;

	@FindBy(xpath = "//*[@id='ADH_Name']")
	WebElement distributorName;

	@FindBy(xpath = "//*[@id='ADH_Tin_No']")
	WebElement tinNo;

	@FindBy(xpath = "//*[@id='popup_location_div']/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/div/label")
	WebElement locationSaveButton;

	@FindBy(xpath = "//*[@id='tabs']/div[2]/table/tbody/tr/td[1]/div/label")
	WebElement distributorDetailsSaveButton;

	@FindBy(xpath = "//table/tbody/tr[1]/td[4]/span/b[text()='Nuprew Ghana-1']")
	WebElement locationSelect;

	@FindBy(xpath = "//input[@type='button']")
	WebElement locationSelectButton;

	@FindBy(xpath = "//*[@id=Location_Tree]/input")
	WebElement editLocationSearch;

	public DistributorMaster(WebDriver idriver) {

		driver = idriver;

		PageFactory.initElements(idriver, this);

	}

	public void verifyDistributorLevelLink() {

		distributorLevelLink.click();

	}

	public void verifyDistributorAddLink() {

		distributorAddLink.click();

	}

	public void verifyaddDistCode(String newDistCode) {

		distributorCode.sendKeys(newDistCode);

	}

	public void verifyaddDistName(String newDistName) {

		distributorName.sendKeys(newDistName);
	}

	public void verifyaddTinNO(String newTinNo) {

		tinNo.sendKeys(newTinNo);
	}

	public void verifyADMFilterLink() {

		ADMfilterLink.click();
	}

	public void verifyLocationFilterLink() {

		locationfilterLink.click();
	}

	public void verifyLocationSelectLink() {

		locationSelect.click();
	}

	public void verifyLocationSelectButton() {

		locationSelectButton.click();
	}

	public void verifyLocationeditSearch(String locationName) {

		editLocationSearch.sendKeys(locationName);
	}

	public void verifyLocationSaveButton() {

		locationSaveButton.click();
	}

	public void verifydistributorDetailsSaveButton() {

		distributorDetailsSaveButton.click();
	}

}
