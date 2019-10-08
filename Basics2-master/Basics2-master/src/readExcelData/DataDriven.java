package readExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	WebDriver driver;

	@Test(dataProvider = "wordpressdata")
	public void loginwordpress(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath(".//input[@id='u_0_2']")).click();
		System.out.println(driver.getTitle());

	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@DataProvider(name = "wordpressdata")
	public String[][] passdata() {
		String[][] data = new String[2][2]; // first [2] is the no of
											// combinations
		// 1st set
		data[0][0] = "dileepshi";
		data[0][1] = "mylife@123";
		// 2nd set
		data[1][0] = "dileepshi1";
		data[1][1] = "mylife@1231";
		return data;
	}
}
