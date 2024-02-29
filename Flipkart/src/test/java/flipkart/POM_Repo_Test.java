package flipkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_Repo_Test {
public POM_Repo_Test(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
}
