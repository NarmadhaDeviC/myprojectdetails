package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {

	@BeforeSuite
	public void dbConnection()
	{
		Reporter.log("Connected to DB" ,true);
	}
	@BeforeClass
	public void launch()
	{
		Reporter.log("Browser Launched",true);
	}
	
	@BeforeTest
	public void preCond()
	{
		Reporter.log("Pre Conditions",true);
	}
	
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login Details",true);
	}
	@Test
	public void hello()
	{
		Reporter.log("Hello!!",true);
	}
	@AfterMethod 
	public void logout()
	{
		Reporter.log("Logged out",true);
	}
	
	@AfterSuite	
	public void dbClose()
	{
		Reporter.log("DB closed",true);
	}
	@AfterTest
	public void postCond()
	{
		Reporter.log("PostConditions",true);
	}
	@AfterClass
	public void closeBroswer()
	{
		Reporter.log("Browser closed",true);
	}
	
	
}
