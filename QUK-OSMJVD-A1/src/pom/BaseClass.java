package pom;

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

public class BaseClass {
WebDriver driver;
	
	@BeforeTest
	 public void preCon(){
		Reporter.log("Process started",true);
	 }
	

	
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	
	
	@BeforeMethod
	
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("visnar09098@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test123456");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
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
