package seleniumdemo2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public  void soft() {
		
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(11, 12);
		System.out.println("continue the soft case");	
		ass.assertAll();
		//Soft Assert – Soft Assert collects errors during @Test. 
		//Soft Assert does not throw an exception when an assert fails and would continue with the next step after the assert statement.
//If there is any exception and you want to throw it then you need to use assertAll() method as a last statement in the @Test and test suite again continue with next @Test as it is.


		
	}
	@Test
	public  void hard() {
		
		Assert.assertEquals(13, 12);
		System.out.println("continue the hard case");	
	
	}

}
