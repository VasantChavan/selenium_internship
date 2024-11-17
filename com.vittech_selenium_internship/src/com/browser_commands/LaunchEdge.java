package com.browser_commands;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
	
	
	public static void main(String[] args) {
		
		EdgeDriver driver =new EdgeDriver(); // It will launch the Edge browser
		driver.get("https://www.google.com"); //It will navigate to google.com page
		driver.close(); //It will close the browser window
		
	}

}
