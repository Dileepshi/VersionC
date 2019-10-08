package seleniumdemo4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewindowoptimized {

	public void Window() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Limiting the driver
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// Limiting the driver further more
		WebElement footerSmallDriver = footerDriver.findElement(By.xpath("//table/body/tr/td[1]ul"));
		System.out.println(footerSmallDriver.findElements(By.tagName("a")).size());

		// Here if we click on one link, you have to come back to the page and click on the other link
		// instead we have an optimized code to organize this by clicking it by control click

		for (int i = 0; i < footerSmallDriver.findElements(By.tagName("a")).size(); i++) {
			String clickontab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerSmallDriver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
		}
		
		// Now get the ids of all the windows
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> it = Windows.iterator();

		while (it.hasNext()) {
			String childWindow = it.next();

			driver.switchTo().window(childWindow);
			System.out.println(driver.getTitle());

		}

	}

}
