package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementValueUsingArguments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//js executor casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//inspect the disbaled text box where we have to enter the value
		WebElement disableElt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//call arguments method and use .value to enter the text and pass webelt inspected variable
		js.executeScript("arguments[0].value='hello';",disableElt);

	}

}
