package seleniumdemo5;

import java.util.ArrayList;
import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) {
		// this program helps to run the failed test cases

		TestNG failedCases = new TestNG();
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("C:\\Users\\dileep.ks\\workspace\\Basics\\test-output\\SampleSuite\\testng-failed.xml");
		failedCases.setTestSuites(ll);
		failedCases.run();
		

	}

}
