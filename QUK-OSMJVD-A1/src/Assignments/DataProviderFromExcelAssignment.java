package Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFromExcelAssignment {
@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException {
		File file=new File("./testDataFolder/excelTestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		int noOfRows = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
		int noOfCells = wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[noOfRows][noOfCells];
		//iterating through row and columns to fetch data and return
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfCells;j++) {
				
				data[i][j]=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
			}
		}
		
		return data;
	}
	
	
	@Test(dataProvider="testData")
	public void login(String[] testData) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(testData[0]);
		driver.findElement(By.id("Password")).sendKeys(testData[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
