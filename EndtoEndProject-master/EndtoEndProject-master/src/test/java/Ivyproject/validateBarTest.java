package Ivyproject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginClick;
import resources.BaseClass;

public class validateBarTest extends BaseClass {
	private static Logger Logs = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializedriver();
		Logs.info("Browser Invoked");
		
		driver.get(pro.getProperty("url"));
		Logs.info("Navigated to Login page");
	}

	@Test
	public void navbar() throws IOException {

		LoginClick l = new LoginClick(driver);
		Assert.assertTrue(l.getBar().isDisplayed());// assert true expects true,
													// If displayed gives false
													// , test gets failed
		Logs.info("Assertion has been completed");

	}

	@AfterTest
	public void closedriver() {

		driver.close();
		driver=null;


	}

}
