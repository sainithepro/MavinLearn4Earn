package com.waits.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_Condition {

	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		
		ChromeOptions options = new ChromeOptions();
	//	options.setPageLoadStrategy(PageLoadStrategy.NONE); // slowest
	//	options.setPageLoadStrategy(PageLoadStrategy.EAGER); // faster
	//	options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // Normal
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		//driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		WebElement logoutbtn =   driver.findElement(By.className("rd_logout"));
		System.out.println(logoutbtn.isDisplayed());
		
		
		
		
 	}
	
	

}
