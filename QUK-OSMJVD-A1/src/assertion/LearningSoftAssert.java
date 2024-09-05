package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	@Test
	public void launchDemo() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//create object for SoftAssert as it has non static methodds
		SoftAssert sa=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		//assertEquals method to validate title of webpage
	    sa.assertEquals(driver.getTitle(),"Demo Web Shop","Webpage not launched");
	    driver.findElement(By.linkText("Register")).click();
	    //asserequals to validate whether register page has been launched
	    sa.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/register","Not navigated to register page");
	    driver.findElement(By.id("gender-female"));
	    //validating radio button before clicking so used assertFalse
	   sa.assertFalse(false,"User clicked on female button");
	   driver.findElement(By.id("gender-female")).click();
	   //if we use assertFalse after clicking then provide true inside()
	   //assertFalse(true,"User clicked on female button");
	 //validating radio button after clicking so used assertTrue
	   sa.assertTrue(true,"Not clicked on female button");
	   WebElement firstName = driver.findElement(By.id("FirstName"));
	   firstName.sendKeys("Narmu");
	   //validating firstname using notequals method
	   sa.assertNotEquals(firstName.getAttribute("value"),"Narmadha","User entered correct name");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Vishnu");
		sa.assertEquals(lastName.getAttribute("value"),"Vishnu","User entered wrong lastname");
		driver.findElement(By.id("Email")).sendKeys("visnar98765@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
		password.sendKeys("test123456");
		sa.assertEquals(password.getAttribute("value"),"test123456","Password is not correct");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("test123456");
		driver.findElement(By.id("register-button")).click();
		sa.assertTrue(true, "User not clicked n register button");
		
	    driver.quit();
	    //its mandatory to give assertall() in softassert either at end or till where we want to execute the code if script fails
	    sa.assertAll();
}
}
