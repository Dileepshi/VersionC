package seleniumdemo6;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements TESTNG listeners
public class TestngListener implements ITestListener {

	public static void main(String[] args) {

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test Case is starting and the name is " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test Case is passed and the name is  " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test Case is failed and the name is  " + result.getName());
		// use screenshot code here to get the screenshots on failure
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test Case is skipped and the name is  " + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test Case onTestFailedButWithinSuccessPercentage and the details are " + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
