package com.ivy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;
import com.ivy.pageobjects.UserManagement_Location;

public class ExcelData2 extends Baseclass {

	FileInputStream fil;
	XSSFWorkbook wb;
	XSSFSheet sh;
	UserManagement_Location ul;
		
	@Test(dataProvider = "locationdata")
	public void loginsetup(String code, String name) throws Exception {
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
		ul.verfifySalesorglink();
		ul.verfiyAddbutton();
		ul.addCode(code);
		ul.addName(name);
		ul.verifyLocationSaveButton();
		ul.clickAddedAlert();
	}

	@DataProvider(name="locationdata")
	public String[][] getdata() throws IOException {

		try {
			fil = new FileInputStream(locationdata_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		wb = new XSSFWorkbook(fil);
		sh = wb.getSheet(locationSheetname);
		
		String[][] data = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
      
		for (int i = 0; i < sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {

				data[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}

}
