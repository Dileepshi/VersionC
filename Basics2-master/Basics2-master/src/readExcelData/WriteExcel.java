package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\ExcelData\\Data.xlsx");
		FileInputStream Fil = new FileInputStream(src);
		XSSFWorkbook Wb = new XSSFWorkbook(Fil);//// this is for XLSX
		// HSSFWorkbook Wb = new HSSFWorkbook(Fil); /// this is used for XLS
		XSSFSheet sheet1 = Wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream outfile = new FileOutputStream(src);
		Wb.write(outfile);
		Wb.close();
	}

}
