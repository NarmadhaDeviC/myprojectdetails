package batchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserAddingItems {
	WebDriver driver;
	@Parameters("browser")
@Test
public void launch(String bname) {
	if(bname.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.quit();
		}
		
		else if(bname.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			driver.quit();
			}
		else if(bname.contains("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			driver.quit();
			}
	}
}
