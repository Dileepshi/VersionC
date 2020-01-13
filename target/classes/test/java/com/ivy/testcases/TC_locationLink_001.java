package com.ivy.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;
import com.ivy.pageobjects.UserManagement_Location;

public class TC_locationLink_001 extends Baseclass {

	UserManagement_Location ul;

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeMethod
	public void loginsetup() throws Exception {

		driver.get(baseUrl);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickLoginButton();
		Thread.sleep(5000);

		WebElement element1 = driver.findElement(By.xpath("//*[text()='Masters']"));
		WebElement element2 = driver.findElement(By.xpath("//*[text()='User Management']"));
		moveover(element1, element2);
	}

	@Test(priority = 1)
	public void verifylocationLink() throws Exception {

		ul = new UserManagement_Location(driver);
		Thread.sleep(1000);
		movecursor();
		Thread.sleep(1000);
		int frameid1 = frame(driver, By.xpath(".//span[text()='Location']"));
		driver.switchTo().frame(frameid1);
		ul.locationcomponentLink();

	}

	@AfterMethod
	public void end() {

		driver.quit();
	}

}
