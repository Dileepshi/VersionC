package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;

import junit.framework.Assert;

public class TC_Homepage_001 extends BaseClass {

	Homepage homepage;

	@BeforeMethod
	public void Setup() throws InterruptedException {
		setup();
		driver.get(baseurl);
		Logs.info("Browser Invoked");
		Loginpage lp = new Loginpage(driver);
		lp.setusername(loginid);
		lp.setpassword(loginpassword);

		homepage = lp.setloginbutton();
		Thread.sleep(10000);
		Logs.info("logged In");
	}

	@Test(priority = 1)
	public void VerifyHomePageTitle() {

		String homePageTitle = homepage.verifyHomepageTitle();
		Assert.assertEquals(homePageTitle, "CRM");
	}

	@AfterMethod
	public void quit() {
		driver.quit();

	}
}
