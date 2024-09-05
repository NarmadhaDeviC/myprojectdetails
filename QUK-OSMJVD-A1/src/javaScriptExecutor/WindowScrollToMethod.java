package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrollToMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//js executor casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//calling method and passing args copying from console,scrollto work only once that too page should be in (0,0) index
		js.executeScript("window.scrollTo(0,700)");
		
	}

}
