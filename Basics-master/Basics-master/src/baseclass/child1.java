package baseclass;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class child1 extends Parent {
	
	
   @Test(description="This case is for valid crendentails")
	public  void ch1() {
	        driver.findElement(By.xpath(".//button[text()='Click here to Login']")).click();
			driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Sandy");
			 Reporter.log("----Login -----",true);
			}
   
   @Test(description="This case is for invalid crendentails")
	public  void ch2() {
	        driver.findElement(By.xpath(".//button[text()='Click here to Login']")).click();
			driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Sandy");
			 Reporter.log("----Login -----",true);
			}
	

}
