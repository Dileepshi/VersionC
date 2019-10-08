package seleniumdemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Fluentwaitexample {
	// we can change the default polling period based on the requirement//default - 250 msec
	@Test
	public void explit (){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);-- this is for implicit wait
		driver.findElement(By.xpath(".//button[text()='Click me to start timer']")).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(1, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);

			WebElement ele = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
				  
				  WebElement ele = driver.findElement(By.xpath(".//p[@id='demo']"));
			String value=ele.getAttribute("innerHTML");
				if (value.equals("Webdriver"))
				{
					return ele;
				}
				else
				{
				 System.out.println("text coming is" + value);
			  return null;
				}
			}
			});
			
			System.out.println("Element is displayed ? "  + ele.isDisplayed());
			
		}
}
