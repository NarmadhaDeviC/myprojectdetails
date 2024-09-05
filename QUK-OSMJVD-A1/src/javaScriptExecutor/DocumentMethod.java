package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocumentMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		//js executor casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//inspect the button and click so that hidden text box will be visible
		driver.findElement(By.id("usertype_yes")).click();
		WebElement disableElt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//call document method and inspect the the box and pass along with value
		js.executeScript("document.getElementById('groupcode').value='hello';");

	}

}
