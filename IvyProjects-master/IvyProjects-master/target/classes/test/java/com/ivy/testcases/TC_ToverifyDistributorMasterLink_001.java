package com.ivy.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ivy.baseclass.Baseclass;
import com.ivy.pageobjects.DistributorMaster;
import com.ivy.pageobjects.LoginPage;

public class TC_ToverifyDistributorMasterLink_001 extends Baseclass {

	DistributorMaster dm;

	@BeforeMethod
	public void Loginsetup() throws Exception {

		driver.get(baseUrl);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickLoginButton();
		Thread.sleep(1000);

	}

	@Test
	public void verfifyDistlink() throws Exception {

		WebElement element1 = driver.findElement(By.xpath("//*[text()='Masters']"));
		WebElement element2 = driver.findElement(By.xpath("//*[text()='Distributor Hierarchy']"));
		moveover(element1, element2);
		movecursor();
		int frameid = frame(driver, By.xpath("//*[@id='_distributorLevel']/div[1]"));
		driver.switchTo().frame(frameid);
		Thread.sleep(2000);
		dm = new DistributorMaster(driver);
		dm.verifyDistributorLevelLink();
		dm.verifyDistributorAddLink();
		Thread.sleep(2000);
		/*
		 * int frameid2 = frame(driver, By.xpath(
		 * "//td[@class='td_label']/label[text()='Area Development Manager']//following::td[@class='td_text']//following::div[@class='button']/label[contains(text(),'Filter')]"
		 * )); driver.switchTo().frame(frameid2);
		 */
		dm.verifyADMFilterLink();
		selectDropDownValues(By.xpath("//*[@id='DH_CM']"), driver, "COMM DIRECTOR HEAD");
		selectDropDownValues(By.xpath("//*[@id='DH_NSM']"), driver, "NSM-NIGERIA");
		selectDropDownValues(By.xpath("//*[@id='DH_DSM']"), driver, "DSM- EAST SIDE");
		selectDropDownValues(By.xpath("//*[@id='DH_ADM']"), driver, "ASM-BENERGEE");
		dm.verifyLocationSelectButton();
		dm.verifyLocationFilterLink();
		dm.verifyLocationSelectLink();
		dm.verifyLocationSaveButton();
		dm.verifyaddDistCode("abc");
		dm.verifyaddDistName("abc");
		dm.verifyaddTinNO("1235");
		dm.verifydistributorDetailsSaveButton();

	}

}
