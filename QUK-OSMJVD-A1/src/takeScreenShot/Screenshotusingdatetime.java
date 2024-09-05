package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotusingdatetime {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting to do cross browser testing
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		//creating date var and converting toString
		LocalDateTime dateTime=LocalDateTime.now();
		String date = dateTime.toString().replace(":", "-");//replace : with - to get date
		//taking ss of the webelement 
		File source=driver.findElement(By.xpath("(//div[@class='title'])[1]")).getScreenshotAs(OutputType.FILE);
		//giving folder name and concatenate with date and .png file format
		File target=new File("errorScreenshot//"+ date + ".png" );
		
		FileHandler.copy(source, target);

	}

}
