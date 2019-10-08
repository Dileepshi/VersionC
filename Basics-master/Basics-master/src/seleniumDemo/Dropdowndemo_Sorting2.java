package seleniumDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdowndemo_Sorting2 {
	@Test
	public void selectvalues() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement daydrop = driver.findElement(By.id("month"));
		Select sel = new Select(daydrop);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByValue("3");
		List<WebElement> month_list = sel.getOptions();
		List<WebElement> originallists = new ArrayList<>(month_list);


		System.out.println("before sorting List is  " + originallists);

	}
}