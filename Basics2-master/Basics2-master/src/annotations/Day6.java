package annotations;

import org.testng.annotations.Test;

public class Day6 {

	
	@Test(invocationCount = 10,threadPoolSize = 3) // this will tell how many times method has to be executed and in how many threads
	public void in() {

		System.out.println("in");
		System.out.println(Thread.currentThread().getId());
	}


	@Test(expectedExceptions = NumberFormatException.class)
	public void day61() {

		String x = "100B";
		Integer.parseInt(x); // this cannot be converted to integer. SO we use NumberFormatException

	}
}
