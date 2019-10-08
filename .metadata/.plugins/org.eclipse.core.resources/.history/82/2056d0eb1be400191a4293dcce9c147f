package com.guru.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru.pageobjects.BaseClass;
import com.guru.pageobjects.Loginpage;
import com.guru.utilities.XLUtils;

import junit.framework.Assert;

public class TC_loginpage_002 extends BaseClass {

	@Test(dataProvider = "data")
	public void loginTest(String login, String password) {

		driver.get(baseurl);
		Logs.info("Browser Invoked");

		Loginpage lp = new Loginpage(driver);
		lp.setusername(login);
		Logs.info("Username Entered");

		lp.setpassword(password);
		Logs.info("Password Entered");

		lp.setloginbutton();
		Logs.info("logged In");
		Logs.info("Clicked on Login");

		if (isalertpresent() == true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			Logs.warn("Invalid Credentails Provided");
		} else {
			lp.setlogoutButton();
			Logs.info("Login Passed");
			driver.switchTo().alert().accept();
			Assert.assertTrue(true);
		}

	}

	public boolean isalertpresent() { // this is an user defined method

		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@DataProvider(name = "data")
	public String[][] testdata() throws IOException {

		String path = System.getProperty("user.dir") + "//src//test//java//com//guru//testdata//credentails.xlsx";
		int rowNum = XLUtils.getRowCount(path, "Sheet1");
		int columnCount = XLUtils.getCellCount(path, "Sheet1", rowNum);

		String loginData[][] = new String[rowNum][columnCount];

		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < columnCount; j++) {
				loginData[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;

	}

}
