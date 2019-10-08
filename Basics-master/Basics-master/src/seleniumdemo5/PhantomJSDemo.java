package seleniumdemo5;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import org.testng.annotations.Test;

import library.Utility;

public class PhantomJSDemo {

	@Test
	public void Verify() {

		File srs = new File("D:\\Automation\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", srs.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Utility.capture(driver, "Phantomjsexample");

	}

}
