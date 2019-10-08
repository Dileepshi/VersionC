package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;
import com.crm.pages.calenderPage;

import junit.framework.Assert;

public class TC_Calender_001 extends BaseClass {

	Homepage homepage;
	calenderPage calenderPage;

	@BeforeMethod
	public void invokebrowser() {

		driver.get(baseurl);
		Logs.info("Browser Invoked");
		Loginpage lp = new Loginpage(driver);
		lp.setusername(loginid);
		lp.setpassword(loginpassword);
		homepage = lp.setloginbutton();
		calenderPage = homepage.clickcalenderLink();
	}

	@Test(priority = 1)
	public void CalenderTest() {

		String CalenderLabel = calenderPage.getCalenderLable();
		Assert.assertEquals(CalenderLabel, "Calendar");
		calenderPage.verifyCalenderNextButton();

	}

	@AfterMethod
	public void quit() {
		driver.quit();

	}
}
