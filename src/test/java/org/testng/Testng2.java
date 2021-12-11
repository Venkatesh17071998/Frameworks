package org.testng;

import java.util.Date;
import org.testng.annotations.Test;
import org.base.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Testng2 extends LibGlobal  {
	@Test
	private void middle() {
System.out.println("middle");
	}
}		