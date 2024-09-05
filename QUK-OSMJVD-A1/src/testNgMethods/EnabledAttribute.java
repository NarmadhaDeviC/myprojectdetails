package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledAttribute {

	//enabled = false,so this test case wont get executed
	@Test(invocationCount= 1, threadPoolSize=2 ,enabled=false)
	public void login() {
		Reporter.log("Looged in" , true);
	}

	@Test(enabled=false)
	public void logout() {
		Reporter.log("Logged out" ,true);
	}
	
	@Test(invocationCount= 3, threadPoolSize=2)
	public void addToCart() {
		Reporter.log("Added to Cart", true);
	}
	
	
}
