package waitMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting to do cross browser testing
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//creating object for webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,20);//passing driver ref var and giving 20seconds
		//calling until method using wait ref var and passing conditions,any conditions we can give(more conditions are present in ExpectedConditions methods)
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Jewelry")));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Narmu");
		//wait.until(ExpectedConditions.alertIsPresent());//to check timeout exception
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//label[text()='Gender:']")));
		driver.findElement(By.id("LastName")).sendKeys("vishnu");//it wont get executed as previous line throws exception
		

	}

}
