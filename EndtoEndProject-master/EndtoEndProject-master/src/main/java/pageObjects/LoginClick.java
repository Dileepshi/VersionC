package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClick {

	public WebDriver driver;

	By LoginLink = By.xpath(".//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	By title = By.xpath(".//h2[text()='Featured Courses']");
	By getNavigationBar = By.xpath(".//*[@class='navbar-collapse collapse']");

	public LoginClick(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement clickloginbutton() {

		return driver.findElement(LoginLink);

	}

	public WebElement gettiltetext() {

		return driver.findElement(title);

	}

	public WebElement getBar() {

		return driver.findElement(getNavigationBar);

	}

}
