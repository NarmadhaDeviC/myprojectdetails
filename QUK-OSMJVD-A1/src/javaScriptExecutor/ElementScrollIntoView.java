package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScrollIntoView {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//inspect the webelement on which action has to perform
		WebElement element = driver.findElement(By.xpath("//h3[text()='Information']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//to perform action on element use arguments[0] methods
		js.executeScript("arguments[0].scrollIntoView(false);",element);

	}

}
