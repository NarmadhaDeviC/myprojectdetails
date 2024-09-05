package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//traversing from child to parent and clicking parent webelement
		driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')]/../../..//a[contains(text(),'Electronics')])[1]")).click();
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		
		//click the product
		driver.findElement(By.linkText("1MP 60GB Hard Drive Handycam Camcorder")).click();
		
		//traversing from price to product name and printing product name
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'349.00')]/../../..//h1[contains(text(),'1MP 60GB Hard Drive Handycam Camcorder')]")).getText());
	    driver.findElement(By.xpath("//input[@value='Add to compare list']"));
	    
	    
	}
}
