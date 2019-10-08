package com.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GtalkHomeRepository {
WebDriver driver;
	
	By homelink =By.id("addlink");
	
	
	public GtalkHomeRepository(WebDriver driver){  // THis is constructor
		this.driver= driver; // here i am passing the test case driver to the local driver.
		}
	public void Clicklink(String un){
		driver.findElement(homelink).sendKeys(un);
		}

}
