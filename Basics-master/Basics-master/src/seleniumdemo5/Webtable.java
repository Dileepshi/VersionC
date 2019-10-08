package seleniumdemo5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Webtable {

	@Test
	public void multipledemo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@id='src']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath(".//input[@id='dest']")).sendKeys("Tirupathi");
		driver.findElement(By.xpath(".//input[@id='onward_cal']")).click();
		Thread.sleep(3000);
		// this is to directly click on a date
		driver.findElement(By.xpath(".//div[@id='rb-calendar_onward_cal']/table[1]/tbody/tr[5]/td[5]")).click();
		// this is to get all the web elements and click on a particular date
		List<WebElement> numbers = driver.findElements(By.xpath(".//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		for (int i = 0; i < numbers.size(); i++)

		{
			String name = numbers.get(i).getText();
			if (name.equalsIgnoreCase("31")) {
				numbers.get(i).click();
				break;
			}
		}

	}

}
