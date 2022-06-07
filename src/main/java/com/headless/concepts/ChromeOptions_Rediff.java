package com.headless.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions_Rediff {
	
	public static WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeSuite
		public void Init() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	//	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	//	options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
		
	
	@Test
	public void Validations() {

//		String eTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
//		String aTitle = driver.getTitle();
//		
//		softAssert.assertEquals(eTitle, aTitle);
//		System.out.println("Title is correct");
//		
//		String eUrl = "https://www.rediff.com";
//		String aUrl = driver.getCurrentUrl();
//		
//		softAssert.assertEquals(eUrl,aUrl);
//		System.out.println("Url is correct");
//		
//		WebElement clickSignIn = driver.findElement(By.xpath("//a[@class = 'signin']"));
//		softAssert.assertTrue(clickSignIn.isEnabled(), "Sign in Element is Working");
//		clickSignIn.click();
		
		WebElement userName = driver.findElement(By.id("login1"));
		softAssert.assertTrue(userName.isEnabled(), "Username text box working");
		userName.sendKeys("Seleniumpanda@rediffmail.com");
		
		System.out.println("username entered");
		
		WebElement password = driver.findElement(By.id("password"));
		softAssert.assertTrue(password.isEnabled(),"password textbox working");
		password.sendKeys("Selenium@123");
		System.out.println("password Entered");
		
		WebElement signInBtn = driver.findElement(By.className("signinbtn"));
		softAssert.assertTrue(signInBtn.isEnabled(),"Sign in button working");
		signInBtn.click();
		System.out.println("sign in btn clicked");
		
		softAssert.assertEquals(driver.getTitle(), "Rediffmail");
		System.out.println("Login is successfull");
		


}
}
