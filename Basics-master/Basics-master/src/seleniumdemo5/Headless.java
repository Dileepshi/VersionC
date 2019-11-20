package seleniumdemo5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Headless {
	
		@Test
		public void headlessdemo() {

			
			ChromeOptions options= new ChromeOptions();
			options.addArguments("headless");
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.facebook.com");
			String actual = driver.getTitle();
			System.out.println(actual);

			Assert.assertTrue(actual.contains("log in or sign up"));
		}

	}