package com.browser_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuitCommnads {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		//driver.close(); It will close the browser window/tab where the driver instance is present
		
		driver.quit(); // It will close all the browser window/ tab which has opened by the driver instance
	}

}
