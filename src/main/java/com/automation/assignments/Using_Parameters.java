package com.automation.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Parameters {
	
	public static WebDriver driver;

	@Test(groups = {"run"})
	@Parameters({"Browser"})
	public void Rediff(String Browser) {
		
		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://rediff.com");


	}
	
	
	@Test(groups = {"Chrome"})
	public void login() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}
	
	@Test(groups = "Firefox")
	public void videos() {
		driver.findElement(By.className("vdicon")).click();
	}
}
