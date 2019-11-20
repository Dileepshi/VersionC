package seleniumDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdowndemo_Sorting2 {
	@Test
	public void selectvalues() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement daydrop = driver.findElement(By.id("month"));
		Select sel = new Select(daydrop);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByValue("3");
		List<WebElement> month_list = sel.getOptions();
		//we can't take the list of webelements and put it in an String array like below
		// you should take the strings of the webelements and add in the String array
		//List<WebElement> originallists = new ArrayList<>(month_list);
		List<String> originallists1 = new ArrayList<>();
		
		for (WebElement e : month_list) {
			
			 originallists1.add(e.getText());
		}


		System.out.println(" Sorting List is  " + originallists1);

	}
}