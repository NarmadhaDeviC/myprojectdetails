package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningManageMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
	}
}
