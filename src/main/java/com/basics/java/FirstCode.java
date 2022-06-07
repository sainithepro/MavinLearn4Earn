package com.basics.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstCode {
	
	// STCM > SMCT
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("THis will execute first");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This will be executed second");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This will be executed third");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This will be executed fourth");
	}
	
	@Test
	public void init() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This will be executed last");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This will be executed sixth");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This will be executed seventh");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This will be executed eigth");
	}
	
	
	
	

}
