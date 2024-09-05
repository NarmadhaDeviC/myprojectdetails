package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting to do cross browser testing
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Takesscreenshot is the interface ,hence doing casting 
		TakesScreenshot ts=(TakesScreenshot)driver;
		//taking ss and storing in var as file type
		File source=ts.getScreenshotAs(OutputType.FILE);
		//creating screenshot name under folder created in project
		File target=new File("./errorScreenShot/webpage1.png");
		//copying ss from source to the file we created under folder//filehandler is a class and copy s the method to do the same
		FileHandler.copy(source, target);
		
	}

}
