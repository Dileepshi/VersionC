import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel {

	public ArrayList<String> getdata(String sheetName, String testCaseName) throws IOException {

		ArrayList<String> a = new ArrayList<String>();

		FileInputStream file = new FileInputStream("D:\\Automation\\Learning.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		int sheets = wb.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {

			if (wb.getSheetName(i).equals(sheetName)) {
				HSSFSheet sheet = wb.getSheetAt(i);
				// Test case here is get the data from the first row which is
				// the header
				Iterator<Row> rows = sheet.iterator();// sheet is the collection
														// of rows
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator();// Row is the
																// collection of
																// cells

				int j = 0;
				int col = 0;
				while (cells.hasNext()) {
					String value = cells.next().getStringCellValue();
					if (value.equalsIgnoreCase("Test Cases")) {
						col = j;	
					}
					j++;
				}
				System.out.println(col);

				// Here u have got the column name as Test cases. So iterate
				// through the column names for test case name "Buy"
				while (rows.hasNext()) {
					Row r = rows.next();
					String cellValue = r.getCell(col).getStringCellValue();
					// Here once u get the Buy Test case, get the complete row
					// data
					if (cellValue.equalsIgnoreCase(testCaseName)) {

						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							Cell cc = c.next();
							if (cc.getCellTypeEnum() == CellType.STRING) {
								a.add(cc.getStringCellValue());// here the data
																// is stored in
																// the array
																// list
							} else {
								a.add(NumberToTextConverter.toText(cc.getNumericCellValue()));

							}
						}
					}
				}
			}

		}
		return a;

	}

}
