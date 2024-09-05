package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningMethods1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		//by frame name
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		//by frame webelement
		//WebElement apps = driver.findElement(By.name("app"));
		//driver.switchTo().frame(apps);
		//driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
