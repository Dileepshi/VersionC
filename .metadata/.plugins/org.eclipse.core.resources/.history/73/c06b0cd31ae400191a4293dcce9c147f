package com.guru.pageobjects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.guru.utilities.Readconfig;

public class BaseClass {

	Readconfig readconfig = new Readconfig();
	public String baseurl = readconfig.getURL();
	public String loginid = readconfig.getusername();
	public String loginpassword = readconfig.getpassword();

	public WebDriver driver;
	public static Logger Logs = LogManager.getLogger(BaseClass.class.getName());

	@Parameters("browsername")
	@BeforeClass
	public WebDriver setup(String browsername) {

		if (browsername.equals("FireFox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browsername.equals("Chrome")) {

			driver = new ChromeDriver();

		} else if (browsername.equals("IE")) {

			driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public void getScreenshot(String result) throws Exception { // this shd be
																// specified in
																// Testng.Xml
																// file

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\dileep.ks\\workspace\\Guru99\\Screenshots\\" + result + ".png"));
	}

	public String randomstring() {
		String randomString = RandomStringUtils.randomAlphabetic(5);

		return randomString;

	}

	// this method can be used if driver has to wait till the element loads
	public static void waitcondition(WebDriver driver, int timeout, WebElement element) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));

	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}

}
