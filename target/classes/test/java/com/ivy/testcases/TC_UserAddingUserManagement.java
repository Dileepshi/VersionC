package com.ivy.testcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.LoginPage;
import com.ivy.pageobjects.UserManagement_UserMapping;

public class TC_UserAddingUserManagement extends Baseclass {

	LoginPage lp;
	UserManagement_UserMapping uu;

	@BeforeClass
	public void loginsetup() throws Exception {
		driver.get(baseUrl);
		lp = new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickLoginButton();
		Thread.sleep(2000);
		Logs.info("Logged in Successfully");

		WebElement element1 = driver.findElement(By.xpath("//*[text()='Masters']"));
		WebElement element2 = driver.findElement(By.xpath("//*[text()='User Management']"));
		moveover(element1, element2);
		Thread.sleep(2000);
		movecursor();

	}

	@Test
	public void userMappingCase() throws Exception {

		uu = new UserManagement_UserMapping(driver);
		int frameid1 = frame(driver, By.xpath("//span[text()='User Mapping']"));
		int size1 = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(frameid1);
		Thread.sleep(2000);
		uu.verifyuserMappingLink();
		// int frameid2 = frame(driver, By.xpath("//*[@id='add']/label"));
		driver.switchTo().frame("iContent");
		uu.verifyuserMappingAddLink();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today);
		System.out.println(date);

		uu.verifyaddUserCode();
		uu.verifyaddUserName();
		uu.verifyaddFirstName();
		uu.verifyaddEmailID();
		uu.verifyaddMobileNo();

		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td"));
		int sizeofdates = dates.size();

		for (int i = 0; i < sizeofdates; i++) {
			String datename = dates.get(i).getText();

			if (datename.equals("25")) {

				dates.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id='Authentication_SUA_Login_Id']")).sendKeys("looo");
		WebElement ele = driver.findElement(By.xpath("//*[@id='SU_DOJ']"));
		calenderSelectJS(driver, date, ele);

		uu.verifySaveButton();
	}
}
