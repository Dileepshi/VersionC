package com.crm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ExcelData {

	FileInputStream fil;
	XSSFWorkbook wb;
	XSSFSheet sh;
	String TestData_Sheet_path = "C:\\Users\\dileep.ks\\workspace\\CRM\\src\\main\\java\\com\\crm\\data\\ContactDetails.xlsx";

	@DataProvider(name = "data")
	public  String[][] testdata(String sheetname) throws IOException {

		try {
			fil = new FileInputStream(TestData_Sheet_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		wb = new XSSFWorkbook(fil);

		sh = wb.getSheet(sheetname);
		String[][] data = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sh.getRow(i + 1).getCell(j).toString();
			}

		}
		return data;

	}

}
