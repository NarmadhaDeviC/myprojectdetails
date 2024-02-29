package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Test extends POM_Repo_Test {
	
	public HomePage_Test(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getGrocery() {
		return grocery;
	}

	public WebElement getMobiles() {
		return mobiles;
	}

	public WebElement getFashion() {
		return fashion;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getSearchGrocery() {
		return searchGrocery;
	}

	@FindBy(xpath="//span[text()='Login']")
	WebElement logIn;
	
	@FindBy(xpath="//span[text()='Sign Up']")
	WebElement signUp;
	
	@FindBy(xpath="//span[text()='Grocery']")
	WebElement grocery;
	
	@FindBy(xpath="//span[text()='Mobiles']")
	WebElement mobiles;
	
   @FindBy(xpath="//div[@aria-label='Fashion']")
   WebElement fashion;
   
   @FindBy(xpath="//input[@name='pincode']")
   WebElement pincode;
   
   @FindBy(xpath="//input[@title='Search grocery products']")
   WebElement searchGrocery;
   
   @FindBy(xpath="(//a[@class='_1BJVlg'])[2]")
   WebElement womenEthnic;
   
   @FindBy(xpath="//span[text()='Baby & Kids']")
   WebElement babyKids;
   
   @FindBy(linkText="Remote Control Toys")
   WebElement remoteToys;
   
}
