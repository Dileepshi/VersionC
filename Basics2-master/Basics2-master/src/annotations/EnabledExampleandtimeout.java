package annotations;

import org.testng.annotations.Test;

public class EnabledExampleandtimeout {

	@Test
	public void loginfilght() {

		System.out.println("Login to the flight application");
	}

	@Test(enabled = false) // this step will be skipped if u already know there
							// is a bug in this
	public void Bookthefilght() {

		System.out.println("Book the flight ");
	}

	@Test(timeOut = 4000) // wait before u fail
	public void Closetheflightapplication() {

		System.out.println("close the flight application");
	}

}
