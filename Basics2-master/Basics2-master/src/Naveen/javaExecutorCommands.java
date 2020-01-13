package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaExecutorCommands {

	WebDriver driver;

	// JavaScriptExecutor is an Interface that helps to execute JavaScript through
	// Selenium Webdriver. JavaScriptExecutor provides two methods "executescript" &
	// "executeAsyncScript" to run javascript on the selected window or current
	// page.
	@Test
	public void javaCommands() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='email']"));

		getSizeofWindow(driver);
		// this is to create border for the element
		// javaExecutorCommands.drawborder(ele, driver);
		// this is to show message
		//javaExecutorCommands.generateAlert(driver, "TestCasePassed");
		/*
		 * // there are chances where webdriver can't find the element to click. so //
		 * use java script executor to click on the element
		 * javaExecutorCommands.clickonElement(driver, ele); // refresh the page by
		 * using selenuim driver.navigate().refresh(); // refresh the page by using java
		 * script javaExecutorCommands.refreshPage(driver); // return string by java
		 * script executor System.out.println(javaExecutorCommands.gettitle(driver)); //
		 * this is to scroll to view the element
		 * javaExecutorCommands.scrollintoview(driver, ele)
		 */;
	}

	public static void drawborder(WebElement ele, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);

	}

	public static void generateAlert(WebDriver driver, String message) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("alert('" + message + "')");
		js.executeAsyncScript("alert('" + message + "')");

	}

	public static void clickonElement(WebDriver driver, WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);

	}

	public static void refreshPage(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go[0]");

	}

	public static String gettitle(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;

	}

	public static void scrollintoview(WebDriver driver, WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}

	public static void scrollinthepage(WebDriver driver, WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	}

	public static void openURL(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// this can be used instead of using driver.get("url"); 
		// but this is not recommended to use since driver.get() will wait for the browser to open but JavascriptExecutor wont wait 
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
	}
	
	public static void getSizeofWindow(WebDriver driver) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeAsyncScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		Thread.sleep(3000);
		
		// Size of window
		long height = (Long) js.executeScript("return window.innerHeight;");
		long width = (Long) js.executeScript("return window.innerWidth;");
		
		System.out.println("Height is: " + height);
		System.out.println("Width is: " + width);

		
	}
}