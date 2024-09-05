package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment3 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dream11.com/");
	//switch to frame using id present in iframe tag
	driver.switchTo().frame("send-sms-iframe");
	driver.findElement(By.id("regEmail")).sendKeys("8907654");
	//to switch back to parent frame
   driver.switchTo().parentFrame();
   driver.findElement(By.id("hamburger")).click();
   
	
}
}
