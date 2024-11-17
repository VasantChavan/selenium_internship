package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC02 {

	@AfterSuite
	public void afterSuite() {
		System.out.println(" afterSuite() ");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" beforeSuite() ");
	}

	@Test
	public void tc02() {
		System.out.println(" test case 02");
	}

}
