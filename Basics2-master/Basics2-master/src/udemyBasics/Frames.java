package udemyBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath(".//a[@id='get_sign_up']")).click();
		int number = frame(driver, By.xpath(".//input[@id='authMobile']"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//input[@id='authMobile']")).sendKeys("Dileep");
	
	}

	public static int frame(WebDriver driver, By by) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();

		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count > 0) {
				break;
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}
