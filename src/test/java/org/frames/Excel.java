package org.frames;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	File file =new File("C:\\Users\\SAM\\eclipse-workspace\\Frames\\excel\\EXCEL.xlsx");
	
	FileInputStream a = new FileInputStream(file);
	Workbook b = new XSSFWorkbook(a);
	Sheet c = b.getSheet("Data");
    //to get no of rows
	for(int i=0; i<c.getPhysicalNumberOfRows();i++) {
		Row d = c.getRow(i);

	//to get no of columns
		for(int j=0;j<d.getPhysicalNumberOfCells();j++) {
			Cell e = d.getCell(j);
			//to find the celltype txt=1,number=0
			int f = e.getCellType();
			if(f==1) {
				String g = e.getStringCellValue();
				System.out.println(g);
				if(f==0) {
					double h = e.getNumericCellValue();
					System.out.println(h);
					long l=(long)h;
					System.out.println(l);
					
					String g1 = String.valueOf(l);
					System.out.println(g1);
					
				}
			}
		}
			
		
		}
	
	
}
	
}	



