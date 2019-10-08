package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OuterInnerFrame {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
			    driver.get("http://demo.guru99.com/test/guru99home/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			    int size = driver.findElements(By.tagName("iframe")).size();
			    System.out.println("Total Frames --" + size);
		        // prints the total number of frames 
			    
				driver.switchTo().frame(0); // Switching the Outer Frame    		
			    size = driver.findElements(By.tagName("iframe")).size();
			    // prints the total number of frames inside outer frame           
		                                                                                                          
			    System.out.println("Total Frames --" + size);
			    driver.switchTo().frame(0); // Switching to innerframe
			    
				driver.switchTo().defaultContent();
			}
		}

