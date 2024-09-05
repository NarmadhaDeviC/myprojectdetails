package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningMethods1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.partialLinkText("Books")).click();
		//creating webelement variable to pass in Select constructor
		WebElement opt = driver.findElement(By.id("products-orderby"));
		//pass the var in constructor
		Select sel=new Select(opt);
		System.out.println(sel.isMultiple());
		
		//selecting the value by text as in inspect ,text is present for all options .RT is void but it accepts string in ()
		//same for selecting by index and value
		//sel.selectByVisibleText("Price: Low to High");
		
		//getOptions() to fetch all the options from dropdown
		List<WebElement> options = sel.getOptions();
		for(WebElement var:options)//for each loop
		{
			System.out.println(var.getText());//using getText to print the values as in Selenium we use, to print the webelements text using getText()
		}
		
	}
}
