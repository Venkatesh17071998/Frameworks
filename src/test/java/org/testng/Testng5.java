package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng5 {
	WebDriver driver;
	@DataProvider(name="testdata")
	private Object[][] getdata() {
		return new  Object[][] {
			
			{"venkat","12345"}, {"venkatesh","12345689"},{"venkatesh1998","12345"}};
	}
	@Test(dataProvider="testdata")
	private void tco(String s,String s1) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys(s);
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(s, "Venkat");
		WebElement element1 = driver.findElement(By.id("pass"));
		element1.sendKeys(s1);
		Assert.assertEquals(s, "12345");
		driver.quit();
	}
	@DataProvider(name="testdata1")
	private Object[][] getdata1() {
		return new  Object[][] {
			{"venkat","12345"}, {"venkatesh","12345689"},{"venkatesh1998","12345"}};
	}
	@Test(dataProvider="testdata1",priority=-1,enabled=false)
	
	private void tco1(String s,String s1) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys(s);
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys(s1);
		driver.quit();
	}
}

