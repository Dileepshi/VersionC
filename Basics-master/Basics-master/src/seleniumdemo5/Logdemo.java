package seleniumdemo5;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logdemo {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("Logdemo");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		log.info("Browser Opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Browser Maximise");
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		log.info("Application Launched");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		log.info("Click on button");
	}

}
