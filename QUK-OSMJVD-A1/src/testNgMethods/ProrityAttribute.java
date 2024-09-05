package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProrityAttribute {
	
	//we can use negative value also for priority like starting from negative then 0 then ending in positive 
@Test(priority = 1)
public void register() {
	Reporter.log("User has registered",true);
}

@Test(priority = 2)
public void login() {
	Reporter.log("User has logeed in",true);
}

@Test(priority =4)
public void logout() {
	Reporter.log("User has logged out",true);
}

@Test(priority = 3)
public void addToCart() {
	Reporter.log("Added to Cart",true);
}
}
