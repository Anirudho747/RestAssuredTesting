package utils;

import java.io.IOException;

public class ExcelUtilsTest {

	
	
	public static void main(String[] args) throws IOException
	{
		String excelPath = "./Data/TD.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils eu = new ExcelUtils(excelPath,sheetName);
		
		eu.getRowCount();
		
		eu.getCellData(0,0);
		eu.getCellData(0,1);
		eu.getCellData(1, 0);
		eu.getCellData(1, 1);
	} 
}
