/*package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng9 {
	@Test
	private void tc0() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Venkatesh");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("12345689");
		
	}

	
}
*/