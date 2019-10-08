package com.crm.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.base.BaseClass;


public class Reporting implements ITestListener {

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
			System.out.println("Case is failed Screenshot taken");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test Case is skipped and the name is  " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
