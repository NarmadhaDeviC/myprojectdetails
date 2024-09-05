package Assignments;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAssignment {
	@DataProvider(name="testdata1")//dataprovider annotation to pass data
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
	
	@DataProvider(name="testdata2")//dataprovider annotation to pass data
	public String[][] getData1(){
		
		String[][] test=new String[2][3];//creating to strings using same variable with 3values each
		test[0][0]="Sadur";
       test[0][1]="India";
		test[0][2]="B+";
		
		test[1][0]="Vidhyuth";
	       test[1][1]="India";
			test[1][2]="B+";
			
			return test;//returning data as it has to pass to below method
	}
	
	@Test(dataProvider="testdata1")//passing above data here using same dataprovider name
	
	public void test(String name,String country,String blood){
		Reporter.log(name,true);
		Reporter.log(country,true);
		Reporter.log(blood,true);
		
	}
	
	@Test(dataProvider="testdata2")//passing above data here using same dataprovider name
	
	public void print(String name,String country,String blood){
		Reporter.log(name,true);
		Reporter.log(country,true);
		Reporter.log(blood,true);
		
	}
}
