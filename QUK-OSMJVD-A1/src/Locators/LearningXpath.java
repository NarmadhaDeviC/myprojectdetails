package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//to find attribute and text
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		driver.findElement(By.xpath("//strong[text()='Manufacturers']"));
		//to find attribute and text using contains()
		driver.findElement(By.xpath("//img[contains(@src,'/Themes/DefaultClean')]"));
		driver.findElement(By.xpath("//div[contains(text(),'Copyright')]"));
		
		driver.findElementByXPath("//div[contains(text(),'Copyright')]");
		
		
	}

}
