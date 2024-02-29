package flipkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Test {
	
	WebDriver driver;
	
	@BeforeTest
	 public void preCon(){
		Reporter.log("Process started",true);
	 }
@BeforeClass
public void launch() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
}

@BeforeMethod
public void start() {
	
	Reporter.log("Start",true);
}


@AfterMethod
public void end() {
	
	Reporter.log("Ending Method",true);

}

@AfterClass
public void test98() {
	
	driver.quit();
}

@AfterTest
public void postConditions() {
	Reporter.log("Process completed successfully",true);
	
}
}
