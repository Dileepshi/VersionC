package com.guru.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru.pageobjects.BaseClass;
import com.guru.pageobjects.Loginpage;
import com.guru.pageobjects.NewCustomer;


public class TC_NewCustomer_001 extends BaseClass {

	@Test
	public void Newcustomer() {

		Loginpage lp = new Loginpage(driver);
		lp.setusername(loginid);
		Logs.info("Username Entered");

		lp.setpassword(loginpassword);
		Logs.info("Password Entered");

		lp.setloginbutton();
		Logs.info("logged In");
		Logs.info("Clicked on Login");

		Logs.info("click on New Customer");

		NewCustomer nc = new NewCustomer(driver);
		nc.clickNewCustomer();
		Logs.info("clicked on New Customer");

		nc.addNewCustomer(2);
		Logs.info("Entered Customer Name");

		String gmail = randomstring() + "gmail.com";
		nc.addGmail(gmail);
		Logs.info("Entered Gmail");

		boolean result = driver.getPageSource().contains("Succesffuly added");

		if (result == true) {
			Assert.assertTrue(true);
			Logs.info("Test Case Passed");
		} else {
			Logs.info("Test Case Failed");
			Assert.assertTrue(false);
		}

	}

}
