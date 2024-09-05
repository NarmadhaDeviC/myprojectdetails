package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutAttribute {
	//timeout in millisec 
	@Test(timeOut=2000)
	public void launch() throws InterruptedException {
		
		Reporter.log("Launched");
	}

}
