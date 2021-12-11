package org.testng;

import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng1 extends LibGlobaltestng {
	WebDriver driver;

	@BeforeClass
	private void launchBrowser() {
		getBrowser();
		getUrl("https://adactinhotelapp.com/");
		maximize();
	}

	@BeforeMethod
	private void starttime() {
		Date Date = new Date();
		System.out.println(Date);
	}

	@Parameters("username")
	@Test
	private void Test(String s) throws InterruptedException {
		WebElement txtusername = findLocatorByxpath("//*[@id=\"username\"]");
		txtusername.sendKeys(s);
	}

	@Parameters({"pass","index"})
	@Test
	private void Test1(String s1,int s2) throws InterruptedException {
		WebElement txtpass = findLocatorByxpath("//*[@id=\"password\"]");
		txtpass.sendKeys(s1);
		WebElement click = findLocatorByxpath("//*[@id=\"login\"]");
		click(click);
		WebElement location = findLocatorByxpath("//*[@id=\"location\"]");
		selectbyindex(location, s2);
		WebElement hotels = findLocatorByxpath("//*[@id=\"hotels\"]");
		selectbyindex(hotels, 1);
		WebElement roomnos = findLocatorByxpath("//*[@id=\"room_nos\"]");
		selectbyindex(roomnos, 2);
		WebElement roomtype = findLocatorByxpath("//*[@id=\"room_type\"]");
		selectbyindex(roomtype, 1);
		WebElement datepickin = findLocatorByxpath("//*[@id=\"datepick_in\"]");
		sendKeys(datepickin, " 31/10/2021");
		WebElement datepickout = findLocatorByxpath("//*[@id=\"datepick_out\"]");
		sendKeys(datepickout, " 02/11/2021");
		WebElement adultroom = findLocatorByxpath("//*[@id=\"adult_room\"]");
		selectbyindex(adultroom, 2);
		WebElement childroom = findLocatorByxpath("//*[@id=\"child_room\"]");
		selectbyindex(childroom, 1);
		WebElement search = findLocatorByxpath("//*[@id=\"Submit\"]");
		click(search);
		WebElement radiobutton = findLocatorByxpath("//*[@id=\"radiobutton_0\"]");
		click(radiobutton);
		WebElement cont = findLocatorByxpath("//*[@id=\"continue\"]");
		click(cont);
		WebElement name = findLocatorByxpath("//*[@id=\"first_name\"]");
		sendKeys(name, "Venkatesh");
		WebElement lastname = findLocatorByxpath("//*[@id=\"last_name\"]");
		sendKeys(lastname, "Murugesan");
		WebElement add = findLocatorByxpath("//*[@id=\"address\"]");
		sendKeys(add, "thoraipakkam");
		WebElement card = findLocatorByxpath("//*[@id=\"cc_num\"]");
		sendKeys(card, "1234123412341234");
		WebElement cctype = findLocatorByxpath("//*[@id=\"cc_type\"]");
		selectbyindex(cctype, 2);
		WebElement mnth = findLocatorByxpath("//*[@id=\"cc_exp_month\"]");
		selectbyindex(mnth, 1);
		WebElement yr = findLocatorByxpath("//*[@id=\"cc_exp_year\"]");
		selectbyVisibleText(yr, "2021");
		WebElement cvv = findLocatorByxpath("//*[@id=\"cc_cvv\"]");
		sendKeys(cvv, "121");
		WebElement booknow = findLocatorByxpath("//*[@id=\"book_now\"]");
		click(booknow);
		Thread.sleep(18000);
		WebElement order = findLocatorByid("order_no");
		String getattribute = getattribute(order, "value");
		System.out.println(getattribute);
	}

	@AfterMethod
	private void aftermethod() {
		Date Date = new Date();
		System.out.println(Date);
	}
	@AfterClass
     private void closeall() {
		quit();

	}
}
