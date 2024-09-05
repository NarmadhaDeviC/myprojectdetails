package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//img[contains(@title,'Show details for Build')])[1]")).click();
		System.out.println("Product name: " + driver.findElement(By.xpath("//span[@class='price-value-72']/../../..//h1[contains(text(),'Build your own cheap computer')]")).getText());
		
		System.out.println("Price : " + driver.findElement(By.xpath("//h1[contains(text(),'Build your own cheap computer')]/../..//span[@class='price-value-72']")).getText());
		
		
		
		driver.findElement(By.id("product_attribute_72_6_19_55")).click();
		driver.findElement(By.id("product_attribute_72_3_20_58")).click();
		driver.findElement(By.id("product_attribute_72_8_30_93")).click();
		driver.findElement(By.id("product_attribute_72_8_30_95")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./errorScreenshot/product.png");
		FileHandler.copy(source, target);

	}

}
