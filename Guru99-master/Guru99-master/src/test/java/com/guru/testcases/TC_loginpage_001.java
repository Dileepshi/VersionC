package com.guru.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru.pageobjects.BaseClass;
import com.guru.pageobjects.Loginpage;


public class TC_loginpage_001 extends BaseClass {

	@Test
	public void loginTest() {

		driver.get(baseurl);
		Logs.info("Browser Invoked");

		Loginpage lp = new Loginpage(driver);
		lp.setusername(loginid);
		lp.setpassword(loginpassword);

		lp.setloginbutton();
		Logs.info("logged In");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);
	}

}
