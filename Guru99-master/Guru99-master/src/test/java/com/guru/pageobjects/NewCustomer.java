package com.guru.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	
	WebDriver driver;

	public NewCustomer(WebDriver hdriver) {

		driver = hdriver;
		PageFactory.initElements(hdriver, this);
	}

	@FindBy(how=How.XPATH ,using= ".//a[text()='New Customer']")
	WebElement newCustomerlink;
	
	@FindBy(how=How.XPATH ,using= ".")
	WebElement add;
	
	@FindBy(how=How.XPATH ,using= "gmail")
	WebElement addgmail;
	
	public void clickNewCustomer() {
		newCustomerlink.click();
	}
	public void addNewCustomer(int name) {
		add.sendKeys(String.valueOf(name));// send keys does not accept intergers. So we use this class to 
		                                   // convert integer to string
	}
	public void addGmail(String mail) {
		add.sendKeys(mail);// send keys does not accept intergers. So we use this class to 
		                                   // convert integer to string
	}
	

}
