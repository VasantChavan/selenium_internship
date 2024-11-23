package com.testng;

import org.testng.annotations.Test;

public class GroupTestInTestNG {

	
	@Test(groups = "Sanity")
	public void sanityTestCases()
	{
		System.out.println("   sanityTestCases() ");
	}
	
	@Test(groups = "Regression")
	public void regressionTestCases()
	{
		System.out.println("   regressionTestCases() ");
	}
	
	@Test(groups = {"Regression","End To End"})
	public void regressionAndEndToEndTestCases()
	{
		System.out.println("   regressionAndEndToEndTestCases() ");
	}
	
	@Test(groups = {"Sanity","Smoke"})
	public void sanityAndSmokeTestCases()
	{
		System.out.println("   sanityAndSmokeTestCases() ");
	}
}
