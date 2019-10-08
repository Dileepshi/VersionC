package seleniumdemo4;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiplewindow2 {

	@Test
	public void TestPopUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		
		// List is used for webelements and set is used in strings
		//difference between set and List is
		//List is collection of elements in an order.It allows duplicates
		//Set is a collection of elements in a disorder. It does not allow duplicates
		Set<String> allwindows = driver.getWindowHandles();// this method will return string
		ArrayList<String> tabs = new ArrayList<>(allwindows);
		driver.switchTo().window(tabs.get(2));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("title of the parent window" + driver.getTitle());

	}
}
