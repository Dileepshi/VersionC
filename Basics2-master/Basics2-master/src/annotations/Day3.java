package annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups = { "smoketestcases" }) // this groups will execute in alphabetical order
	public void loginCar() {

		System.out.println("Login to the car application");
	}
	@Test(groups={"smoketestcases"})
	public void BooktheBus() {

		System.out.println("Book the car ");
	}
	@Test(groups={"smoketestcases"})
	public void ClosetheBusapplication() {

		System.out.println("close the car application");
	}
	@AfterSuite
	public void Closethebrowser() {

		System.out.println("close the browser application");
	}

}
