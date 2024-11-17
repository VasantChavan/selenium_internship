package com.capturescreen;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotsUtility {
	
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		captureScreen(driver, "fb_login");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		captureScreen(driver,"regis");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	
	static void captureScreen(WebDriver driver, String screenshotName) throws Exception
	{
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./screenshots/"+screenshotName+".png"));
		
	}

}
