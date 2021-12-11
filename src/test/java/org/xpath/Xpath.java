package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to
		("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("wp-submit"));
		element.click();
		List<WebElement> elements = driver.findElements
				(By.xpath("//a[contains(text(),'Programming')]//parent::td//preceding-sibling::td"));
		
		for (WebElement a:elements) {
			String text = a.getText();
			System.out.println(text);
			
		}
		
		/*List<WebElement> elements = driver.findElements
				(By.xpath("//td[contains(text(),'free')]//parent::tr "));
		
		for (WebElement a:elements) {
			String text = a.getText();
			System.out.println(text);
			
		}*/
		
		
		
		
		
		
		
	}

}
