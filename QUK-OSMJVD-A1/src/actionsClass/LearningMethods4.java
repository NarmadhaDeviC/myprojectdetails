package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMethods4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		Actions action=new Actions(driver);
		//click and hold the webelement
		WebElement hold = driver.findElement(By.xpath("//li[text()='H']"));
		action.clickAndHold(hold).perform();
		Thread.sleep(5000);
		//to release the hold
		action.release(hold).perform();
	}
}
