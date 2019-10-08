package com.crm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameUtil {
	
	public static int frame(WebDriver driver, By element) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();

		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(element).size();
			if (count > 0) {
				break;
			} else {
				System.out.println("Continue looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
	
	

}
