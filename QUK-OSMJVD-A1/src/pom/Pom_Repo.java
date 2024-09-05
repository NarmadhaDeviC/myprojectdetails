package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_Repo {
	//this is main pom class with parametrised constructor of webdriver refernec
   public Pom_Repo(WebDriver driver) {
	   //PageFactory is a class in selenium to implement POM
	   PageFactory.initElements(driver, this);
   }
}
