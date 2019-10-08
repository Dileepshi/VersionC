package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calenderPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement CalenderLabel;

	@FindBy(xpath = "//div[@class='rbc-toolbar']//span[1]//button[3]")
	WebElement CalenderNextButton;

	public calenderPage(WebDriver ldriver) {

		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public String getCalenderLable() {

		String CaldenderLabel = CalenderLabel.getText();
		return CaldenderLabel;

	}

	public void verifyCalenderNextButton() {

		CalenderNextButton.click();

	}

}
