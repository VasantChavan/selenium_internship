package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnClassName {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String expHeading ="Facebook helps you connect and share with the people in your life.";
		WebElement fb_heading = driver.findElement(By.className("_8eso"));
		String heading = fb_heading.getText();
		
		if(expHeading.equals(heading))
		{
			System.out.println("matched with expected heading "+ heading);
		}
		
		System.out.println(driver.findElement(By.className("_58mk")).getText());
		
		driver.findElement(By.className("inputtext_55r1_6luy")).sendKeys("hello");
		
		driver.close();
		
	}

}
