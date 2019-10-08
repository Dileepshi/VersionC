package annotations;

import org.testng.annotations.Test;

public class DependsExample {

	@Test
	public void loginfilght() {

		System.out.println("Login to the flight application");
	}

	@Test(dependsOnMethods = { "loginfilght" })
	public void Bookthefilght() {

		System.out.println("Book the flight ");
	}

	@Test(dependsOnMethods = { "Bookthefilght" })
	public void Closetheflightapplication() {

		System.out.println("close the flight application");
	}

}
