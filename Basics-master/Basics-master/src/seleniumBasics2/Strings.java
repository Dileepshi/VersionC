package seleniumBasics2;

public class Strings {

	public static void main(java.lang.String[] args) {


		String name = "Learning Automation";
		boolean Status = name.startsWith("Learning");
		boolean Status1 = name.endsWith("Learning");
		System.out.println("result is " + Status);
		System.out.println("result is " + Status1);
		
		String actuals ="hello";
		String Expected ="hello";
		String Expected1 ="a";
		boolean result = actuals.equalsIgnoreCase(Expected);
		boolean result1 = actuals.contains(Expected1);
		
		System.out.println(result);
		System.out.println(result1);
		
		
		

	}

}
