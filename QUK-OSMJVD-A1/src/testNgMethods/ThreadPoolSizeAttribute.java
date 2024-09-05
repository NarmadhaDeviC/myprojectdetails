package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSizeAttribute {
	//count less then thread size
@Test(invocationCount= 1, threadPoolSize=2)
public void login() {
	Reporter.log("Looged in" , true);
}
//count equal to thread size
@Test(invocationCount= 2, threadPoolSize=2)
public void logout() {
	Reporter.log("Logged out" ,true);
}
//count greater then thread size
@Test(invocationCount= 3, threadPoolSize=2)
public void addToCart() {
	Reporter.log("Added to Cart", true);
}
}
