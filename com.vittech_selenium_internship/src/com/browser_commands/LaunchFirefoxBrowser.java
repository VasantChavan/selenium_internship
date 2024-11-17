package com.browser_commands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.close();
	}

}
