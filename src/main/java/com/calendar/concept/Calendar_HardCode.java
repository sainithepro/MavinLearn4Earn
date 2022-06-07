package com.calendar.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_HardCode {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com ");
		driver.findElement(By.xpath("//button[@title= 'Departure date']")).click();
		
		Select date = new Select(driver.findElement(By.xpath("//select[@id= 'depart-calendar__bpk_calendar_nav_select']")));
		date.selectByVisibleText("November 2022");
		
		
		
	}

}
