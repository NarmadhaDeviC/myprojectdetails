package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMethods1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		//create obj for Actions class as it has non static method
		Actions action=new Actions(driver);
		
		//create webelement variable to pass in actions methods
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		
		//calling mouse over methods using obj ref var and call perform()
		action.moveToElement(men).perform();
		
		//to perform right click ,use contextClick()
		WebElement women=driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		action.contextClick(women).perform();
		
		
		WebElement click = driver.findElement(By.xpath("//img[@alt='womenWear']"));
		action.doubleClick(click).perform();
		
		
	}
}
