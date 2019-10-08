package readExcelData;

import java.io.File;
import jxl.Workbook;

public class Read_J_Excel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\ExcelData\\DatajExcel.xls");
		Workbook wb = Workbook.getWorkbook(src);
		String data00 = wb.getSheet(0).getCell(0, 0).getContents();
		System.out.println("Data is " + data00);
		String data10 = wb.getSheet(0).getCell(1, 0).getContents();
		System.out.println("Data is " + data10);
		// to get no of rows
		int rows = wb.getSheet(0).getRows();
		System.out.println("Rows are " + rows);
		int columns = wb.getSheet(0).getColumns();
		System.out.println("Columns are " + columns);
	}

}
