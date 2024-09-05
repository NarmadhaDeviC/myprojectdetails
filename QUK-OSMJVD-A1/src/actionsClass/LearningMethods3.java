package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMethods3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
		
		Actions action=new Actions(driver);
		
		//drag element locator
		WebElement source = driver.findElement(By.id("draggable"));
		
		//drop element locator
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();
		
	

	}

}
