package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnId {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement username_txt = driver.findElement(By.id("email"));
		WebElement password_txt = driver.findElement(By.id("pass"));
		
		username_txt.sendKeys("vasant@facebook.com");
		password_txt.sendKeys("password@123$");
		
		driver.findElement(By.id("u_0_5_iN")).click();
		
		
	}

}
