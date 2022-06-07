package com.automationlearn.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount_XpathOnly {

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

		WebElement createAccount = driver.findElement(By.xpath("//a[text()= 'Create Account']"));

		if (createAccount.isEnabled()) {
			createAccount.click();
		}

		Thread.sleep(3000);

		WebElement inputName = driver.findElement(By.xpath("//input[starts-with(@name, 'name')]"));

		if (inputName.isEnabled()) {
			inputName.sendKeys("Harpreet Singh");
		}

		WebElement inputMail = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));

		if (inputMail.isEnabled()) {
			inputMail.sendKeys("sainithepro");
		}

		WebElement inputPassword = driver
				.findElement(By.xpath("//table[@class='f14']/descendant::input[starts-with(@name,'passwd')]"));

		if (inputPassword.isEnabled()) {
			inputPassword.sendKeys("Selenium@123");
		}

		WebElement inputRetypePassword = driver
				.findElement(By.xpath("//table[@class='f14']/descendant::input[starts-with(@name,'confirm_passwd')]"));

		if (inputRetypePassword.isEnabled()) {
			inputRetypePassword.sendKeys("Selenium@123");
		}
		
		WebElement inputAltEmail = driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]"));
		
		if (inputAltEmail.isEnabled()) {
			inputAltEmail.sendKeys("sainitpro@gmail.com");
		}
		
//		WebElement areaCode = driver.findElement(By.xpath("//span[@id ='lbl_txt']"));
		
	//	areaCode.click();
		
//		WebElement selectAreaCode = driver.findElement(By.xpath("//li[text() = 'USA/Canada (+1)]"));
	//	selectAreaCode.click();
	//	Select SelectAreaCode = new Select (driver.findElement(By.xpath("//span[@id = 'lbl_txt']")));
		// SelectAreaCode.selectByVisibleText("USA/Canada(+1)");
		
		WebElement inputMobileNo = driver.findElement(By.xpath("//input[@id = 'mobno']"));
		if (inputMobileNo.isDisplayed()) {
			inputMobileNo.sendKeys("2342424214");
		}
		
		
		Select selectDay = new Select (driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]")));
		selectDay.selectByIndex(2);
		
		Select selectMonth = new Select (driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]")));
		selectMonth.selectByVisibleText("OCT");
		
		Select selectYear = new Select (driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]")));
		selectYear.selectByVisibleText("1996");
		
		WebElement selectGender = driver.findElement(By.xpath("//table[@id='tblcrtac']/descendant::td[text()= 'Gender']/following::input[1]"));
		selectGender.click();
		
		Select selectCountry = new Select (driver.findElement(By.xpath("//select[@id = 'country']")));
		selectCountry.selectByValue("37");
		
//		Select selectCity = new Select(driver.findElement(By.xpath("//")));
//		selectCity.selectByVisibleText("Other");
		
//		Thread.sleep(1000);
//		
////		WebElement enterCity = driver.findElement(By.xpath("//input[starts-with(@name,'othercity')]"));
////		
////		if (enterCity.isDisplayed()) {
////			enterCity.sendKeys("Jalandhar");
////		}
		
		
		System.out.println(" Program Is Successful");
		
	}

}
