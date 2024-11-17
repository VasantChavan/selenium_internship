package com.handle_multiple_tab_or_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl()); 
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl()); 
		
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl()); 
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl()); 
		
			
		driver.close();

	}

}
