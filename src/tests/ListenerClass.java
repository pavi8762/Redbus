package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;







public class ListenerClass implements ITestListener {
	
	public void onFinish(ITestContext Result) {
		System.out.println(Result.getName() + " case Finished");
	}
	
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + "test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
