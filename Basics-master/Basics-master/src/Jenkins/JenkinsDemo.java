package Jenkins;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo {

	@Test
	public void Demo() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,
				"D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation/SelenuimJars/fileupload.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:\\Automation\\SelenuimJars\\AutoIT\\fileupload.exe");
		

	}

}
