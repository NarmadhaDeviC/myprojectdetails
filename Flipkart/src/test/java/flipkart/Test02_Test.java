package flipkart;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(testngListener.class)
public class Test02_Test extends BaseClass_Test {
@Test
public void fashion() throws InterruptedException, IOException {
	
	HomePage_Test hp=new HomePage_Test(driver);
	
	Actions action=new Actions(driver);
	action.moveToElement(hp.fashion).perform();
	hp.womenEthnic.click();
	Thread.sleep(2000);
	action.moveToElement(hp.babyKids).perform();
	Thread.sleep(2000);
	hp.remoteToys.click();
	assertEquals(driver.findElement(By.linkText("Login")).getText(),"Login","Login Button not present");
	
	driver.findElement(By.linkText("Login")).click();
	
	SoftAssert sa=new SoftAssert();
	sa.assertNotEquals(driver.findElement(By.linkText("New to Flipkart? Create an account")).getText(), "Already Logged In","Already Logged In");
	
	Thread.sleep(2000);
	LocalDateTime date=LocalDateTime.now();
	String datetime=date.toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./Screenshot/" + "LoginPage" + datetime + ".png");
	FileHandler.copy(source, target);
}
}
