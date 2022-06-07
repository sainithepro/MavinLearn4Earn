package com.automationlearn.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_qa_alerts {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.category-cards > div:nth-of-type(3)")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text() = 'Alerts']")).click();
		
		String PresentUrl = driver.getCurrentUrl();
		System.out.println(PresentUrl);
		
		WebElement Alert = driver.findElement(By.cssSelector("#alertButton"));
		if (Alert.isDisplayed()) {
			Alert.click();
		}
		
		Thread.sleep(2000);
		
		Alert alertRegular = driver.switchTo().alert();
		System.out.println(alertRegular.getText());
		alertRegular.accept();
		
		
		
		WebElement alertTimer = driver.findElement(By.cssSelector("#timerAlertButton"));
		if (alertTimer.isDisplayed()) {
			alertTimer.click();
		}
	
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alertDelayed = driver.switchTo().alert();
		System.out.println(alertDelayed.getText());
		alertDelayed.accept();
		
		
		WebElement alertConfirm = driver.findElement(By.cssSelector("#confirmButton"));
		if (alertConfirm.isDisplayed()) {
			alertConfirm.click();
		}
		
	
		
		Thread.sleep(2000);
		
		Alert alertConfirmation = driver.switchTo().alert();
		System.out.println(alertConfirmation.getText());
		alertConfirmation.accept();
		

		
		WebElement alertInput = driver.findElement(By.cssSelector("#promtButton"));
		if (alertInput.isDisplayed()) {
			alertInput.click();
		}
	
		Thread.sleep(2000);
		
		Alert alertText = driver.switchTo().alert();
		alertText.sendKeys("Harpreet Singh");
		System.out.println(alertText.getText());
		Thread.sleep(2000);
		
		alertText.accept();

	}

}
