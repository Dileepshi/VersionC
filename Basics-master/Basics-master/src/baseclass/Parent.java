package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Parent  {
	
WebDriver driver;
	
	@BeforeTest // or 
	//@BeforeClass //  will run only once for all the @Tests in child
	public void setup(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
        Reporter.log("---- Browser Started -----",true);
	}
	@AfterTest
	//@AfterClass //  will run only once for all the @Tests in child
	public  void logoff() {
	        driver.quit();
			 Reporter.log("---- Browser Ends -----",true);
			}

}
