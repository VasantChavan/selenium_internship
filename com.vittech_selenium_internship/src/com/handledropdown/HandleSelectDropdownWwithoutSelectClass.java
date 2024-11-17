package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectDropdownWwithoutSelectClass {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
//		List<WebElement> monthDDOptions = 
//				driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
//	
//		for(WebElement ele:monthDDOptions)
//		{
//			if(ele.getText().equals("Oct"))
//			{
//				ele.click();
//				break;
//			}
//		}
		
		handleDropdownWithoutSelectClass(driver,"Dec","//select[@name='birthday_month']/option");
		handleDropdownWithoutSelectClass(driver, "2020", "//select[@name='birthday_year']/option");
		handleDropdownWithoutSelectClass(driver, "31", "//select[@name='birthday_day']/option");
		
		driver.quit();
	}
	
	static void handleDropdownWithoutSelectClass(WebDriver driver, String selectOption,String xpath)
	{
		List<WebElement> list =driver.findElements(By.xpath(xpath));
		for(WebElement ele:list)
		{
			if(ele.getText().equals(selectOption))
			{
				ele.click();
				break;
			}
		}
	}
	

}
