package com.browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommands {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	
		String pageTitle = driver.getTitle();
		System.out.println("Facebook Login Page title : "+pageTitle);
		
		String curretURL = driver.getCurrentUrl();
		System.out.println("Facebook current URL :"+curretURL);
		
		String pageSource =driver.getPageSource();
		
		System.out.println(pageSource.contains(pageTitle));
		
				
		driver.close();
		//driver.quit();	
		
	
	}

}
