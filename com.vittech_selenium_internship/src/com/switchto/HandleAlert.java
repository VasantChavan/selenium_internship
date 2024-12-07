package com.switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	/*	Handle alert / browser pop up:-
		-------------------------------

		WebDriver driver = new ChromeDriver();

		Alert alert= driver.switchTo().alert();

		Alert is an interface which defines following 4 methods

		i.  alert.accept();  It will perform click operation on Ok button
		ii. alert.dismiss(); It will perform click operation on cancel button
		iii.alert.sendKeys(String charSeq); It will send / input test within alert box
		iv. alert.getText();  It will fetch the visible text on the alert box
*/

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		// org.openqa.selenium.UnhandledAlertException:
		//org.openqa.selenium.NoAlertPresentException:

		Alert alert = driver.switchTo().alert(); // It will switch to the alert

		alert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();
		
		//alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		
		alert.sendKeys("Hi all, welcome in the team!!!!");
		alert.accept();
		
		//alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		driver.findElement(By.linkText("Elemental Selenium")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}
