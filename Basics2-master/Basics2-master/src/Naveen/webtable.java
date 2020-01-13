package Naveen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtable {

	WebDriver driver;

	@Test
	public void table() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
