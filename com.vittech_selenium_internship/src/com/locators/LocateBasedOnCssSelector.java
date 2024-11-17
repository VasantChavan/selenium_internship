package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnCssSelector {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//# means to represents the attribute id
		//. means to represents the attribute class name
		
//		driver.findElement(By.cssSelector("#email")).sendKeys("vasant@facebook.com");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("vasant!234%");
//		
//		System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());
//		
//		System.out.println(driver.findElement(By.cssSelector("#reg_pages_msg")).getText());

		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vasant@facebook.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("vasant@facebook.com");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='_9ay7']")).getText());
		
		driver.quit();
		
		
	}

}
