package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningMethods3 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//isDisplayed() method to check whether webelt is displayed or not.RT s boolean
	System.out.println(driver.findElement(By.xpath("//label[text()='Excellent']")).isDisplayed());
	//isSelected() to check whether radio button or checkbox is selected or not.RT s boolean
	System.out.println(driver.findElement(By.xpath("//label[text()='Good']")).isSelected());
	//isEnabled() to check whether the web element is enabled or not.RT s boolean
	System.out.println(driver.findElement(By.id("vote-poll-1")).isEnabled());
	
}
}
