package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\ExcelData\\Data.xlsx");
		FileInputStream Fil = new FileInputStream(src);
		XSSFWorkbook Wb = new XSSFWorkbook(Fil);//// this is for XLSX
		// HSSFWorkbook Wb = new HSSFWorkbook(Fil); /// this is used for XLS
		XSSFSheet sheet1 = Wb.getSheetAt(0);
		String Data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data in the sheet " + Data0);
		Wb.close();

	}

}
