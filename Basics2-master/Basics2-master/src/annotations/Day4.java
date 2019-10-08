package annotations;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 { /// when u have 2 tests, u set priorities

	@BeforeMethod
	public void in() {

		System.out.println("in");
	}

	@Test(priority = 1)
	public void eat() {

		System.out.println("eat");
	}

	@Test(priority = 2)
	public void sleep() {

		System.out.println("sleep");
	}

	@AfterMethod
	public void out() {

		System.out.println("out");
	}

}
