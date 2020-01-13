package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@BeforeTest
	public void loginBus() {

		System.out.println("@BeforeTest");
	}
@Test
	public void BooktheBus() {

		System.out.println("@Test4");
	}
@AfterTest
	public void ClosetheBusapplication() {

		System.out.println("@AfterTest");
	}

}
