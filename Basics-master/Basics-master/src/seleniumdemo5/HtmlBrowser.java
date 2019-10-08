package seleniumdemo5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlBrowser {
	
	

	public class HeadlessBrowser {
		// this runs in background
		@Test
		public void headlessdemo() {

			WebDriver driver = new HtmlUnitDriver();
			driver.get("https://www.facebook.com");
			String actual = driver.getTitle();

			Assert.assertTrue(actual.contains("log in or sign up"));
		}

	}


}
