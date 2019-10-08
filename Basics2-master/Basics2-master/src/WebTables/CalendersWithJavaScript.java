package WebTables;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CalendersWithJavaScript {

	WebDriver driver;

	@Test
	public void table() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//input[@class='inputSrch curPointFlt ']")).click();
		String dateVal = "Wed, 17 Jul";
		CalendersWithJavaScript.calenderSelectJS(driver, dateVal);

	}

	public static void calenderSelectJS(WebDriver driver, String dateVal) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');");

	}
}
