package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopUpHiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//to handle notifications when webpage is opened
		ChromeOptions options=new ChromeOptions();//creating obj
		options.addArguments("--disable-notifications");//command to disable notific
		ChromeDriver driver=new ChromeDriver(options);//pass ref in this constructor
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		driver.findElement(By.xpath("(//div[@class='calendar-icon'])[1]")).click();
		Thread.sleep(2000);
		//traversing from month to date to select date
		driver.findElement(By.xpath("(//span[@class='vc-month-box-head-cell '])[1]/../..//div[text()='27']")).click();
		driver.findElement(By.xpath("//label[text()='Round trip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("return")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='vc-month-box-head-cell '])[3]/../..//div[text()='30']")).click();
	}

}
