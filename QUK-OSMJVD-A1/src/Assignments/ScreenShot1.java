package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting to do cross browser testing
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Narmu");
		driver.findElement(By.id("LastName")).sendKeys("Vishnu");
		driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("test900");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("test900");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./errorScreenshot/details.png");
		FileHandler.copy(source, target);
		driver.findElement(By.id("register-button")).click();

	}

}
