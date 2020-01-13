package Library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook Wb;
	XSSFSheet sheet;

	public ExcelDataConfig(String Excel_path) {
		try {
			File src = new File(Excel_path);
			FileInputStream Fil = new FileInputStream(src);
			Wb = new XSSFWorkbook(Fil);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getdata(int sheetnumber, int row, int column) {

		sheet = Wb.getSheetAt(sheetnumber);
		String Data = sheet.getRow(row).getCell(column).getStringCellValue();
		return Data;
	}

	public int getrowcount(int sheetnumber1) {

		int rowcount = Wb.getSheetAt(sheetnumber1).getLastRowNum();
		return rowcount;

	}

	public int getcolumnncount(int sheetnumber1) {

		int column = Wb.getSheetAt(sheetnumber1).getRow(0).getLastCellNum();

		return column;

	}
}
