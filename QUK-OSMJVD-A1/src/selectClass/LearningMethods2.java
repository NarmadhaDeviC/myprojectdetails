package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningMethods2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement opt = driver.findElement(By.id("multiselect1"));
		Select sel = new Select(opt);
		System.out.println(sel.isMultiple());
		
		//selected by visible text
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Swift");
		//seleted by value
		sel.selectByValue("Hyundaix");
		sel.selectByValue("audix");
		
		//getfirst selected option,RT is webelement so create var
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getText());//use tha var and getText to print 
		//or diectly use getText as below for above method
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//deselect by text
		sel.deselectByVisibleText("Volvo");
		//deselect by value
		sel.deselectByValue("audix");
		
		//waiting time to check next condition
		Thread.sleep(2000);
		
		//deselect all
		sel.deselectAll();
		
		
	}
}
