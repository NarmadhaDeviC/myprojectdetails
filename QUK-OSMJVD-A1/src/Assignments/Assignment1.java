package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		//enter details to register except confirm password to capture error message
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Narmadha");
		driver.findElement(By.id("LastName")).sendKeys("Vishnu");
		driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test12");
		
		//click on register button
		driver.findElement(By.id("register-button")).click();
		
		//capturing entered details
		System.out.println("Button is selected : " + driver.findElement(By.id("gender-female")).isSelected());
		System.out.println("FirstName is : " +driver.findElement(By.id("FirstName")).getAttribute("value"));
		System.out.println("LastName is : " +driver.findElement(By.id("LastName")).getAttribute("value"));
		System.out.println("Email is : " +driver.findElement(By.id("Email")).getAttribute("value"));
		System.out.println("Password is : " +driver.findElement(By.id("Password")).getAttribute("value"));
		
		
		//capturing error message
		System.out.println("Error message : " + driver.findElement(By.xpath("//span[text()='Password is required.']")).getText());
		
		//fetching text box dimension and coordinates
		Rectangle value = driver.findElement(By.id("LastName")).getRect();
		System.out.println("height of text box is : " + value.getHeight());
		System.out.println("Width of text box is : " + value.getWidth());
		System.out.println("X coordinate  of text box is : " + value.getX());
		System.out.println("Y coordinate  of text box is : " + value.getWidth());

	}

}
