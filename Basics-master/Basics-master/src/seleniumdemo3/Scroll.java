package seleniumdemo3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll {

	@Test
	public void scrollpage() throws Throwable {
		// javascript executor is an interface helps to run javascript in
		// selenium
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

	}

}
