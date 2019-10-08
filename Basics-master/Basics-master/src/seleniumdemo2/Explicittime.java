package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicittime {
	
	@Test
	public void explit (){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);-- this is for implicit wait
		driver.findElement(By.xpath(".//button[text()='Click me to start timer']")).click();
		WebDriverWait wait  = new WebDriverWait(driver , 30);
		WebElement  ele =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='WebDriver']]")));// this element displays slowly on UI
		
		
		Boolean Status =ele.isDisplayed();
		if(Status)
		{
			System.out.println("Is Displayed");

		}
		else
		{
			System.out.println("Is not Displayed");
		}
	}
	

}
