package com.ivy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;
import com.ivy.pageobjects.UserManagement_Location;

public class TC_LocationAdd_001 extends Baseclass {

	LoginPage lp;
	UserManagement_Location ul;

	@BeforeClass
	public void loginsetup() throws Exception {
		TC_locationLink_001 LL = new TC_locationLink_001();
		LL.setDriver(driver); // i have created this method , since this class
								// was not getting driver from base class.
		LL.loginsetup();
		Logs.info("Logged in Successfully");
		LL.verifylocationLink();
		
	}

	@Test
	public void verifyLocationAdd() throws Exception {

		driver.switchTo().frame("iContent");
		Thread.sleep(1000);
		ul = new UserManagement_Location(driver);
		ul.verfifySalesorglink();
		ul.verfiyAddbutton();
		ul.addCode("all");
		ul.addName("all");
		ul.verifyLocationSaveButton();
	}
}
