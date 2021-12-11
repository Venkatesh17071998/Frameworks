package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng11 {
	@Parameters	("browser")
	@Test	
		private void tc01(String s) {
		if (s.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.id("username"));
			element.sendKeys("Ven");
			WebElement element1 = driver.findElement(By.id("password"));
			element1.sendKeys("12345689ufy");
			
			
		}else if (s.equals("ie")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.id("username"));
			element.sendKeys("Ven");
			WebElement element1 = driver.findElement(By.id("password"));
			element1.sendKeys("12345689ufy");
			
		}
			
		}

}
