package seleniumdemo4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplewindow3 {
	@Test
	public void win() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String mainWindow = driver.getWindowHandle();
		//set does not have the values on the basis of indexes. so we use iterator
		Set<String> allWindows = driver.getWindowHandles();
		// iterator points to the top of the object. so next() is used to iterate from the top to last.
		//controller will move to the next window
		Iterator<String> windows = allWindows.iterator();

		while (windows.hasNext()) {
			String childWindow = windows.next();
			// String ChildWindow=i1.next();

			if (!mainWindow.equalsIgnoreCase(childWindow)) {

				// Switching to Child window
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

				// Closing the Child Window.
				driver.close();
			}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(mainWindow);
	}

}
