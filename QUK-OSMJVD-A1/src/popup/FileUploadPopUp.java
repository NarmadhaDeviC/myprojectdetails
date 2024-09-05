package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		//Robot class
		Robot robot=new Robot();
		Thread.sleep(2000);
		//typing file name
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_K);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		//pressing tabs and enter
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//KEY RELEASE OF ALL BUTTONS *IMPORTANT*
		robot.keyRelease(KeyEvent.VK_L);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_K);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_S);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
			

	}

}
