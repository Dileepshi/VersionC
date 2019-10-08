package frames;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameDemo {
	// we can switch over the elements in frames using 3 ways.That is
	// By Index
	// By Name or Id
	// By Web Element--
	// How to switch back to the Main Frame is
	// driver.switchTo().parentFrame();
	// driver.switchTo().defaultContent();--

	@Test
	public void Demo() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		int size = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i <= size; i++) {
			driver.switchTo().frame(i);
			// this is to find on which frame this image is available
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}

		driver.switchTo().frame(1); // Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();

	}
}
