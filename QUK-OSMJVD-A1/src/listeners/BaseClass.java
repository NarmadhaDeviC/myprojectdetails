package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)


public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
		@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.id("Books")).click();
		
		/*Thread.sleep(2000);
		driver.findElement(By.linkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys("visnar98765@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test123456");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();*/
		
	}	
	@AfterClass
	public void close()
	{
		driver.quit();
		Reporter.log("End",true);
	}
	
}
