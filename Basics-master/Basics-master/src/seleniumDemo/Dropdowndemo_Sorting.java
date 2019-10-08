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

public class Dropdowndemo_Sorting {
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
		// sel.selectByVisibleText("AUG");
		WebElement selectedvalue = sel.getFirstSelectedOption();
		System.out.println("value is " + selectedvalue.getText());

		// Create an array list for original list
		List<String> originallist = new ArrayList<>();

		// Create an array list for temp list
		List<String> tempList = new ArrayList<>();
		List<WebElement> month_list = sel.getOptions();
		int totalmonths = month_list.size();
		Assert.assertEquals(totalmonths, 13);

		for (WebElement ele : month_list) {

			// add all the elements to original list
			originallist.add(ele.getText());

			// add all the elements to temp list
			tempList.add(ele.getText());
		}
		System.out.println("before sorting List is  " + tempList);

		// sorting the elements in the templist
		Collections.sort(tempList);

		System.out.println("After sorting List is  " + tempList);

	}
}