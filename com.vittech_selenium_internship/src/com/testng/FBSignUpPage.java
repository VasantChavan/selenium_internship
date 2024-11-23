package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBSignUpPage {
	
	
	@Test(dataProvider = "signUPData")
	public void signUp(Object firname, Object lastname, Object dob, Object gender, Object moNum, Object newPass)
	{
		System.out.println(firname);
		System.out.println(lastname);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(moNum);
		System.out.println(newPass);
	
	}
	
	@DataProvider
	public Object[][] signUPData()
	{
		Object[][] data=
			{
					{"Firsname","Surname","DoB","GenderRadioBtn","MoNum","NewPass"},
					{"Vasant","Chavan","22-Apr-1990","Male",9898987656L,"Vasant@123$"},
					{"Vaishali","Rathod","11-Oct-1997","Female",9891907659L,"Vaishali@123$"},
					{"Vaishali","Rathod","11-Oct-1997","Female",9891907659L,"Vaishali@123$"},
					{"Vasant","Chavan","22-Apr-1990","Male",9898987656L,"Vasant@123$"},
					{"Janvi","Zha","21-Jul-2000","Custom",9898987656L,"Janvi@123$"}
			};
		return data;
	}

}
