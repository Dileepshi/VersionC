package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

// this test case is to compare the expected and actual output of the screen
public class DataDrivenExcel2 {

	WebDriver driver;
	File fil;
	FileInputStream fl;
	XSSFWorkbook wb;
	XSSFSheet xs;

	@Test
	public void loginwordpress() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/fixed-deposit-calculator.html");
		driver.manage().window().maximize();

		fil = new File("C:\\Users\\dileep.ks\\workspace\\Basics2\\Resources\\credentails.xlsx");
		fl = new FileInputStream(fil);
		wb = new XSSFWorkbook(fl);
		xs = wb.getSheet("sheet1");

		int rowCount = xs.getLastRowNum();
		// int columnCount = xs.getRow(0).getLastCellNum();

		for (int i = 1; i < rowCount; i++) {
			
			XSSFRow currentRow = xs.getRow(i);

			XSSFCell it = currentRow.getCell(0);
			int investToday = (int) it.getNumericCellValue();
			XSSFCell ip = currentRow.getCell(1);
			int investmentPeriod = (int) ip.getNumericCellValue();
			XSSFCell ir = currentRow.getCell(2);
			int interestRate = (int) ir.getNumericCellValue();
			XSSFCell iem = currentRow.getCell(3);
			int investEverymonth = (int) iem.getNumericCellValue();
			XSSFCell fr = currentRow.getCell(4);
			String Frequency = fr.getStringCellValue();

			XSSFCell tp = currentRow.getCell(5);
			int ExpectedTotalPayment = (int) tp.getNumericCellValue();

			driver.findElement(By.id("invest_today")).clear();
			driver.findElement(By.id("invest_today")).sendKeys(String.valueOf(investToday));
			driver.findElement(By.id("investment_period")).clear();
			driver.findElement(By.id("investment_period")).sendKeys(String.valueOf(investmentPeriod));
			driver.findElement(By.id("Interest_rate")).clear();
			driver.findElement(By.id("Interest_rate")).sendKeys(String.valueOf(interestRate));
			driver.findElement(By.id("invest_every")).clear();
			driver.findElement(By.id("invest_every")).sendKeys(String.valueOf(investEverymonth));
			WebElement ivmElement = driver.findElement(By.id("invest_every"));
			Select sel = new Select(ivmElement);
			sel.selectByVisibleText(Frequency);
			driver.findElement(By.xpath(".//a[@class='btn_common MR15']")).click();

			// get the total payment
			String actualTotalPayment = driver.findElement(By.xpath(".//*[@id='total_payment']")).getText();
			// int a = Integer.parseInt(actualTotalPayment);

			if (Integer.parseInt(actualTotalPayment) == ExpectedTotalPayment) {
				Assert.assertTrue(true);
			} else
				Assert.assertTrue(false);
		}

	}
}
