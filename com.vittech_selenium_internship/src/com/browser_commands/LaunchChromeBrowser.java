package com.browser_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // It will launch the chrome browser
		driver.get("https://www.facebook.com"); // It will navigate to facebook page
		driver.close();
		
	}

}
