package Interview;

import java.util.ArrayList;

public class A1 {

public static void main(String[] args)
{
	String s1="malayalam";
	String rvStr="";
	int len=s1.length();
	
	for(int i=len-1;i>=0;i--)
	{
		rvStr=rvStr+s1.charAt(i);
		
	}
	
	System.out.println(rvStr);
	
	if(rvStr.toLowerCase().equals(s1))
	{
		System.out.println("is palinrome");
	}
}
}
