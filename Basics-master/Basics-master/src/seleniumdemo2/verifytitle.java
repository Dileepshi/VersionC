package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifytitle {
	
	@Test
	public void title_verify(){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		String pagetitle = driver.getTitle();
		String expected_title="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by";
		Assert.assertEquals(pagetitle, expected_title);
		//or
		//Assert.assertTrue(pagetitle.contains("Selenium WebDriver tutorial"));
		String source = driver.getPageSource();
		Assert.assertTrue(source.contains("Selenium WebDriver tutorial"));
		driver.quit();	
	}
@Test
	public void test1 (){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		String error= driver.findElement(By.xpath("//div[@class='m6Azde DbQnIe OcVpRe']//div[1]//div[1]//div[2]//div[2]//div[1]")).getText();
		//or - String error= driver.findElement(By.xpath("//div[@class='m6Azde DbQnIe OcVpRe']//div[1]//div[1]//div[2]//div[2]//div[1]")).getAttribute("innerHTML");
		
		System.out.println("Error is " + error);
	}
}
