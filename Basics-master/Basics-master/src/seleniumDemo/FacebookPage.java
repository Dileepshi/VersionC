package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("email")).sendKeys("Dileep");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Dileep");
		driver.findElement(By.id("pass")).sendKeys("Dils");
		// driver.findElement(By.name("Log In")).click();
		Select sel = new Select(driver.findElement(By.id("day")));
		Select sel1 = new Select(driver.findElement(By.id("month")));
		Select sel2 = new Select(driver.findElement(By.id("year")));
		sel.selectByIndex(2);
		sel1.selectByValue("1");
		sel2.selectByVisibleText("1994");
		driver.quit();

	}

}
