package seleniumdemo4;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiplewindow {
	
	// different ways of handling windows
	//1.use iterator and by while loop has next and next
	//2.by for loop

	@Test
	public void TestPopUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://naukri.com");

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		//driver.findElement(By.xpath(".//a[@href='http://www.google.com']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		int Count = allwindows.size();
		System.out.println("Size of childs" + Count);

		for (String child : allwindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("Dileep");
				driver.close();
			}

		}
		driver.switchTo().window(parent);
	}
}
