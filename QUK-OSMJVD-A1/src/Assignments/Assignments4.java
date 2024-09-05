package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignments4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		String parentId = driver.getWindowHandle();
		Set<String> bothIds = driver.getWindowHandles();
		System.out.println(parentId);
		System.out.println(bothIds);
		bothIds.remove(parentId);
		for(String i:bothIds)
		{
		driver.switchTo().window(i);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		Thread.sleep(2000);
		driver.quit();
		}

	}

}
