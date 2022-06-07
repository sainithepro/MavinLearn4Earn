package com.automationlearn.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountUsingCSS {
	
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

		WebElement createAccount = driver.findElement(By.cssSelector("p#signin_info > a:nth-child(3)"));

		if (createAccount.isEnabled()) {
			createAccount.click();
		}

		Thread.sleep(3000);

		WebElement inputName = driver.findElement(By.cssSelector("input[name ^= name"));

		if (inputName.isEnabled()) {
			inputName.sendKeys("Harpreet Singh");
		}

		WebElement inputMail = driver.findElement(By.cssSelector("input[name ^= login"));

		if (inputMail.isEnabled()) {
			inputMail.sendKeys("sainithepro");
		}

		WebElement inputPassword = driver
				.findElement(By.cssSelector("input[name ^= passwd]"));

		if (inputPassword.isEnabled()) {
			inputPassword.sendKeys("Selenium@123");
		}

		WebElement inputRetypePassword = driver
				.findElement(By.cssSelector("input[name ^= confirm_passwd"));

		if (inputRetypePassword.isEnabled()) {
			inputRetypePassword.sendKeys("Selenium@123");
		}
		
		WebElement inputAltEmail = driver.findElement(By.cssSelector("input[name ^= altemail]"));
		
		if (inputAltEmail.isEnabled()) {
			inputAltEmail.sendKeys("sainitpro@gmail.com");
		}
		
		WebElement inputMobileNo = driver.findElement(By.cssSelector("input#mobno"));
		if (inputMobileNo.isDisplayed()) {
			inputMobileNo.sendKeys("1234567891");
		}
		
		
		Select selectDay = new Select (driver.findElement(By.cssSelector("select[name ^= DOB_Day]")));
		selectDay.selectByIndex(2);
		
		Select selectMonth = new Select (driver.findElement(By.cssSelector("select[name ^= DOB_Month]")));
		selectMonth.selectByVisibleText("OCT");
		
		Select selectYear = new Select (driver.findElement(By.cssSelector("select[name ^= DOB_Year]")));
		selectYear.selectByVisibleText("1996");
		
		WebElement selectGender = driver.findElement(By.cssSelector("input[type=radio]:nth-child(1)"));
		selectGender.click();
		
		Select selectCountry = new Select (driver.findElement(By.cssSelector("select#country")));
		selectCountry.selectByValue("37");

	}

}
