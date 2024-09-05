package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting to do cross browser testing
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		//taking ss of the webelement 
		File source=driver.findElement(By.xpath("(//div[@class='title'])[1]")).getScreenshotAs(OutputType.FILE);
		
		File target=new File("./errorScreenShot/webelt.png");
		
		FileHandler.copy(source, target);

	}

}
