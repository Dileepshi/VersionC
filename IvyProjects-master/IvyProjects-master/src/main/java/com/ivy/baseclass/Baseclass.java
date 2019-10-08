package com.ivy.baseclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.ivy.utils.Readconfig;

public class Baseclass {

	public WebDriver driver;

	Readconfig readconfig = new Readconfig();
	public String baseUrl = readconfig.getBaseurl();
	public String userName = readconfig.getUsername();
	public String password = readconfig.getPassword();
	//public String browserName = readconfig.getBrowsername();
	public String locationdata_path = readconfig.getlocationDataPath();
	public String locationSheetname = readconfig.getlocationDatasheetname();

	public static Logger Logs = LogManager.getLogger(Baseclass.class.getName());
	
	// to send browsername from cmd
	
	String browserName=System.getProperty("browser");

	@BeforeClass
	public WebDriver setup() {

		if (browserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			Logs.info("Browser Invoked");

		}
		if (browserName.equalsIgnoreCase("chrome")) {

			
			System.setProperty("webdriver.chrome.driver",
					"D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			Logs.info("Browser Invoked");

		}
		if (browserName.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public void takescreenshot() throws Exception {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\Users\\dileep.ks\\workspace\\IvyProjects\\Screenshots"));

	}

	public void waitcondition(WebDriver driver, int timeout, WebElement element) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
	}

	public void moveover(WebElement element1, WebElement element2) throws Exception {

		Actions act = new Actions(driver);
		act.moveToElement(element1).perform();
		Thread.sleep(1000);
		act.moveToElement(element2).click().build().perform();

	}

	public void movecursor() throws Exception {

		Actions act1 = new Actions(driver);
		act1.moveByOffset(100, 100).click().build().perform();

	}

	public static int frame(WebDriver driver, By element) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();

		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(element).size();
			if (count > 0) {
				break;
			} else {
				System.out.println("Continue looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

	public static void selectDropDownValues(By by, WebDriver driver, String Value) {

		Select sel = new Select(driver.findElement(by));
		sel.selectByVisibleText(Value);
	}

	public static void calenderSelectJS(WebDriver driver, String dateVal,WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');",ele);

	}

	// @AfterClass
	public void quit() {

		driver.quit();
	}

}
