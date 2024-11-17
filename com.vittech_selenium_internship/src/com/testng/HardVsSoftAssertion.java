package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class HardVsSoftAssertion {

	
	@Test
	public void hardAssert() {
		
		System.out.println("statement before assertion ");
		Assert.assertTrue(true);

		System.out.println("statement after assertion passed");

		Assert.assertTrue(false);

		System.out.println("statement after assertion failed");
	}
	
	@Test
	public void softAssert() {
		
		SoftAssert softAssert=new SoftAssert();
		
		System.out.println("statement before assertion ");
		
		softAssert.assertTrue(true);

		System.out.println("statement after assertion passed");

		softAssert.assertTrue(false);

		System.out.println("statement after assertion failed");
		
		softAssert.assertAll();
	}

}
