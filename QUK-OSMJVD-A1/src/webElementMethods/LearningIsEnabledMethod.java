package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		System.out.println(driver.findElement(By.id("but2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("but1")).isEnabled());
		
		////span[contains(text(),'25.00')]/../../..//h1[contains(text(),'$25 Virtual Gift Card')]
	}
}
