package Assignments;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShop {
	
	private static final String    Finally = null;
	WebDriver driver;
	
	@BeforeTest
	 public void preCon(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	 }
	

	
	@BeforeClass
	public void launch() {
		
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	
	
	@BeforeMethod
	
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("visnar98765@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test123456");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@BeforeMethod
	
	public void test() throws InterruptedException
	

	{ 
		
		boolean text = false ;
		
		
		try {
		text = driver.findElement(By.xpath("//li[text()='No customer account found']")).isDisplayed();
		Thread.sleep(2000);
	}
	    catch (Exception e) {
		Reporter.log("Logging In",true);
	}
	
	     finally {
		if(text) {
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Narmu");
			driver.findElement(By.id("LastName")).sendKeys("Vishnu");
			driver.findElement(By.id("Email")).sendKeys("visnar98765@gmail.com");
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("test123456");
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("test123456");
			driver.findElement(By.id("register-button")).click();
		}
		
		else
		{
			Reporter.log("Log in Sucessful",true);
		}
		
	}
	}
	
	
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
	}
	
	
	
	@AfterClass
	public void quitBrowser() throws InterruptedException
	{Thread.sleep(2000);
		driver.quit();
	}
	
	@AfterTest
	public void postConditions() {
		Reporter.log("Process completed successfully",true);
	}
}
