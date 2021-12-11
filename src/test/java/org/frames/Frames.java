package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		WebElement a = driver.findElement(By.xpath("//input[@id='username']"));
		a.sendKeys("Venkatesh");
		String a1 = a.getAttribute("value");
		System.out.println(a1);
		WebElement b = driver.findElement(By.xpath("//input[@id='password']"));
		b.sendKeys("12345689");
		String b1 = b.getAttribute("value");
		System.out.println(b1);
		WebElement c = driver.findElement(By.xpath("//input[@name='login']"));
		c.click();
	}
	

}
