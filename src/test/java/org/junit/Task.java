package org.junit;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task extends LibGlobal {
	static WebDriver driver;

	@BeforeClass
	public static void Beforeclass() {
		getBrowser();
		getUrl("https://adactinhotelapp.com/");
	}

	@AfterClass
	public static void AfterClass() {
		quit();
	}

	@Before
	public void Before() {
		Date Date = new Date();
		System.out.println(Date);

	}

	@After
	public void after() {
		Date Date = new Date();
		System.out.println(Date);

	}

	@Test
	public void Test() throws IOException, InterruptedException {
		WebElement username = findLocatorByxpath("//*[@id=\"username\"]");
		sendKeys(username, "Abcdefghi123");
		WebElement pass = findLocatorByxpath("//*[@id=\"password\"]");
		sendKeys(pass, "Abcd@1234");
		WebElement click = findLocatorByxpath("//*[@id=\"login\"]");
		click(click);
		String data = getdata(3, 0, "Adactin");
		WebElement location = findLocatorByxpath("//*[@id=\"location\"]");
		selectbyVisibleText(location, data);

		String data1 = getdata(1, 1, "Adactin");
		WebElement hotels = findLocatorByxpath("//*[@id=\"hotels\"]");
		selectbyVisibleText(hotels, data1);

		String data2 = getdata(1, 2, "Adactin");
		WebElement roomtype = findLocatorByxpath("//*[@id=\"room_type\"]");
		selectbyVisibleText(roomtype, data2);

		String data3 = getdata(2, 3, "Adactin");
		WebElement roomnos = findLocatorByxpath("//*[@id=\"room_nos\"]");
		selectbyVisibleText(roomnos, data3);

		String data4 = getdata(1, 4, "Adactin");
		WebElement datepickin = findLocatorByxpath("//*[@id=\"datepick_in\"]");
		sendKeys(datepickin, data4);

		String data5 = getdata(1, 5, "Adactin");
		WebElement datepickout = findLocatorByxpath("//*[@id=\"datepick_out\"]");
		sendKeys(datepickout, data5);

		String data6 = getdata(2, 6, "Adactin");
		WebElement adultroom = findLocatorByxpath("//*[@id=\"adult_room\"]");
		selectbyVisibleText(adultroom, data6);

		String data7 = getdata(2, 7, "Adactin");
		WebElement childroom = findLocatorByxpath("//*[@id=\"child_room\"]");
		selectbyVisibleText(childroom, data7);

		WebElement search = findLocatorByxpath("//*[@id=\"Submit\"]");
		click(search);

		WebElement radiobutton = findLocatorByxpath("//*[@id=\"radiobutton_0\"]");
		click(radiobutton);

		WebElement cont = findLocatorByxpath("//*[@id=\"continue\"]");
		click(cont);

		String data8 = getdata(1, 8, "Adactin");
		WebElement name = findLocatorByxpath("//*[@id=\"first_name\"]");
		sendKeys(name, data8);

		String data9 = getdata(1, 9, "Adactin");
		WebElement lastname = findLocatorByxpath("//*[@id=\"last_name\"]");
		sendKeys(lastname, data9);

		String data10 = getdata(1, 10, "Adactin");
		WebElement add = findLocatorByxpath("//*[@id=\"address\"]");
		sendKeys(add, data10);

		String data11 = getdata(1, 11, "Adactin");
		WebElement card = findLocatorByxpath("//*[@id=\"cc_num\"]");
		sendKeys(card, data11);

		String data12 = getdata(1, 12, "Adactin");
		WebElement cctype = findLocatorByxpath("//*[@id=\"cc_type\"]");
		selectbyVisibleText(cctype, data12);

		String data13 = getdata(1, 13, "Adactin");
		WebElement mnth = findLocatorByxpath("//*[@id=\"cc_exp_month\"]");
		selectbyVisibleText(mnth, data13);

		String data14 = getdata(11, 14, "Adactin");
		WebElement yr = findLocatorByxpath("//*[@id=\"cc_exp_year\"]");
		selectbyVisibleText(yr, data14);

		String data15 = getdata(1, 15, "Adactin");
		WebElement cvv = findLocatorByxpath("//*[@id=\"cc_cvv\"]");
		sendKeys(cvv, data15);

		WebElement booknow = findLocatorByxpath("//*[@id=\"book_now\"]");
		click(booknow);
		thread(15000);
		WebElement order = findLocatorByid("order_no");
		String getattribute = getattribute(order, "value");
		System.out.println(getattribute);
		setdata("Adactin", 0, 17, "ordernum");
		setdata("Adactin", 1, 17, getattribute);
		System.out.println("Done#######################");

	}

}
