package seleniumdemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert1 {
	@Test
	public void test1(){
		WebDriver driver =new ChromeDriver();
		String hello="Dileep";
		Assert.assertTrue(hello.contains("Dilee"),"---not matching---");
		Assert.assertTrue(driver.findElement(By.id("hp-widget__sfrom")).isSelected());//usually use for checkboxes if they are checked.
		}
	@Test
	public void test2(){
		
		Assert.assertTrue(false);
		}
	
	//isEnabled() This method checks if an element is enabled. Returns true if enabled,
	//else false for disabled.
	//isSelected() This method checks if element is selected (radio button, checkbox, and
	//so on). It returns true if selected, else false for deselected
	//isDisplayed() This method checks if element is displayed.

}
