package com.automationlearn.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertion_concept {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
	}
	
	@Test(priority = 1)
	public void getUrl() throws Exception {

//		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
//		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("Title is corect!");
//		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");

	}
	
	
	@Test(priority = 2)
	public void ClickSignin() {
		driver.findElement(By.cssSelector(".signin")).click();
	}
	
	@Test(priority = 3)
	public void enterUsername() {
		Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled());
		driver.findElement(By.cssSelector("input#login1")).sendKeys("abcd.com");
		
	}
	
	@Test(priority = 4)
	public void enterPassword() {
		driver.findElement(By.cssSelector("input#password")).sendKeys("abcd1234");
		
	}
	
//	@AfterClass
//	public void quit() {
//		driver.close();
//	}
	
	
}
	
	
	
	
	
	
	
	
	
	/*
	
	@Test()
	public static void a(){
		System.out.println("This is the first test!");
		//SoftAssert softassert = new SoftAssert();
		//softassert.fail("I wanted to fail it!!!");
		System.out.println("Will it execute ?");
		
		Assert.assertFalse(1>2, "This condition maybe true!");
		
		System.out.println("Let see what happens!");
	}
	
	@Test(enabled = false)
	public static void b () { 
		System.out.println("This is the second test!!");
	}

	@Test(priority = 0)
	public static void c() {
		System.out.println("This is the thrid test!!!");
	}
	
	*/

