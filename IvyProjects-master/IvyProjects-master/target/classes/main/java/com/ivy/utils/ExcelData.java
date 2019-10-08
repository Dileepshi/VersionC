package com.ivy.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.ivy.baseclass.Baseclass;

public class ExcelData extends Baseclass {

	FileInputStream fil;
	XSSFWorkbook wb;
	XSSFSheet sh;

	@DataProvider(name="locationdata")
	public String[][] getdata() throws IOException {

		try {
			fil = new FileInputStream(locationdata_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		wb = new XSSFWorkbook(fil);
		sh = wb.getSheet(locationSheetname);

		String[][] data = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];

		for (int i = 0; i < sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {

				data[i][j] = sh.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}

}
