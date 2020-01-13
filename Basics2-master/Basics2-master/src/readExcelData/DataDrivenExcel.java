package readExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelDataConfig;

public class DataDrivenExcel {

	WebDriver driver;

	@Test(dataProvider = "passdata")
	public void loginwordpress(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
		//driver.findElement(By.xpath(".//input[@id='u_0_2']")).click();
		System.out.println(driver.getTitle());

	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@DataProvider

	public Object[][] passdata() {

		ExcelDataConfig excel = new ExcelDataConfig(
				"D:\\Automation\\Excel\\Data.xlsx");
		int row = excel.getrowcount(0);
		int column = excel.getcolumnncount(0);
		Object[][] data = new Object[row][column];

		for (int i =1; i <= row; i++) {
			for (int j = 0; j < column; j++) {
				data[i-1][j] = excel.getdata(0, i, j);
			}
		}
		return data;
	}
}
