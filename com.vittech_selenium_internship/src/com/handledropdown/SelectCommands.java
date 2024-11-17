package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCommands {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement monthDD=driver.findElement(By.name("birthday_month"));
		
		Select sel=new Select(monthDD);
		
		sel.selectByVisibleText("Aug");
		
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println("My first selected value is "+firstSelectedOption.getText());
		
		sel.selectByVisibleText("Jan");
		
		System.out.println("The second selected value is "+sel.getFirstSelectedOption().getText());
		
		
		List<WebElement> monthDDOptions = sel.getOptions();
		
		System.out.println(monthDDOptions.size());
		
		for (WebElement ele : monthDDOptions) {
			System.out.println(ele.getText());	
			if(ele.getText().equals("May"))
			{
				ele.click();
				break;
			}
		}
		
		
		
		
	}

}
