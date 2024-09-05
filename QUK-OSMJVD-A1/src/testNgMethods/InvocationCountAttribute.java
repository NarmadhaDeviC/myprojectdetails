package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountAttribute {
	//0 and -ve values in invocation count means it wont get executed
	@Test(invocationCount = 1)
	public void register() {
		Reporter.log("User has registered",true);
	}
//if we give priority to only one method then remaining methods will get executed as per alpha order then priority methods  gets executed
	@Test(invocationCount = 2,priority = 1)
	public void login() {
		Reporter.log("User has logeed in",true);
	}

	@Test(invocationCount =4)
	public void logout() {
		Reporter.log("User has logged out",true);
	}
//it wont get executed
	@Test(invocationCount = 0)
	public void addToCart() {
		Reporter.log("Added to Cart",true);
	}
}
