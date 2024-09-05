package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningKeyboardMethods1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		//to enter the input using sendKeys , use sendKeys(webelet target,charseq) method
		WebElement input = driver.findElement(By.id("small-searchterms"));
		action.sendKeys(input, "book").perform();
		//Thread.sleep(2000);
		
		//Scrolling the page down , use that inside sendKeys(charseq) method
		action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).perform();
		
		//Scrolling the page up , use that inside sendKeys(charseq) method
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).perform();
		
		
		
	}
}
