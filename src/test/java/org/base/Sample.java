package org.base;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		LibGlobal global=new LibGlobal();
		global.getBrowser();
		global.getUrl("http://demo.automationtesting.in/Register.html");
		global.maximize();
		WebElement frstname = global.findLocatorByxpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
		global.sendKeys(frstname,"Venkatesh");
		WebElement lastname = global.findLocatorByxpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
		global.sendKeys(lastname, "M");
		WebElement add = global.findLocatorByxpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
		global.sendKeys(add,"2/11,senthamil nagar,trchy-621216");
		WebElement email = global.findLocatorByxpath("//*[@id=\"eid\"]/input");
		global.sendKeys(email, "mrvenkatesh@gmail.com");
		WebElement number = global.findLocatorByxpath("//input[@type='tel']");
		global.sendKeys(number, "7402650919");
		WebElement gnd = global.findLocatorByxpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
		global.click(gnd);
		WebElement hobby = global.findLocatorByid("checkbox1");
		global.click(hobby);	
		WebElement skills  = global.findLocatorByxpath("//*[@id=\"Skills\"]");
		global.selectbyindex(skills, 1);
		WebElement india = global.findLocatorByxpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
		global.click(india);
		WebElement india1 = global.findLocatorByxpath("/html/body/span/span/span[1]/input");
		global.sendKeys(india1, "india");
		global.keypressEnter();
		global.keyreleaseEnter();
		WebElement year = global.findLocatorByxpath("//*[@id=\"yearbox\"]");
		global.selectbyvalue(year, "1998");
		WebElement month = global.findLocatorByxpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
		global.selectbyvalue(month, "July");
		WebElement date = global.findLocatorByxpath("//*[@id=\"daybox\"]");
		global.selectbyvalue(date, "17");
		WebElement pass = global.findLocatorByxpath("//*[@id=\"firstpassword\"]");
		global.sendKeys(pass, "12345689");
		WebElement confirmpass = global.findLocatorByxpath("//*[@id=\"secondpassword\"]");
		global.sendKeys(confirmpass, "12345689");
		WebElement submit = global.findLocatorByxpath("//*[@id=\"submitbtn\"]");
		global.click(submit);
		
		
	
		
	}
}
