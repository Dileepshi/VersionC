package udemyBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadFiles {
	
	@Test
	public void download() {
		// this test case tells how to download files from a browser without asking for save file dialogue box
		// here we cant capture the elements of the dialogue box. so we use FirefoxProfile class to ignore that dialogue box

		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
       //   for chrome we use chromeoptions class
       FirefoxProfile profile = new FirefoxProfile();
       profile.setPreference("browser.helperApps.neverask.savetoDisk", "text/plain"); // set mime types as per the extension of the file we download
       // check this URL for mime types for different formats
       profile.setPreference("browser.download.manager.showWhenStarting", false);
       
       FirefoxOptions option = new FirefoxOptions();// profile object has to be set in the firefox options
       option.setProfile(profile);
       
       WebDriver driver = new FirefoxDriver(option);
       //
       driver.get("some url");
       // remaining code to click on the download button
       // all these are not required for chrome because we dont get tat popup in chrome

}
}
