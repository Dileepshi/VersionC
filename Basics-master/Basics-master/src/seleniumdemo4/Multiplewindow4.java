package seleniumdemo4;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiplewindow4 {

	@Test
	public void TestPopUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		Set<String> allwindows = driver.getWindowHandles();

		for (String e : allwindows) {
			String titleName = driver.switchTo().window(e).getTitle();

			System.out.println("Title name is " + titleName);

		}

	}
}
