package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterDetails2 {
	@Test(groups="new")
	public void register() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Narmu");
		driver.findElement(By.id("LastName")).sendKeys("Vishnu");
		driver.findElement(By.id("Email")).sendKeys("visnar09098@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("test123456");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("test123456");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}
}
