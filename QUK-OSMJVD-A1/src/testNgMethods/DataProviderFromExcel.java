package testNgMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFromExcel {
	@DataProvider(name="testData")
	public String[][] testData() throws EncryptedDocumentException, IOException{
		
		File file=new File("./testDataFolder/excelTestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		//fetching no of rows
		int noOfRows = wb.getSheet("Sheet3").getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		//fetching no of columns corresponding to row 0
		int noOfCells = wb.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells();
		System.out.println(noOfCells);
		//creating new string
		String[][] data=new String[noOfRows][noOfCells];
		//iterating through row and columns to fetch data and return
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfCells;j++) {
				
				data[i][j]=wb.getSheet("Sheet3").getRow(i).getCell(j).toString();
			}
		}
		
		return data;
	}
	
	@Test(dataProvider="testData")
	public void register(String[] testData) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		//entering register details starting with geneder with dataprovider name and [] value
		if(testData[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}
		
		else {
			driver.findElement(By.id("gender-female")).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys(testData[1]);//stored firstnames in second columns so [1]
		driver.findElement(By.id("LastName")).sendKeys(testData[2]);//stored lastnames in third columns so [2]
		driver.findElement(By.id("Email")).sendKeys(testData[3]);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(testData[4]);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(testData[5]);
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		
		driver.quit();
	}

}
