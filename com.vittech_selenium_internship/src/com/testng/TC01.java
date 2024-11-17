package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01 {

	@BeforeTest
	public void beforeTest() {
		System.out.println(" beforeTest() ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" beforeClass()");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" beforeMethod() ");
	}

	@Test
	public void tc01() {
		System.out.println(" test case 01");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" afterTest() ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" afterClass() ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" afterMethod() ");
	}

}
