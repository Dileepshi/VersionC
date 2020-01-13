package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Calenders {

	WebDriver driver;

	@Test
	public void calender() throws InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath(".//input[@class='inputSrch curPointFlt ']")).click();

		for (int i = 0; i <=12; i++)  
	   // or (int i = 12; i >= 1; i--) 
		{
			driver.findElement(By.xpath(".//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			String getMonth = driver.findElement(By.xpath(".//div[@class='DayPicker-Caption']")).getText();

			System.out.println("Months are   " + getMonth);

			if (getMonth.contains("December 2019")) {
				driver.findElement(By.xpath("//div[text()='18']")).click();
				break;

			}

		}

	}
}
