package Naveen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webtable {

	WebDriver driver;

	@Test
	public void table() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation/SelenuimJars/webtable1.html");
		String beforePath = "/html/body/table/tbody/tr[";
		String afterPath = "]/td";	

		// Excel starts with 0 , web table starts with 1
		for (int i = 2; i <= 7; i++) {

			String text = driver.findElement(By.xpath(beforePath + i + afterPath)).getText();

			System.out.println(text);

		}
	}
}
