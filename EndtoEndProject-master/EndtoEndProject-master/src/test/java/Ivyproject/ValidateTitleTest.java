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

public class ValidateTitleTest extends BaseClass {
	private static Logger Logs = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialize() throws Exception {

		driver = initializedriver();
		Logs.info("Browser Invoked");

		driver.get(pro.getProperty("url"));
		Logs.info("Navigated to Login page");

	}

	@Test
	public void titlename() throws IOException {

		LoginClick l = new LoginClick(driver);
		l.gettiltetext().getText();

		Assert.assertEquals(l.gettiltetext().getText(), "FEATURED COURSES");
		Logs.info("Text Message has been validated");

	}

	@AfterTest
	public void closedriver() {

		driver.close();
		driver=null;
		

	}

}
