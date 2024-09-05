package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningHardAssert {
	@Test
	public void launchDemo() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//assertEquals method to validate title of webpage
	    assertEquals(driver.getTitle(),"Demo Web Shop","Webpage not launched");
	    driver.findElement(By.linkText("Register")).click();
	    //asserequals to validate whether register page has been launched
	    assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/register","Not navigated to register page");
	    driver.findElement(By.id("gender-female"));
	    //validating radio button before clicking so used assertFalse
	   assertFalse(false,"User clicked on female button");
	   driver.findElement(By.id("gender-female")).click();
	   //if we use assertFalse after clicking then provide true inside()
	   //assertFalse(true,"User clicked on female button");
	 //validating radio button after clicking so used assertTrue
	   assertTrue(true,"Not clicked on female button");
	   WebElement firstName = driver.findElement(By.id("FirstName"));
	   firstName.sendKeys("Narmu");
	   //validating firstname using notequals method
	   assertNotEquals(firstName.getAttribute("value"),"Narmadha","User entered correct name");
		driver.findElement(By.id("LastName")).sendKeys("Vishnu");
		driver.findElement(By.id("Email")).sendKeys("visnar98765@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
		password.sendKeys("test123456");
		assertEquals(password.getAttribute("value"),"test123456","Password is not correct");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("test123456");
		driver.findElement(By.id("register-button")).click();
	  driver.quit()
;	}

}
