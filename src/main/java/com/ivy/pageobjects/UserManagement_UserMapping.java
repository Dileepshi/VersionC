package com.ivy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ivy.baseclass.Baseclass;

public class UserManagement_UserMapping extends Baseclass {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='User Mapping']")
	WebElement userMappingLink;

	@FindBy(xpath = "//*[@id='add']/label")
	WebElement userMappingAddButton;

	@FindBy(xpath = "//*[@id='Authentication_SUA_Login_Id']")
	WebElement addUserName;

	@FindBy(xpath = "//*[@id='SU_User_Code']")
	WebElement addUserCode;

	@FindBy(xpath = "//*[@id='SU_First_Name']")
	WebElement addFirstName;

	@FindBy(xpath = "//*[@id='SU_Mobile_No']")
	WebElement addMobileNo;

	@FindBy(xpath = "//*[@id='SU_Email_Id']")
	WebElement addEmailID;

	@FindBy(xpath = "//*[@id='tabs']/div[2]/table/tbody/tr/td[1]/div/label")
	WebElement userSaveButton;

	public UserManagement_UserMapping(WebDriver idriver) {

		driver = idriver;

		PageFactory.initElements(idriver, this);
	}

	public void verifyuserMappingLink() {
		userMappingLink.click();
	}

	public void verifyuserMappingAddLink() {
		userMappingAddButton.click();
	}

	public void verifyaddUserName() {
		addUserName.sendKeys("lll");
	}

	public void verifyaddUserCode() {
		addUserCode.sendKeys("lll");
	}

	public void verifyaddFirstName() {
		addFirstName.sendKeys("lll");
	}

	public void verifyaddMobileNo() {
		addMobileNo.sendKeys("232343234");
	}

	public void verifyaddEmailID() {
		addEmailID.sendKeys("sfas@gamil.com");
	}

	public void verifySaveButton() {
		userSaveButton.click();
	}
}
