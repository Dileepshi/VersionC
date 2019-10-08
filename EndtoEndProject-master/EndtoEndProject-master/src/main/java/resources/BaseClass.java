package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

	public static WebDriver driver;// create driver object globally
	public Properties pro;

	public WebDriver initializedriver() throws IOException {
        
		FileInputStream fil = new FileInputStream(
				"C:\\Users\\dileep.ks\\EndtoEndproject\\src\\main\\java\\resources\\configdata.properties");
		pro = new Properties();
		pro.load(fil);
		String browsername = pro.getProperty("browser");

		if (browsername.equals("FireFox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
			

		} else if (browsername.equals("Chrome")) {

			driver = new ChromeDriver();

		} else if (browsername.equals("IE")) {

			driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws Exception{ // this shd be specified in Testng.Xml file
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\dileep.ks\\EndtoEndproject\\Screenshots\\"+result+".png"));
	}



}
