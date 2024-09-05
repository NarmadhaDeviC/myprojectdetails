package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsAttribute {

	@Test(dependsOnMethods="register")
	public void login() {
		Reporter.log("Logged in" , true);
	}
	
	@Test
	public void addToCart() {
		Reporter.log("Added to cart" , true);
	}

	@Test()
	public void logout() {
		Reporter.log("Logged out" ,true);
	}
	
	@Test
	public void register() {
		Reporter.log("User Registered", true);
	}
	
	
}
