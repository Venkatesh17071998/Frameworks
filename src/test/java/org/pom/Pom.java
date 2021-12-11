package org.pom;

import org.openqa.selenium.WebElement;

public class Pom extends LibGlobaltestng{
	public static void main(String[] args) {
		
		getBrowser();
		getUrl("https://www.facebook.com/");
		PojoClass p=new PojoClass();
		WebElement a = p.getUsername();
		a.sendKeys("raam");
		driver.navigate().refresh();
		a.sendKeys("raam");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
