package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningMethods1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//1)ALERT POP-UP
        driver.findElement(By.id("alert1")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        /*or can create ref var and call method as below for alert
        Alert alert = driver.switchTo().alert();
        alert.accept();*/
        
        //2)CONFIRMATION POP_UP
        driver.findElement(By.id("confirm")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//to click ok button
        //driver.switchTo().alert().dismiss();//to click cancel button
        
        //3)PROMPT POPUP
        Thread.sleep(2000);
        driver.findElement(By.id("prompt")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        //System.out.println(driver.switchTo().alert().getText());
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("test");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
	}

}
