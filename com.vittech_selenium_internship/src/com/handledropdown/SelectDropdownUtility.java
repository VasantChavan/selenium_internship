package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownUtility {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD=driver.findElement(By.name("birthday_day"));
		WebElement monthDD=driver.findElement(By.name("birthday_month"));
		WebElement yearDD=driver.findElement(By.name("birthday_year"));
		
		// write a utility function to handle drop down value of any drop down 
		//by using index, value and visible text 
		
//		handleSelectDropdownByUsingIndex(dayDD,9);
//		handleSelectDropdownByUsingIndex(monthDD,5);
//		handleSelectDropdownByUsingIndex(yearDD,20);
//		
//		
//		handleSelectDropdownByUsingValue(dayDD,"12");
//		handleSelectDropdownByUsingValue(monthDD,"5");
//		handleSelectDropdownByUsingValue(yearDD,"2021");
//		
//		
//		handleSelectDropdownByUsingVisibleTxt(dayDD,"22");
//		handleSelectDropdownByUsingVisibleTxt(monthDD,"Apr");
//		handleSelectDropdownByUsingVisibleTxt(yearDD,"1990");
//		
		
		selectValueFromDropddownOptions(dayDD, "15");
		selectValueFromDropddownOptions(monthDD, "Aug");
		selectValueFromDropddownOptions(yearDD, "2024");	
		
		driver.quit();
		
	}
	
	
	static void selectValueFromDropddownOptions(WebElement dropdown, String option )
	{
		List<WebElement> dropdownOptions =new Select(dropdown).getOptions();
		for(WebElement ele: dropdownOptions)
		{
			if(ele.getText().equals(option))
			{
				ele.click();
				break;
			}
			
		}
	}
	
	
	static void handleSelectDropdownByUsingIndex(WebElement dropdown, int index)
	{
		new Select(dropdown).selectByIndex(index);
	}
	
	static void handleSelectDropdownByUsingValue(WebElement dropdown, String value)
	{
		new Select(dropdown).selectByValue(value);
	}
	
	static void handleSelectDropdownByUsingVisibleTxt(WebElement dropdown, String visibleTxt)
	{
		new Select(dropdown).selectByVisibleText(visibleTxt);
	}

}
