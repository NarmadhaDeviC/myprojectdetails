package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningMethods2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Narmadha");
		
		//getAtribute method using value and name in parenthesis
		System.out.println(driver.findElement(By.id("FirstName")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("ConfirmPassword")).getAttribute("name"));
		
		//getText method to fetch any text in webpage.here tried clicking register button and captured error message
		driver.findElement(By.id("register-button")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Last name is required.']")).getText());
		
		//getSize() to get the dimension of the webelement
		System.out.println(driver.findElement(By.xpath("//strong[text()='Your Personal Details']")).getSize());
        //or create variable and then call getHeight and getwidth
		Dimension size = driver.findElement(By.xpath("//strong[text()='Your Personal Details']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//getLocation method to get x and y coordinates of web element,create reference var of type POINT and call getX and getY methods
		Point loc = driver.findElement(By.id("register-button")).getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		//getRect() to get both dimension(height,width) and coordinates(x,y) of web element.Create ref var of type rectangle
		Rectangle rec = driver.findElement(By.id("register-button")).getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		
		//getTagName() to return tagname of the webelement
		System.out.println(driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']")).getTagName());
		
		
	}

}
