package Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPropertyandExcelFiles {

	public static void main(String[] args) throws IOException {
		//Ftching data using property file
		File file=new File("./testDataFolder/testDataAssignment1.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties p=new Properties();
		p.load(fis);
		
		String Key = p.getProperty("key").toString();
		String Path = p.getProperty("path").toString();
		String URL = p.getProperty("url").toString();
		
		
	    System.setProperty(Key, Path);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(URL);
	    driver.findElement(By.linkText("Register")).click();
	    
	    //fetching data using excel file
	    File file1=new File("./testDataFolder/excelTestData.xlsx");
	    FileInputStream fis1=new FileInputStream(file1);
	    Workbook wb=WorkbookFactory.create(fis1);
	    
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
