/*package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng6  {
	WebDriver driver;

	@Test(groups = {"@smoke"})
	private void smoke() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		

	}
	@Test(groups = {"@sanity"})
	private void sanity() {
		
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Venkat");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("12345689");
		driver.quit();
		
	}
	@Test(groups = "@regression")
	private void regression() {
	

		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Venkatesh");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("1234568915154");
		driver.quit();
	}
	@Test(groups = "@retest")
	private void retest() {

		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Ven");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("12345689");
		driver.quit();
	}
	
	@Test(groups = "@E2E")
	private void E2E() {
		
		driver.quit();
	}
	
	

}
*/