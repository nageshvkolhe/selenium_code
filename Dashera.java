package com.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dashera {
	public static  void main(String args[]) throws IOException, InterruptedException {
		
		File src=new File("./ExcelFile/D1.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum();
		for(int i=1;i<=rowCount;i++ ) {
			System.out.println(sh1.getRow(i).getCell(0).getStringCellValue());
		}
	}
}
