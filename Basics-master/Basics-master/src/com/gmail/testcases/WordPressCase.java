package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import com.gmail.pages.Loginpage;
import com.gmail.pages.WordPressRepositoryPF;

import library.BrowserFactory;

public class WordPressCase {
	
	@Test
	public void checkvaliduser(	){
		
		// This will launch the browser and Specfic URL
		WebDriver driver  = BrowserFactory.startbrowser("FireFox", "https://www.facebook.com/");
		
		//Created page object using page factory where here u can specify from which Page factory we want elements.Also this step can be specified in page factory class itself
		//PageFactory.initElements(driver, WordPressRepositoryPF.class);
		WordPressRepositoryPF PF = new WordPressRepositoryPF(driver);
		PF.facebooklogin("dils", "pass");
		
		
	
		
	
	}

}
