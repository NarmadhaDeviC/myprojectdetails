package testNgMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class alwaysRunAttribute {
	@Test(alwaysRun=true)
	public void launch() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.id("small-searchterms")).sendKeys("book");
		driver.findElement(By.xpath("//nput[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
