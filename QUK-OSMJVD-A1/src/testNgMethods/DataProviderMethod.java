package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {

	@DataProvider(name="testdata")//dataprovider annotation to pass data
	public String[][] getData(){
		
		String[][] data=new String[2][3];//creating to strings using same variable with 3values each
		data[0][0]="Narmu";
       data[0][1]="NL";
		data[0][2]="AB+";
		
		data[1][0]="Vishnu";
	       data[1][1]="NL";
			data[1][2]="O+";
			
			return data;//returning data as it has to pass to below method
	}
	
	@Test(dataProvider="testdata")//passing above data here using same dataprovider name
	
	public void print(String name,String country,String blood){
		Reporter.log(name,true);
		Reporter.log(country,true);
		Reporter.log(blood,true);
		
	}
}
