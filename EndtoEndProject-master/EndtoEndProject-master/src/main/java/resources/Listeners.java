package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class Listeners implements ITestListener{
	
	public static void main(String[] args) {

	}
	
	BaseClass b = new BaseClass();

	public void onTestStart(ITestResult result) {
		System.out.println("test Case is starting and the name is " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test Case is passed and the name is  " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test Case is failed and the name is  " + result.getName());
		try {
			b.getScreenshot(result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test Case is skipped and the name is  " + result.getName());
		
	}

	//public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	//	// TODO Auto-generated method stub
		
	//}

	//public void onStart(ITestContext context) {
		//System.out.println("test Case is onstart and the name is  " + context.getName());
		
	//}

	//public void onFinish(ITestContext context) {
	//	System.out.println("test Case is onFinish and the name is  " + context.getName());
		
	//}

	



}
