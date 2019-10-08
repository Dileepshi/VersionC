package WebTables;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// this is to get the count of rows where country is India
public class webtableforcount {

	WebDriver driver;

	@Test
	public void table() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation/SelenuimJars/webtable2.html");
		int rowCount = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();

		int countryCount = 0;

		for (int i = 2; i <= rowCount; i++) {

			String countryName = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[3]")).getText();

			if (countryName.equals("India")) {
				countryCount = countryCount + 1;
			}

		}
		System.out.println("Country count is " + countryCount);

	}
}
