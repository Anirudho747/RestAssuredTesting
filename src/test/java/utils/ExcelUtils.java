package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {
	
	static XSSFWorkbook wb; 
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName) throws IOException {
		
		wb = new XSSFWorkbook(excelPath);
		sheet = wb.getSheet(sheetName);
	}
	

	public void getRowCount()
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
	}
	
	public void getCellData(int rownum,int colnum) throws IOException
	{
		
		DataFormatter formatter = new DataFormatter();
		
		Object obj = formatter.formatCellValue(sheet.getRow(rownum).getCell(colnum));
		
		System.out.println(obj);
		
	}

}
