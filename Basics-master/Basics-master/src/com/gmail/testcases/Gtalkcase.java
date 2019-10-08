package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gmail.pages.GtalkHomeRepository;
import com.gmail.pages.GtalkLoginRepository;

public class Gtalkcase {

	@Test
	public void Verifylogin() {
		// this is the case where we call different repository cases 
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		
		GtalkLoginRepository login = new GtalkLoginRepository(driver);
		login.typeusername("Dileep");// here u pass the parameter to the case 
		login.typepassword().sendKeys("pass");// here u add sendkeys method to the case
		login.clicklogin();
		GtalkHomeRepository Home = new GtalkHomeRepository(driver);
		Home.Clicklink("dell");
		driver.quit();
		//or
		//login.loginpagecase("Dileep");
		

	}

}
