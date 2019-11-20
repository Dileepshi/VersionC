package seleniumdemo2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {

	@Test
	public void assertscript() {
		Assert.assertEquals(10, 10); // hard assertion
		Assert.assertEquals(20, 30, " ---value does not match check with them----");// this msg will display only when
																					// assert fails
		// 2 types of assert - hard assert and Soft Assert
	}

}
