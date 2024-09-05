package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create file and provide path
		File file=new File("./testDataFolder/excelTestData.xlsx");
		//create obj for fileinputstream
		FileInputStream fis=new FileInputStream(file);
		//create workbook obj abd pass ref var of fis
		Workbook wb=WorkbookFactory.create(fis);
		//call sheet , row and cell method
		double number = wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(number);
		String name = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(name);
		boolean bool = wb.getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(bool);
		LocalDateTime date = wb.getSheet("Sheet1").getRow(3).getCell(1).getLocalDateTimeCellValue();
		System.out.println(date);
		String date1 = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(date1);
	
	}

}
