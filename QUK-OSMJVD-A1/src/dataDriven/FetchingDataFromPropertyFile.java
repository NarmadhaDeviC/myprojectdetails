package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//create obj for file and pass the path of the file
		File file=new File("./testDataFolder/testdata.properties");
		
		//create obj for fileinputstream
		FileInputStream fis=new FileInputStream(file);
		
		//3)create obj for properties
		Properties p=new Properties();
		
		//4)call load method on propertis obj
		p.load(fis);
		
		//use getProperty method to get value
		String Key = p.getProperty("key").toString();
		String Path = p.getProperty("path").toString();
		String URL = p.getProperty("url").toString();
		
		//normal script using that var in file and not actual data
		System.setProperty(Key, Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(URL);
	}

}
