package screebshots;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Utility;

public class Screenshotfb {
	@Test
	public void openfb() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Utility.capture(driver, "Start");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Automation");
		Utility.capture(driver, "endshot");

	}

}
