package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Upload_File {

	// to uplaod file we can pass the path of the file in sendkeys
	// so instead of using click method on the button, use sendkeys with the path of the file
	
	// this will work only if type=file 

	@Test
	public void upload() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://s000.tinyupload.com/index.php?");

		driver.findElement(By.xpath("//input[@name='uploaded_file']"))
				.sendKeys("C:\\Users\\dileep.ks\\Downloads\\URC Report Test Case.xlsx");
	}

}
