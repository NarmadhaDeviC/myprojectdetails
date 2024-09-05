import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ext_test {
	
	@Test
	public void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("load-extension=C:\\Users\\Adminnarmu\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\jfcmnbofjlffnejneillkgbniiidiigd\\23.10.1_0");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("chrome://extensions/?id=jfcmnbofjlffnejneillkgbniiidiigd");
		Thread.sleep(1000);
		driver.findElement(By.id("ink")).click();
		
	}
}
