package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class TestData {

	public static Object[][] testData() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91936\\eclipse-workspace\\TestNextGen\\Excel\\DataProvider.xlsx");
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet1");
		
		Object[][] data = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				data[i][j]= cell.getStringCellValue();
			}
		}
	        return data;
	}
	
	
	
	
	
	
	
	
	
	
//public static Object[][] SignInWithEmail() throws IOException {
//		
//		Object[][] data = new Object[readValueFromExcel("SignInE").getPhysicalNumberOfRows()-1][readValueFromExcel("SignInE").getRow(0).getPhysicalNumberOfCells()];
//		for (int i = 1; i < readValueFromExcel("SignInE").getPhysicalNumberOfRows(); i++) {	
//			XSSFRow row = readValueFromExcel("SignInE").getRow(i);
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				XSSFCell cell = row.getCell(j);
//				data[i-1][j] = cell.toString();
//			} }
//
//		return data;

}
