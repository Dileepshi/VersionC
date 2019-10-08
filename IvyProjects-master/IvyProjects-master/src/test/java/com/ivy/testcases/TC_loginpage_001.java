package com.ivy.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;

public class TC_loginpage_001 extends Baseclass {

	@BeforeMethod
	public void loginsetup() {

		driver.get(baseUrl);
		Logs.info("Logged into the application");
	}

	@Test(priority=1)
	public void loginpagetest() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(userName);
		Logs.info("Logged in");

		lp.setPassword(password);
		lp.clickLoginButton();
		System.out.println("Title of the page is" + driver.getTitle());

	}

	@AfterMethod
	public void end() {

		driver.quit();;

	}
}