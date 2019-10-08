package seleniumdemo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_slider {

	
    @Test
	public void slider() {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
        WebElement ele =driver.findElement(By.xpath("//*[@id='slider']/span"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).dragAndDropBy(ele, 100, 0).build().perform();
        // we can use the same for resizing also
        // WebElement ele1 =driver.findElement(By.xpath("//*[@id='slider']/span"));
        // act.moveToElement(ele1).dragAndDropBy(ele1, 100, 0).build().perform();
	}
}
