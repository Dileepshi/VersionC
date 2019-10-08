package annotations;


import org.testng.annotations.Test;

public class Day6 { 

	@Test(invocationCount=10) // this will tell how many times method has to be executed
	public void in() {

		System.out.println("in");
	}
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void day61(){
		
		String x="100B";
		Integer.parseInt(x); //this cannot be converted to integer. SO we use NumberFormatException 
		
		
	}
}
