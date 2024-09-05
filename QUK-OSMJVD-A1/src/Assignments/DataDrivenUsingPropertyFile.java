package Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file=new File("./testDataFolder/testDataAssignment1.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties p=new Properties();
		p.load(fis);
		
		String Key = p.getProperty("key").toString();
		String Path = p.getProperty("path").toString();
		String URL = p.getProperty("url").toString();
		
		System.setProperty(Key, Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		//fetching values from properties file and storing in string variable
		String FirstName = p.getProperty("firstname").toString();
		String LastName = p.getProperty("lastname").toString();
		String Email = p.getProperty("email").toString();
		String Password = p.getProperty("password").toString();
		String ConfirmPassword = p.getProperty("confirmpassword").toString();
		//entering the details
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		

	}

}
