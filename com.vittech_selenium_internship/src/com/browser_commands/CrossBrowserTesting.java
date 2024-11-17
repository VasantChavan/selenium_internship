package com.browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	static WebDriver driver;
	
	static void launchBrowser(String browsername, String url)
	{
		if(browsername.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("Browser is not available to launch");
		}
		driver.get(url);
		driver.close();
		
	}
	public static void main(String[] args) {
		
		launchBrowser("chrome","http://www.facebook.com");
		launchBrowser("firefox", "https://www.google.com");
		launchBrowser("edge", "https://www.gmail.com");
	}
}
