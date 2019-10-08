package seleniumdemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath(".//a[@id='get_sign_up']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// driver.switchTo().frame(0);
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath(".//input[@id='authMobile']")).sendKeys("hello");
		driver.switchTo().defaultContent();

	}

}
