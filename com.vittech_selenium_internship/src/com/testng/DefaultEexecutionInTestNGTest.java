package com.testng;

import org.testng.annotations.Test;

public class DefaultEexecutionInTestNGTest {
	
	
	// The default execution order in testNG Test is based on acceding order of the alphabet
	
	@Test
	public void login()
	{
		System.out.println(" Login success ...!!!");
	}
	
	@Test
	public void updatePrfoile()
	{
		System.out.println(" updated the profile successfully ...!!!");
	}
	
	@Test	
	public void logout()
	{
		System.out.println(" logout success ...!!!");
	}

}
