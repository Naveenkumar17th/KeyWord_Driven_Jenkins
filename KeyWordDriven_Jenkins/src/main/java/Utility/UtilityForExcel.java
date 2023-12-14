package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityForExcel {
	FileInputStream fs;
	XSSFWorkbook workbook;
	XSSFSheet sheet1;
	public static int NumberOfRows;
	public static String loname;
	public static String lovalue;
	public static String actkeyword;
	public static String tedata;
	
	public void excelReading(String path) throws IOException {
		fs = new FileInputStream(path);
		
		workbook = new XSSFWorkbook(fs);
		
		sheet1 = workbook.getSheetAt(0);
		
		NumberOfRows = sheet1.getPhysicalNumberOfRows();
		
		}
	
	public void getValuesFromExcel(int row, int locatorname, int locatorvalue, int keyword, int testdata) {
		
        loname = sheet1.getRow(row).getCell(locatorname).toString().trim();
        
        lovalue = sheet1.getRow(row).getCell(locatorvalue).toString().trim(); 
        actkeyword = sheet1.getRow(row).getCell(keyword).toString().trim();
        XSSFCell cell = sheet1.getRow(row).getCell(testdata);
        
        tedata=  cell.toString();
        
        
		

	}



}
