package seleniumdemo6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

////////////////Listener at class level///////////////////////
//@Listeners(seleniumdemo6.TestngListener.class)
///////////////Listener at Suite level will be done in XML file.. please check XML name ;  testnglistener////
public class ListenerCase {

	@Test
	public void Case() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		System.out.println(driver.getTitle());
	}

	@Test
	public void Case1() {

		System.out.println("Test Case 2 ");
		Assert.assertTrue(false);

	}

}
