package org.testng;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng4 extends LibGlobaltestng{
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
	@Parameters({"fb4username","fb4pass"})
	@Test
	private void tco1(@Optional("Venkatesh")String s,@Optional("12345689")String s1) throws InterruptedException {
		WebElement usrnam = findLocatorByid("email");
		sendKeys(usrnam,s);
		System.out.println(usrnam);
		WebElement password = findLocatorByid("pass");
		sendKeys(password,s1);
		System.out.println(password);
		

	}
	

}
