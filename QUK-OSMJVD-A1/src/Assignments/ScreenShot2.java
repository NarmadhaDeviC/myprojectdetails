package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting to do cross browser testing
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./errorScreenshot/ajiopage.png");
        FileHandler.copy(source, target);
        
        File sourceWebelt = driver.findElement(By.xpath("//img[@alt='100 Percent Genuine Products-w']")).getScreenshotAs(OutputType.FILE);
        File targetWebelt = new File("./errorScreenshot/banner.png");
        FileHandler.copy(sourceWebelt, targetWebelt);
	}

}
