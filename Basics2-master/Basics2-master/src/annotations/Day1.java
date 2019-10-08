package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	// before method and after method is specific to class file.
	// before test and before suite depends on the XML file number of tests u execute
	// before and after class is specific to a class file.Executes before any method in a class


	@BeforeSuite
	public void logintobrowser() {

		System.out.println("Login to the browser application");
	}

	@BeforeMethod
	public void login() {

		System.out.println("Login after every method");
	}

	@BeforeClass
	public void Classstarted() {

		System.out.println("Classstarted");
	}

	@Test
	public void loginfilght() {

		System.out.println("Login to the flight application");
	}

	@Test
	public void Bookthefilght() {
		
		System.out.println("Book the flight ");
	}

	@Test
	public void Closetheflightapplication() {

		System.out.println("close the flight application");
	}

	@AfterClass
	public void ClassEnded() {

		System.out.println("ClassEnded");
	}

	@AfterMethod
	public void logout() {

		System.out.println("logout after every method");
	}

}
