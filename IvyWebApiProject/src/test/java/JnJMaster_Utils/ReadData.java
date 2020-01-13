package JnJMaster_Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ReadData {
	
	
	@DataProvider(name="ExcelData")
	public String[][] read() throws Exception {
		
		File file= new File("D:\\Automation\\Excel\\SalesReturn_API.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("sheet1");
		
		int a =sh.getLastRowNum();
		int b = sh.getRow(0).getLastCellNum();
		
		
		String[][] data= new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		
		for (int i=1;i <= sh.getLastRowNum();i++) {
			for (int j=0;j < sh.getRow(i).getLastCellNum();j++) {
			
				
				data[i-1][j] = sh.getRow(i).getCell(j).toString();
			}
			
		}	
		return data;
			
	}
	

}
