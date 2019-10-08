package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@BeforeTest
	public void loginBus() {

		System.out.println("Login to the Bus application");
	}
@Test
	public void BooktheBus() {

		System.out.println("Book the Bus ");
	}
@AfterTest
	public void ClosetheBusapplication() {

		System.out.println("close the Bus application");
	}

}
