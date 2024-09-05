package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGListener extends BaseClass implements ITestListener {

	//datetime to append in ss name
	LocalDateTime  dateTime=LocalDateTime.now();
	String date=dateTime.toString().replace(":", "-");
	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("TestCase execution Started",true);
	}
	
	@Override
	
public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TestCase execution Passed",true);
	}

	@Override
public void onTestFailure(ITestResult result) {
	
	
	Reporter.log("TestCase execution Failed",true);
	//implementing ss
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File("./errorScreenShot/"+date+"pic.png");
	try {
		FileHandler.copy(source, target);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
