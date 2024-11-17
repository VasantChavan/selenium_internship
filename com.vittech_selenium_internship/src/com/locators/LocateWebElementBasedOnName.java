package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnName {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement username_txt = driver.findElement(By.name("email"));
		WebElement password_txt = driver.findElement(By.name("pass"));
		
		
		username_txt.sendKeys("vasant@facebook.com");
		password_txt.sendKeys("vasant@12324536354#$#@");
		
		username_txt.clear();
		password_txt.clear();
		
		username_txt.sendKeys("harshit@gmail.com");
		password_txt.sendKeys("harshit@123$");
		
		driver.findElement(By.name("login")).click();
		
	}

}
