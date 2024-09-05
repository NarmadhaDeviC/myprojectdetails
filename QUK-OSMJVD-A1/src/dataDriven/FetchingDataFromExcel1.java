package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromExcel1 {

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
		
	}

}
