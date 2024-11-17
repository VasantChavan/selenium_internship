package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnLinkText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

		WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));

		String expTxt = "Forgotten password?";
		String aclTxt = forgottenPasswordLink.getText();

		if (expTxt.equals(aclTxt)) {
			forgottenPasswordLink.click();
		}
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Sign Up")).click();
	}

}
