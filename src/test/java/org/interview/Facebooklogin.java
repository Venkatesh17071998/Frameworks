package org.interview;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
	//Enumeration
	public static void main(String[] args) {
		List<Integer> v= new ArrayList<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		ListIterator<Integer> d = v.listIterator();
		while(d.hasPrevious()) {
			Integer f =(Integer) d.previous();
			System.out.println(f);
	        //if(f == 40) {
	    		//d.remove();
	       // }
		}
	}
	
}
	

	
	
	
	
	
	
	
	
	
	//to find the webpage link
	/*public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		//Fetch alllink and store in list
		List<WebElement> findElements = d.findElements(By.tagName("a"));
		//num of val in list
		int size = findElements.size();
		System.out.println(size);
		
		for (WebElement c:findElements) {
			String attribute = c.getAttribute("href");
			System.out.println(attribute);
			if (!(attribute==null)) {
				URL u =new URL(attribute);
				URLConnection connection = u.openConnection();
				HttpsURLConnection hp=(HttpsURLConnection) connection;
				int i = hp.getResponseCode();
				if(i>=400) {
					System.out.println(attribute);
				}
				
				
			}
		}
	}*/


