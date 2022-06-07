package com.automationlearn.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		// Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input.upload_txt")).sendKeys("C:\\Users\\hasingh\\OneDrive - MSTEST-SHR-HASIN\\Desktop\\Selenium\\Resume.docx");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#submitbutton")).click();
	}

}
