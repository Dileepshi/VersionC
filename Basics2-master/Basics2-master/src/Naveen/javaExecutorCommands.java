package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class javaExecutorCommands {

	WebDriver driver;

	@Test
	public void javaCommands() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='email']"));

		// this is to create border for the element
	/*	javaExecutorCommands.drawborder(ele, driver);*/
		// this is to show message
		javaExecutorCommands.generateAlert(driver, "TestCasePassed");
		/*// there are chances where webdriver can't find the element to click. so
		// use java script executor to click on the element
		javaExecutorCommands.clickonElement(driver, ele);
		// refresh the page by using selenuim
		driver.navigate().refresh();
		// refresh the page by using java script
		javaExecutorCommands.refreshPage(driver);
		// return string by java script executor
		System.out.println(javaExecutorCommands.gettitle(driver));
		// this is to scroll to view the element
		javaExecutorCommands.scrollintoview(driver, ele)*/;
	}

	public static void drawborder(WebElement ele, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);

	}

	public static void generateAlert(WebDriver driver, String message) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");

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
}
