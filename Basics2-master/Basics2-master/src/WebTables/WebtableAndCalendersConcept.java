package WebTables;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebtableAndCalendersConcept {

	WebDriver driver;

	@Test
	public void table() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation/SelenuimJars/webtable1.html");
		int rowCount = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		int columnCount = driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();

		boolean flag = false;
		// Excel starts with 0 , web table starts with 1
		for (int i = 2; i <= rowCount; i++) {

			for (int j = 1; j <= columnCount; j++) {

				String Value = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();

				if (Value.contains("UK")) {	
					flag = true;
					break;
				}
			}

			if (flag) {
				Assert.assertTrue(true);
				break;

			}

		}
	}
}
