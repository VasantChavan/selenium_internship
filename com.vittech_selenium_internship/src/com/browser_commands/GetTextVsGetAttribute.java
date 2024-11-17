package com.browser_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.className("_8eso"));
		String fb_txt=ele.getText();
		System.out.println(fb_txt);
		
		System.out.println(ele.getAttribute("innerHTML"));
		
		
		String emailTxt = driver.findElement(By.name("email")).getAttribute("placeholder");
		System.out.println(emailTxt);
		driver.quit();
		
		
	}

}
