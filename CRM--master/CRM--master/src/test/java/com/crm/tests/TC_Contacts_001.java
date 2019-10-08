package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;
import com.crm.pages.contactsPage;
import com.crm.utils.ExcelData;

public class TC_Contacts_001 extends BaseClass {

	Homepage homepage;
	contactsPage contactsPage;
	ExcelData ExcelData;
	String sheetname = "contacts";

	@BeforeMethod
	public void invokebrowser() {

		driver.get(baseurl);
		Logs.info("Browser Invoked");
		Loginpage lp = new Loginpage(driver);
		lp.setusername(loginid);
		lp.setpassword(loginpassword);
		homepage = lp.setloginbutton();
		contactsPage = homepage.clickcontactsLink();
	}
	
	@DataProvider
	public Object[][] getContactData() throws Exception {

		Object data[][] = ExcelData.testdata(sheetname);
		return data;
	}

	@Test(priority = 1, dataProvider = "getContactData")
	public void createNewContact(String firstName, String lastName) {

		contactsPage.clickNewContactLink();
		contactsPage.createNewContact(firstName, lastName);
	}

	@AfterMethod
	public void quit() {
		driver.quit();

	}

}
