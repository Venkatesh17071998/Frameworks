package org.testng;

import java.util.Date;
import org.testng.annotations.Test;
import org.base.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng3 extends LibGlobaltestng{
	private static final String invocation = null;
	/*@Test
	private void Final() {
		System.out.println("Final");
			}
		}		
*/
	
@BeforeClass
private void launchbrowser() {
   getBrowser();
   getUrl("https://www.facebook.com/");
   maximize();
}
@AfterClass
private void closeAll() {
	quit();
  
}
@BeforeMethod
private void gettime() {
Date date=new Date();
System.out.println("open");
System.out.println(date);
	
}
@AfterMethod
private void gettime1() {
    Date date=new Date();
    System.out.println("close");
    System.out.println(date);
}
@Parameters({"fbusername","fbpass"})
@Test(invocationCount=5)
private void tco1(@Optional("Venkatesh")String s,@Optional("12345689")String s1) {
	WebElement usrnam = findLocatorByid("email");
	sendKeys(usrnam,s);
	System.out.println(usrnam);
	WebElement password = findLocatorByid("pass");
	sendKeys(password,s1);
	System.out.println(password);
	

}
}
