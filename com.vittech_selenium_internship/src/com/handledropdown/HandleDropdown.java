package com.handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD=driver.findElement(By.name("birthday_day"));
		WebElement monthDD=driver.findElement(By.name("birthday_month"));
		WebElement yearDD=driver.findElement(By.name("birthday_year"));		
		
		//There are three ways to select the drop down value
		//By using index
		//By using value
		// By using visible text
		Select selDay=new Select(dayDD);
		Select selMonth=new Select(monthDD);
		Select selYear=new Select(yearDD);
		
		selDay.selectByIndex(5); // By using index
		selMonth.selectByIndex(2);
		selYear.selectByIndex(3);
				
		Thread.sleep(3000);
		selDay.selectByValue("15"); // By using value
		selMonth.selectByValue("4");
		selYear.selectByValue("2010");				
		Thread.sleep(3000);
		
		selDay.selectByVisibleText("30"); // By using visible text
		selMonth.selectByVisibleText("Oct");
		selYear.selectByVisibleText("2001");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
