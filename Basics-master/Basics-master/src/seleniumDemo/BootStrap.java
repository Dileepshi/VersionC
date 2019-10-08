package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BootStrap { // this is a dropdown which is not a select type

	@Test
	public void strap() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> allmenus = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		for (int i = 0; i < allmenus.size(); i++) {	
			WebElement elem = allmenus.get(i);

			String innerhtml = elem.getAttribute("innerHTML");
			if (innerhtml.contentEquals("JavaScript")) {
				elem.click();
			}

			System.out.println("names are " + innerhtml);
		}

	}

}
