package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Radiobuttons {

	@Test
	public void buttons() {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> names = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));

		for (WebElement n : names) {
			String value = n.getAttribute("Value");

			System.out.println("names are " + value);
		}
	}

}
