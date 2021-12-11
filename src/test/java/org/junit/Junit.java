package org.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void Beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void Afterclass() {
		driver.quit();

	}
	@Before
	public void Before() {
		Date date =new Date();
		System.out.println(date);
	}
	@After
	public void after() {
		Date date =new Date();
		System.out.println(date);

	}
	@Test
	public void test() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		element.sendKeys("Venkatesh");
		String attribute = element.getAttribute("value");
	Assert.assertEquals("verify usrnam", "Venkatesh",attribute );
	
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
