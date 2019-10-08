package com.crm.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;

import junit.framework.Assert;

public class TC_loginpage_001 extends BaseClass {
	
	//public TC_loginpage_001(){
		
	//	super();
	//}

	Homepage homepage;

	@BeforeMethod
	public void invokebrowser() {

		driver.get(baseurl);
		Logs.info("Browser Invoked");
	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {

		Loginpage lp = new Loginpage(driver);
		lp.setusername(loginid);
		lp.setpassword(loginpassword);

		homepage = lp.setloginbutton();
		Thread.sleep(10000);
		Logs.info("logged In");

		if (driver.getTitle().equals("CRM")) {

			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);
	}

}
