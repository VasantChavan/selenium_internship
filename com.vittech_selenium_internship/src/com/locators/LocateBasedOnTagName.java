package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnTagName {
	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();		
		List<WebElement> links = driver.findElements(By.tagName("a"));		
		System.out.println("Total Links on facebook Login page are "+links.size());
		
//		for (int i = 0; i<links.size();i++) {
//			String linksText=links.get(i).getText();
//			System.out.println(linksText);
//			if(linksText.equals("Create Page"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		for (WebElement ele : links) {
			
			if(ele.getText().equals("Sign Up"))
			{
				ele.click();
				break;
			}
			
		}		
		
	}

}
