package flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test01_Test extends BaseClass_Test {
	
	@DataProvider(name="groceryItems")
	public String[][] groceryItems() throws EncryptedDocumentException, IOException{
		
		File file=new File("./testDataFolder/flipkart.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		int noOfRows =wb.getSheet("Sheet1").getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		int noOfCells = wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[noOfRows][noOfCells];
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfCells;j++) {
				data[i][j]=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
			
		}
		}
		return data;
		
		
		
	}
@Test(dataProvider="groceryItems")
public void grocery(String[] groceryItems) throws InterruptedException {
	
	HomePage_Test hp=new HomePage_Test(driver);
	hp.grocery.click();
	hp.pincode.sendKeys("638009");
	hp.pincode.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	for(String g:groceryItems) {
		hp.searchGrocery.sendKeys(g);
		Reporter.log("test print" + g,true);
		hp.searchGrocery.sendKeys(Keys.CONTROL + "a");
		hp.searchGrocery.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
	}
	/*hp.searchGrocery.sendKeys(groceryItems[0]);
	Reporter.log("test print" + groceryItems[0],true);
	
	hp.searchGrocery.sendKeys(Keys.CONTROL + "a");
	hp.searchGrocery.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	
	hp.searchGrocery.sendKeys(groceryItems[1]);
	hp.searchGrocery.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	hp.searchGrocery.sendKeys(Keys.CONTROL + "a");
	hp.searchGrocery.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	
	hp.searchGrocery.sendKeys(groceryItems[2]);
	hp.searchGrocery.sendKeys(Keys.ENTER);*/
   
Thread.sleep(2000);
	
}
}
