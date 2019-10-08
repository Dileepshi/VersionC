package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Configheader;

public class ConfigDemo {

	@Test
	public void testconfig() throws Exception {

		Configheader conf = new Configheader();
		String path = conf.getfirepath();
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(conf.applicationURL());

	}

}
