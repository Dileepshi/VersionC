package Ivyproject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginClick;
import pageObjects.LoginPage;
import resources.BaseClass;

public class HomePageTest extends BaseClass {
	private static Logger Logs = LogManager.getLogger(HomePageTest.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializedriver();
		Logs.info("Browser Invoked");
	}

	@Test(dataProvider = "getdata")
	public void navigate(String UN, String PW, String Text) throws IOException {

		driver = initializedriver();// use this step in the @test since we have
		// parameters to be supplied here and if we specify it in before test , it will not run since before test runs  only once
		
		driver.get(pro.getProperty("url"));
		Logs.info("Navigated to Login page");
		
		LoginClick l = new LoginClick(driver);
		l.clickloginbutton().click();
		LoginPage lp = new LoginPage(driver);
		lp.getemailedit().sendKeys(UN);
		lp.getemailpassword().sendKeys(PW);
		lp.loginButton().click();
		
	
		Logs.info(Text);

	}

	@DataProvider
	public Object[][] getdata() {

		// row stands for how many sets of data to run
		// column stands for how many values per each test
		Object[][] data = new Object[2][3];

		data[0][0] = "Dileep";
		data[0][1] = "dils";
		data[0][2] = "Test done";

		data[1][0] = "Dil";
		data[1][1] = "hi";
		data[1][2] = "Test done";

		return data;

	}

	@AfterTest
	public void closedriver() {

		driver.close();
		driver=null;
	

	}

}
