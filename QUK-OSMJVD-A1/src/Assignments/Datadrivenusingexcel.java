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

public class Datadrivenusingexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testDataFolder/excelTestData.xlsx");		
		FileInputStream fis=new FileInputStream(file);		
		Workbook wb=WorkbookFactory.create(fis);
		
		//fetching from excel
		String key = wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		String path = wb.getSheet("Sheet2").getRow(3).getCell(1).getStringCellValue();
		String url = wb.getSheet("Sheet2").getRow(7).getCell(1).getStringCellValue();
		
		//launching app using variable
	    System.setProperty(key, path);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
		
	    driver.findElement(By.linkText("Register")).click();
	    
	    //fetching register details  from excel
	    String firstname = wb.getSheet("Registerdetails").getRow(0).getCell(1).getStringCellValue();
	    String lastname = wb.getSheet("Registerdetails").getRow(1).getCell(1).getStringCellValue();
	    String email = wb.getSheet("Registerdetails").getRow(2).getCell(1).getStringCellValue();
	    String password = wb.getSheet("Registerdetails").getRow(3).getCell(1).getStringCellValue();
	    
	    
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.id("FirstName")).sendKeys(firstname);
	    driver.findElement(By.id("LastName")).sendKeys(lastname);
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.id("Password")).sendKeys(password);
	    driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
	    
	    driver.findElement(By.id("register-button")).click();
	}
}
