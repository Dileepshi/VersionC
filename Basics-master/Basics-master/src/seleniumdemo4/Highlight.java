package seleniumdemo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.HighlightHelper;

public class Highlight {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath(".//*[@id='email']"));
		HighlightHelper.highLightElement(driver, username);
		username.sendKeys("Dils");

		WebElement password = driver.findElement(By.xpath(".//*[@id='pass']"));
		HighlightHelper.highLightElement(driver, password);
		password.sendKeys("pass");

	}

}
