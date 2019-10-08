package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterclass {

	@Parameters({ "URL", "username" })
	@Test
	public void par(String urlname, String name) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get(urlname);
		driver.findElement(By.name("q")).sendKeys(name);
	}

}
