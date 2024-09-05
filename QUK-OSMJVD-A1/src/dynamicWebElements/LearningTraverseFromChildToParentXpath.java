package dynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTraverseFromChildToParentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//traverse from child to parent eg:price to product name
		driver.findElement(By.xpath("//img[contains(@title,'Show details for $25 Virtual')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'25.00')]/../../..//h1[contains(text(),'$25 Virtual Gift Card')]")).getText());

        
	}

}
