package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	// before method and after method is specific to class file.
	// before test and before suite depends on the XML file number of tests u
	// execute
	// before and after class is specific to a class file.Executes before any method
	// in a class

	@BeforeSuite
	public void logintobrowser() {

		System.out.println("@BeforeSuite");
	}

	@BeforeMethod
	public void login() {

		System.out.println("@BeforeMethod");
	}

	@BeforeClass
	public void Classstarted() {

		System.out.println("@BeforeClass");
	}

	@Test
	public void loginfilght() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("@Test1");
	}

	@Test
	public void Bookthefilght() {

		System.out.println(Thread.currentThread().getId());
		System.out.println("@Test2");
	}
	@Test
	public void Bookthefilght1() {

		System.out.println(Thread.currentThread().getId());
		System.out.println("@Test2");
	}

	@Test
	public void Closetheflightapplication() {

		System.out.println("@Test3");
	}

	@AfterClass
	public void ClassEnded() {

		System.out.println("@AfterClass");
	}

	@AfterMethod
	public void logout() {

		System.out.println("@AfterMethod");
	}

}
