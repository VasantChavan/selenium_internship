package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	
	@Test(dataProvider = "RegData")
	public void getData(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name = "RegData")
	public String[][] createData()
	{
		String[][] data =new String[3][2];
		
		data[0][0] ="User Name";
		data[0][1] ="User Password";
		
		data[1][0] ="vasant@facebook.com";
		data[1][1] ="vasant@123$";
		
		data[2][0] ="Vaishali@gmail.com";
		data[2][1] ="Vaisha;i#123245$#";
		
		return data;				
		
	}
	
	
	

}
