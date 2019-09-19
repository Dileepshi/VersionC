package com.ivy.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;
import com.ivy.pageobjects.UserManagement_Location;
import com.ivy.utils.ExcelData;

public class TC_LocationAdd_Datadriven extends Baseclass {

	LoginPage lp;
	UserManagement_Location ul;
	
	public TC_LocationAdd_Datadriven(){
		
		super();
	}

	@BeforeMethod
	public void loginsetup() throws Exception {
		if(driver!= null)
		{
			
			driver.get(baseUrl);

		}
		else
		{
			setup();
			driver.get(baseUrl);

		}
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
		ul.verfifySalesorglink();
		ul.verfiyAddbutton();
	}

	/*@DataProvider(name = "locationdata")
	public Object[][] addMultipleLocationsprovider() throws Exception {

		ExcelData locData = new ExcelData();
		Object[][] data = locData.getdata();

		return data;
	}*/

	@Test(dataProvider = "locationdata" ,dataProviderClass=ExcelData.class)
	public void addMultipleLocations(String code, String name) throws Exception {
		ul.addCode(code);
		ul.addName(name);
		ul.verifyLocationSaveButton();
		//ul.clickAddedAlert();

	}
	@AfterMethod
	public void disconnect()  {
	  driver.close();
	  driver = null;

	}
}
