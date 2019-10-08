package seleniumdemo4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.ClickElement;

public class Element_not_clickable {

	@Test
	public void notclickable() {
		// javascript executor is an interface helps to run javascript in
		// selenium
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		ClickElement.click(driver, "persistent");
	}

}
