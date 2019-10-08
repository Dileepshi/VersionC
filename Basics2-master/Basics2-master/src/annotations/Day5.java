package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day5 {
	@BeforeMethod
	public void in() {

		System.out.println("in");
	}

	@Test(priority = 1,groups="links")
	public void eat() {

		System.out.println("eat ");
	}

	@Test(priority = 2,groups="edits")
	public void sleep() {

		System.out.println("sleep");
	}

	@Test(priority = 3,groups="links")
	public void drink() {

		System.out.println("drink");
	}

	@AfterMethod
	public void out() {

		System.out.println("out");
	}

}
