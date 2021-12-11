package org.frames;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel2 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select b=new Select(a);
		List<WebElement> c = b.getOptions();
		int size = c.size();
		System.out.println(size);
		
			File f= new File("C:\\Users\\SAM\\eclipse-workspace\\Frames\\excel\\EXCEL.xlsx");
			Workbook g =new XSSFWorkbook();
			
			Sheet h=g.createSheet("SKILLS");
			for(int i=0;i<c.size();i++) {
				WebElement d = c.get(i);
				String e = d.getText();
			Row k = h.createRow(i);
			
			Cell l = k.createCell(0);
			l.setCellValue(e);
			}
			FileOutputStream m= new FileOutputStream(f);
			g.write(m);
			System.out.println("Done");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
	File a= new File("C:\\Users\\SAM\\eclipse-workspace\\Frames\\excel\\TASKONE.xlsx");
	FileInputStream b= new FileInputStream(a);
	Workbook c =new XSSFWorkbook(b);
	Sheet d=c.getSheet("SKILLS");
	
	Row e = d.getRow(1);
	Cell f = e.getCell(0);
	
	String g = f.getStringCellValue();
	
	if(g.equals("RAGHU")) {
		f.setCellValue("VENKAT");
	}
	FileOutputStream h= new FileOutputStream(a);
	c.write(h);
	System.out.println("Done.......");*/
			
	}

}
