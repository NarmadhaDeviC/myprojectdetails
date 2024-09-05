package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUpWindow {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Twitter")).click();
		//fetching parent id
		String parentId = driver.getWindowHandle();
		//fetching both parent and child IDs
		Set<String> bothIds = driver.getWindowHandles();
		System.out.println(parentId);
		System.out.println(bothIds);
		Thread.sleep(2000);
		//removing parent id in bothIds
		//bothIds.remove(parentId);
		//iterating in bothIds to close the child window(using for each loop as return type of getWindowHandles is set)
		for(String i:bothIds)
		{
			//transferring control to child window to do action(close)
			driver.switchTo().window(i);
			Thread.sleep(3000);
			driver.close();//it will just close where the driver control is there
			//driver.quit();//it will close entire application(both parent and child)
		}
		
		

	}

}
