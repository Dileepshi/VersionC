package readExcelData;

import Library.ExcelDataConfig;

public class ReadExceData {

	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("C:\\ExcelData\\Data.xlsx");
		System.out.println(excel.getdata(0, 1, 1));
		

	}

}
