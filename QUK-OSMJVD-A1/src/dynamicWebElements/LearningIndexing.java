package dynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIndexing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        //traversing from cell phones to electronics,but xpath shows totally 2...so to get our particular electronics webelement ,use indexing as below
		
		driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')]/../../..//a[contains(text(),'Electronics')])[1]")).click();
	}

}
