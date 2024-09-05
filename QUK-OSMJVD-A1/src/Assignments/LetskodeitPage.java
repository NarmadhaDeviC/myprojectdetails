package Assignments;



import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class LetskodeitPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		//click func
		driver.findElement(By.id("bmwradio")).click();
		driver.findElement(By.id("bmwcheck")).click();
		driver.findElement(By.id("hondacheck")).click();
		
		//Select
		WebElement drop = driver.findElement(By.id("carselect"));
		Select sel=new Select(drop);
		sel.selectByVisibleText("Benz");
		
		WebElement multiselect = driver.findElement(By.id("multiple-select-example"));
		Select  sel1=new Select(multiselect);
		sel1.selectByValue("apple");
		sel1.selectByValue("peach");
		
		//send keys
		driver.findElement(By.id("autosuggest")).sendKeys("test");
		
		//enable/disable/display
		System.out.println("Button is enabled " + driver.findElement(By.id("enabled-button")).isEnabled());
		System.out.println("Button is enabled " + driver.findElement(By.id("enabled-example-input")).isEnabled());		
		System.out.println("text box displayed " + driver.findElement(By.id("displayed-text")).isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		System.out.println("text box displayed " + driver.findElement(By.id("displayed-text")).isDisplayed());
		
		//popup
		
		driver.findElement(By.id("name")).sendKeys("Popup");
		System.out.println(driver.findElement(By.id("name")).getAttribute("value"));
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//mouseover
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("mousehover"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Reload")).click();
		
		//frame
		driver.switchTo().frame("iframe-name");
		Thread.sleep(2000);
		
		
		//screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = driver.findElement(By.xpath("(//img[@alt='course image'])[2]")).getScreenshotAs(OutputType.FILE);
		File target = new File("./errorScreenshot/lets.png");
		FileHandler.copy(source, target);
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./errorScreenshot/letspage.png");
		FileHandler.copy(source1, target1);
		driver.switchTo().parentFrame();
		
		//childpopup--switch to tab
		driver.findElement(By.id("opentab")).click();
		String parentId = driver.getWindowHandle();
		Set<String> bothIds = driver.getWindowHandles();
		System.out.println(parentId);
		System.out.println(bothIds);
		bothIds.remove(parentId);
		for(String i:bothIds)
		{
			driver.switchTo().window(i);
			driver.findElement(By.xpath("(//a[@href='/courses'])[1]")).click();
			driver.close();
		}
		
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		
		//switch to window
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(2000);
		String parentId1 = driver.getWindowHandle();
		Set<String> bothIds1 = driver.getWindowHandles();
		System.out.println(parentId1);
		System.out.println(bothIds1);
		bothIds1.remove(parentId1);
		System.out.println(bothIds1);
		for(String r:bothIds1)
		{
			driver.switchTo().window(r);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@href='/interview']")).click();
			Thread.sleep(2000);
			driver.close();
		}

	}

}
