package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocators1 {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.id("small-searchterms"));
    driver.findElement(By.name("NewsletterEmail"));
    driver.findElement(By.linkText("Log in"));
    driver.findElement(By.partialLinkText("Computers"));
    driver.findElement(By.cssSelector("input[id='small-searchterms']"));
}
}
