
package org.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ExcelAdactin {
	public static void main(String[] args) throws IOException, InterruptedException {
	LibGlobal global1=new LibGlobal();
	global1.getBrowser();
	global1.getUrl("https://adactinhotelapp.com/");
    global1.maximize();
    WebElement username = global1.findLocatorByxpath("//*[@id=\"username\"]");
    global1.sendKeys(username, "Abcdefghi123");
    WebElement password = global1.findLocatorByxpath("//*[@id=\"password\"]");
    global1.sendKeys(password, "Abcd@1234");
    WebElement login = global1.findLocatorByxpath("//*[@id=\"login\"]");
    global1.click(login);
    
    String data = global1.getdata(3,0, "Adactin");
    WebElement location = global1.findLocatorByxpath("//*[@id=\"location\"]");
    global1.selectbyVisibleText(location, data);
    
    String data1 = global1.getdata(1, 1,"Adactin" );
    WebElement hotels = global1.findLocatorByxpath("//*[@id=\"hotels\"]");
    global1.selectbyVisibleText(hotels, data1);
    
    String data2 = global1.getdata(1, 2,"Adactin" );
    WebElement roomtype = global1.findLocatorByxpath("//*[@id=\"room_type\"]");
    global1.selectbyVisibleText(roomtype, data2);
    
    String data3 = global1.getdata(2, 3,"Adactin" );
    WebElement roomnos = global1.findLocatorByxpath("//*[@id=\"room_nos\"]");
    global1.selectbyVisibleText(roomnos, data3);
	
    String data4 = global1.getdata(1, 4,"Adactin" );
    WebElement datepickin = global1.findLocatorByxpath("//*[@id=\"datepick_in\"]");
    global1.sendKeys(datepickin, data4);
    
    
    String data5 = global1.getdata(1, 5,"Adactin" );
    WebElement datepickout = global1.findLocatorByxpath("//*[@id=\"datepick_out\"]");
    global1.sendKeys(datepickout, data5);
    
    
    String data6 = global1.getdata(2, 6,"Adactin" );
    WebElement adultroom = global1.findLocatorByxpath("//*[@id=\"adult_room\"]");
    global1.selectbyVisibleText(adultroom, data6);
    
    
    
    String data7 = global1.getdata(2, 7,"Adactin" );
    WebElement childroom = global1.findLocatorByxpath("//*[@id=\"child_room\"]");
    global1.selectbyVisibleText(childroom, data7);
    
    WebElement search = global1.findLocatorByxpath("//*[@id=\"Submit\"]");
    global1.click(search);
    
    WebElement radiobutton  = global1.findLocatorByxpath("//*[@id=\"radiobutton_0\"]");
    global1.click(radiobutton);
    
    WebElement cont = global1.findLocatorByxpath("//*[@id=\"continue\"]");
    global1.click(cont);
    
    
    String data8 = global1.getdata(1, 8,"Adactin" );
    WebElement name = global1.findLocatorByxpath("//*[@id=\"first_name\"]");
    global1.sendKeys(name, data8);
    
    
    String data9 = global1.getdata(1, 9,"Adactin" );
    WebElement lastname = global1.findLocatorByxpath("//*[@id=\"last_name\"]");
    global1.sendKeys(lastname, data9);
    
    
    String data10 = global1.getdata(1, 10,"Adactin" );
    WebElement add = global1.findLocatorByxpath("//*[@id=\"address\"]");
    global1.sendKeys(add, data10);
    
    String data11 = global1.getdata(1, 11,"Adactin" );
    WebElement card = global1.findLocatorByxpath("//*[@id=\"cc_num\"]");
    global1.sendKeys(card, data11);
    
    String data12 = global1.getdata(1, 12,"Adactin" );
    WebElement cctype = global1.findLocatorByxpath("//*[@id=\"cc_type\"]");
    global1.selectbyVisibleText(cctype, data12);
    
    String data13 = global1.getdata(1, 13,"Adactin" );
    WebElement mnth = global1.findLocatorByxpath("//*[@id=\"cc_exp_month\"]");
    global1.selectbyVisibleText(mnth, data13);
    
    
    String data14 = global1.getdata(11, 14,"Adactin" );
    WebElement yr = global1.findLocatorByxpath("//*[@id=\"cc_exp_year\"]");
    global1.selectbyVisibleText(yr, data14);
    
    String data15 = global1.getdata(1, 15,"Adactin" );
    WebElement cvv = global1.findLocatorByxpath("//*[@id=\"cc_cvv\"]");
    global1.sendKeys(cvv, data15);
    
    WebElement booknow = global1.findLocatorByxpath("//*[@id=\"book_now\"]");
    global1.click(booknow);
    global1.thread(15000);
    WebElement order = global1.findLocatorByid("order_no");
    String getattribute = global1.getattribute(order, "value");
    System.out.println(getattribute);
    global1.setdata("Adactin", 0, 17, "ordernum");
    global1.setdata("Adactin", 1, 17,getattribute);
    System.out.println("Done#######################");
   
    
    
    
    
   
    
	}
}
