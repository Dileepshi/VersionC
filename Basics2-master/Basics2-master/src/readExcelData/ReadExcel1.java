package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception  {
		
		
	File src = new File("C:\\ExcelData\\Data.xlsx");
	FileInputStream Fil = new  FileInputStream(src);
	XSSFWorkbook Wb = new XSSFWorkbook(Fil);//// this is for XLSX
	XSSFSheet sheet1= Wb.getSheetAt(0);
	int Row_count = sheet1.getLastRowNum();
	System.out.println("Total Rows are " + Row_count);
	
	for (int i=0;i<Row_count;i++)
	{
		String Row_value = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Data from Row " + i  +  Row_value);
		}
	Wb.close();
	

	}

}
