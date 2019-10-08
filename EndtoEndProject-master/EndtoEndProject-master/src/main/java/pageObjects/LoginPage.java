package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By emailedit = By.xpath(".//input[@id='user_email']");
	By emailpassword = By.xpath(".//input[@id='user_password']");
	By loginButton = By.xpath(".//input[@value='Log In']");

	public WebElement getemailedit() {

		return driver.findElement(emailedit);

	}

	public WebElement getemailpassword() {

		return driver.findElement(emailpassword);

	}

	public WebElement loginButton() {

		return driver.findElement(loginButton);

	}
}
