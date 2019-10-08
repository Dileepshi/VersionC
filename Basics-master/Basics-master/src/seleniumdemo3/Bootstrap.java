package seleniumdemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bootstrap {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("d");
		Reporter.log("---- Browser Started -----", true);
	}

	@Test
	public void boot() {
		driver.findElement(By.xpath(".//button[text()='Click here to Login']")).click();
		driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Dileep");
		Reporter.log("----Login -----", true);
	}

	@AfterTest
	public void logoff() {
		driver.quit();
		Reporter.log("---- Browser Ends -----", true);
	}

}
