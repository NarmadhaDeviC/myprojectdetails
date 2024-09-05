package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class DemoWebShopMain extends DemoWebShop{

	@Test
	public void product() throws InterruptedException {
		//adding book
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		//adding computer
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.xpath("//img[@title='Show products in category Accessories']")).click();
		
		Thread.sleep(2000);
		
		WebElement drop = driver.findElement(By.id("products-orderby"));
		drop.click();
		Select sel=new Select(drop);
		sel.selectByVisibleText("Price: Low to High");
		
		Thread.sleep(2000);
		
		WebElement display = driver.findElement(By.id("products-pagesize"));
		display.click();
		Select disp=new Select(display);
		disp.selectByVisibleText("4");
		
		Thread.sleep(2000);
		
		WebElement view = driver.findElement(By.id("products-viewmode"));
		view.click();
		Select viewed=new Select(view);
		viewed.selectByVisibleText("List");
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		//validating shopping cart
	    driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
       Thread.sleep(2000);
		
		String value = driver.findElement(By.xpath("//span[@class='product-unit-price']")).getText();
		Thread.sleep(2000);
		double val=Double.parseDouble(value);
		if(val!=0) {
			System.out.println("Item Successfully added to cart");
		}
		
		else
			System.out.println("Not Added");
		
		//Fetching total amount from cart
		
		String total = driver.findElement(By.xpath("//span[@class='product-price order-total']")).getText();
		Reporter.log("Total Amount is " + total,true);
	}
	
	
}
