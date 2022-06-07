package com.automationlearn.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_SoftAssert {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
	}
	
	@Test
	public void testNGValidations() throws Exception {
		WebElement signin = driver.findElement(By.className("signin"));
		Assert.assertTrue(signin.isEnabled());
		signin.click();
		
		Assert.assertEquals(driver.findElement(By.id("login1")).isEnabled(), true);
		driver.findElement(By.id("login1")).sendKeys("SeleniumPanda@rediffmail.com");
		
		Assert.assertEquals(driver.findElement(By.id("password")).isEnabled(), true);
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		Assert.assertEquals(driver.findElement(By.className("signinbtn")).isEnabled(), true);
		driver.findElement(By.className("signinbtn")).click();
		
	
		Assert.assertEquals(driver.findElement(By.className("rd_logout")).isEnabled(),true);
		driver.findElement(By.className("rd_logout")).click();
		
	
		
//	//	Assert.assertEquals(driver.findElement(By.xpath("//b[text() = 'Rediff Home']")).isEnabled(), true);
//		driver.findElement(By.xpath("//b[text()= 'Rediff Home']"));
	}
	
	

}
