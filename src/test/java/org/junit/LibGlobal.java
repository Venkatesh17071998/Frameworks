package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	static WebDriver driver;

	public static  void getBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static  void getUrl(String url) {
		driver.get(url);

	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public WebElement findLocatorByid(String id) {
		return driver.findElement(By.id(id));

	}

	public WebElement findLocatorByname(String id) {
		return driver.findElement(By.name(id));

	}

	public static WebElement findLocatorByxpath(String data) {
		return driver.findElement(By.xpath(data));

	}

	public void sendKeys(WebElement Element, String name) {
		Element.sendKeys(name);

	}

	public void click(WebElement Element) {
		Element.click();

	}

	public void thread(int msec) throws InterruptedException {
		Thread.sleep(msec);

	}

	public String getattribute(WebElement Element,String value) {
	   String attribute = Element.getAttribute("value");
		return attribute;

	}
	public void selectbyindex(WebElement Element, int i) {
		Select Select = new Select(Element);
		Select.selectByIndex(i);

	}

	public void selectbyvalue(WebElement Element, String name) {
		Select Select = new Select(Element);
		Select.selectByValue(name);

	}

	public void keypressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);

	}

	public void keyreleaseEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public List<WebElement> getOptions(WebElement Element) {
		Select select = new Select(Element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public String gettext(WebElement Element) {
		String text = Element.getText();
		return text;
	}

	public void selectbyVisibleText(WebElement Element, String data) {
		Select select = new Select(Element);
		select.selectByVisibleText(data);
	}

	public String getdata(int rows, int cellnum, String sheetname) throws IOException {
		String data=null;
		File file = new File("C:\\Users\\SAM\\eclipse-workspace\\Frames\\excel\\Book1.1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet Sheet = book.getSheet(sheetname);
		Row row = Sheet.getRow(rows);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		if(cellType==1) {
			data = cell.getStringCellValue();
		}
		if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat date	 =new SimpleDateFormat("dd/mm/yyyy");
				data = date.format(dateCellValue);
			}else {
			double d=cell.getNumericCellValue();
			long l= (long)d;
			data=String.valueOf(l);
			
					}
		}
		return data;
	

	}
	public void setdata(String sheetname ,int rows, int cellnum,String data) throws IOException {
		File file = new File("C:\\Users\\SAM\\eclipse-workspace\\Frames\\excel\\Book1.1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet Sheet = book.getSheet(sheetname);
		Row createRow = Sheet.getRow(rows);
		Cell createCell = createRow.createCell(cellnum);
		createCell.setCellValue(data);
		FileOutputStream st = new FileOutputStream(file);
		book.write(st);
	
	}
	public static  void quit() {
		driver.quit();

	}
	
		
	
}






























