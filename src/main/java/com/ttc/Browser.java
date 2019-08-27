package com.ttc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	static WebDriver driver = new ChromeDriver();

	
	public static void goTo(String url) {
		driver.get(url);
	}
	public static String title() {

		return driver.getTitle();
	}

	/*
	 * public static void img() {
	 * 
	 * //return driver.findElement(By.className("pipelinedemoHeaderContentLogo"); }
	 */
	public static void close() {
		driver.close();
		
	}
	public static String register() {
			   
		driver.findElement(By.id("pipelinedemoInputName")).sendKeys("Maithra");
		driver.findElement(By.id("pipelinedemoInputLastname")).sendKeys("Jadhav");
		driver.findElement(By.id("pipelinedemoInputEmail")).sendKeys("maithra.jadhav@testingconsultancy.com");
		//driver.findElement(By.id("pipelinedemoInputVisitType")).get(0).click();
		
		driver.findElement(By.id("pipelinedemoButtonRegister")).click();
				
		return driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your registration!')]")).getText();
				
	}
	public static String verifyCaption() {
		return driver.findElement(By.id("pipelinedemoFormRegisterLabel")).getText();
	}

}
