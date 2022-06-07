package com.automationlearn.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation_Xpath_only {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("My rediff title is correct");
		}

		String expectedUrl = "https://www.rediff.com/";
		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("My rediff URL is correct");
		}

		// Automating using Xpath ONLY!!

		WebElement signIn = driver.findElement(By.xpath("//a[contains(@class , 'signin')]"));

		if (signIn.isEnabled()) {
			signIn.click();
		}

		WebElement usernameBox = driver.findElement(By.xpath("//input[@id='login1']"));

		if (usernameBox.isEnabled()) {
			usernameBox.sendKeys("seleniumpanda@rediffmail.com");
		}

		WebElement passwordBox = driver.findElement(By.xpath("//input[contains(@id,'password')]"));

		if (passwordBox.isEnabled()) {
			passwordBox.sendKeys("Selenium@123");
		}
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@class='signinbtn']"));

		if (signInButton.isEnabled()) {
			signInButton.click();
		}
		
		WebElement SignInConfirmation = driver.findElement(By.xpath("//span[@class = 'rd_tp-rgt']"));
		
		if (SignInConfirmation.isDisplayed()) {
			System.out.println("Sign In Successfull");
		}
		
		Thread.sleep(3000);
		
		WebElement logoutButton = driver.findElement(By.xpath("//a[contains(@class , 'rd_logout')]"));
		
		if (logoutButton.isEnabled() ) {
			logoutButton.click();
		}

		Thread.sleep(4000);
		
		WebElement logoutConfirmation = driver.findElement(By.xpath("//p[text()= 'You have successfully signed out of Rediffmail.']"));
		
		if (logoutConfirmation.isDisplayed()) {
			System.out.println("Logout Success!!");
		}
		
		Thread.sleep(3000);
		
		WebElement homePage = driver.findElement(By.xpath("//b[text()= 'Rediff Home']"));
		
		if (homePage.isEnabled()) {
			homePage.click();
		}
		
	}

}
