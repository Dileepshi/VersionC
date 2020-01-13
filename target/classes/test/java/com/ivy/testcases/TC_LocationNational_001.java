package com.ivy.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;
import com.ivy.pageobjects.UserManagement_Location;

public class TC_LocationNational_001 extends Baseclass {

	LoginPage lp;
	UserManagement_Location ul;

	@BeforeMethod
	public void loginSetup() throws Exception {

		driver.get(baseUrl);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickLoginButton();
		Thread.sleep(1000);

		WebElement element1 = driver.findElement(By.xpath("//*[text()='Masters']"));
		WebElement element2 = driver.findElement(By.xpath("//*[text()='User Management']"));

		moveover(element1, element2);
		Thread.sleep(1000);
		ul = new UserManagement_Location(driver);
		movecursor();
		Thread.sleep(1000);
		int frameid1 = frame(driver, By.xpath(".//span[text()='Location']"));
		driver.switchTo().frame(frameid1);
		ul.locationcomponentLink();
		driver.switchTo().frame("iContent");
	}

	@Test
	public void verifyTerritory() {

		ul.verifyNationallink();
		ul.verfiyAddbutton();
		selectDropDownValues(By.id("PLF_Nat"), driver, "a");
		ul.addCode("aaa");
		ul.addName("bb");
		ul.verifyLocationSaveButton();
		driver.switchTo().defaultContent();
		String alertMessage = driver.findElement(By.id("alertContent")).getText();
		if (alertMessage.contains("successfully!")) {

			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);

	}

}
