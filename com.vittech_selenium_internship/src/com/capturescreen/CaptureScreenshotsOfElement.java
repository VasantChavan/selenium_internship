package com.capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotsOfElement {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		WebElement ele = driver.findElement(By.xpath("//form[@class='_9vtf']"));
		
		File scrFile = ele.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshots/form_empty.png");
		
		FileHandler.copy(scrFile, target);
		
		driver.findElement(By.name("email")).sendKeys("vasant@facebbok.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@123$");
		
		File scrFile1 = ele.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./screenshots/form_filled.png");
		
		FileHandler.copy(scrFile1, target1);
	}

}
