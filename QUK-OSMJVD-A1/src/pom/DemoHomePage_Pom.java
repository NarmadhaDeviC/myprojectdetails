package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoHomePage_Pom extends Pom_Repo {
	//parametrised constructore with driver reference and using super() as driver reference is in parent class Pom_Repo
   public DemoHomePage_Pom(WebDriver driver) {
	   super(driver);
   }
   
   //finding all elements in webpage and generating getter method of that
   @FindBy(linkText="Register")
   WebElement registerButton;
   
   @FindBy(id="Log in")
   WebElement loginButton;
   
   @FindBy(partialLinkText="Books")
   WebElement booksButton;
   
   @FindBy(partialLinkText="Jewelry")
   WebElement jewelryButon;
   
   @FindBy(id="pollanswers-2")
   WebElement goodRadioButton;
   
   @FindBy(partialLinkText="Computers")
   WebElement computersButton;
   
   public WebElement getComputersButton() {
	   computersButton.click();
	return computersButton;
}



public WebElement getRegisterButton() {
	return registerButton;
}

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getBooksButton() {
	booksButton.click();
	return booksButton;
}

public WebElement getJewelryButon() {
	return jewelryButon;
}

public WebElement getGoodRadioButton() {
	return goodRadioButton;
}
   
}
