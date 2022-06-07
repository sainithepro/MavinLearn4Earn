package com.TestNg.learn;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Config {
	
	public static WebDriver driver;
	
	
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\TestNg\\learn\\config_properties";
		//FileInputStream ip = new FileInputStream(path);
	//	prop.load(ip);
	

	
	
	
	
	@Test
	public void launchUrl() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get(prop.getProperty("url"));
	}
	

	
	
	
	
	
	
	
	

}
