package seleniumdemo4;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplewindow4 {

	@Test
	public void TestPopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		Set<String> allwindows = driver.getWindowHandles();

		for (String e : allwindows) {
			String titleName = driver.switchTo().window(e).getTitle();

			System.out.println("Title name is " + titleName);

		}

	}
}
