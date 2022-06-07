package com.TestNg.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_parallel_2 {
	
public static WebDriver driver;
	
	@Test(threadPoolSize = 2,invocationCount = 2)
	public void TC1(){
		System.out.println("This output is for TC1: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void TC2() {
		System.out.println("This output is for TC2: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("https://youtube.com");
	}
	
	@Test
	public void TC3() {
		System.out.println("This output is for TC3: " + Thread.currentThread().getId());
	}

}
