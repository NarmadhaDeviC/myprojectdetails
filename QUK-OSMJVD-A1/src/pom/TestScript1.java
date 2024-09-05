package pom;

import org.testng.annotations.Test;

public class TestScript1 extends BaseClass {
	
	@Test
	public void demo() throws InterruptedException {
		DemoHomePage_Pom hp=new DemoHomePage_Pom(driver);
		hp.goodRadioButton.click();
		Thread.sleep(2000);		
		hp.getBooksButton();
		hp.getComputersButton();
	}

}
