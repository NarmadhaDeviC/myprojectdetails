package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		//Robot class to handle
		Robot robot=new Robot();
		Thread.sleep(2000);
		//key press tab
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		//enter key press
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//release the enter key
		robot.keyRelease(KeyEvent.VK_ENTER);
        
	}

}
