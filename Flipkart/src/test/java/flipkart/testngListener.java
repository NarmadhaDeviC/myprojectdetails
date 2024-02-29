package flipkart;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class testngListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Listener Started",true);
	}
	
public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TestCase execution Passed",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Execution Failed-Listener",true);
	}
}

