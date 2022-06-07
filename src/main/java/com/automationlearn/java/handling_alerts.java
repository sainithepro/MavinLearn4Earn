package com.automationlearn.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_alerts {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.rediff.com");
//		
//		
//		driver.findElement(By.cssSelector("a.signin")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input.signinbtn")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		
//		driver.findElement(By.cssSelector("input#login1")).sendKeys("abcs.com");

		driver.get("https://www.irctc.co.in/");

		driver.findElement(By.xpath("//button[text() = 'OK']")).click();

//		Thread.sleep(4000);
//		driver.switchTo().alert().accept();
//	//	System.out.println(alert.getText());
//		//alert.accept();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text() = ' REGISTER ']")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input#userName")).sendKeys("sainithepro");
		driver.findElement(By.cssSelector("input#usrPwd")).sendKeys("ABC");
//		
	}

}
