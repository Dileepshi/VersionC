package seleniumdemo4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	// it perfoms the following
	// Draganddrop
	// Contextclick
	// mouse over
	// mouse right clikc
	// slider
	// resizable

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		// incase if we have move to 3 elements via mouse over, it can be performed
		// act.moveToElement(ele).moveToElement(ele2)..moveToElement(ele3).build().perform();
		List<WebElement> lists = driver.findElements(By.xpath(".//div[@class='dropdown-content']//a"));
		// 1. Below is to type characters in Caps
		 //act.moveToElement(someelement).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		
		// 2. Below is to Select the entire text
		// act.moveToElement(someelement).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		// 3. Below is to right click on a specific element
		// act.moveToElement(someelement).contextClick().build().perform();
		// 4. Below is to drag and drop. Create source webelement and
		// destination webelement
		// act.clickAndHold(source).moveToElement(destination).release().build().perform();
		// or
		// act.dragAndDrop(source,destination).release().build().perform();

		System.out.println("size of items" + lists.size());

		for (int i = 0; i < lists.size(); i++) {
			WebElement itemname = lists.get(i);

			String itemtext = itemname.getAttribute("innerHTML");
			boolean status = itemname.isEnabled();
			System.out.println("name of the element " + itemtext + " Status of the element" + status);

			if (itemtext.equalsIgnoreCase("Appium")) {
				itemname.click();
				break;	
			}
		}

	}

}
