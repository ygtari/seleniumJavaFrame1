package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	 
	 static  String projectPath;
	 static  XSSFWorkbook workbook;
	 static  XSSFSheet sheet;
	
	 public   ExcelUtils(String excelPath,String sheetName) throws IOException{
		 
		 workbook= new XSSFWorkbook(excelPath);
		 sheet=workbook.getSheet(sheetName);
		 
	 }
	 
	 public static int getRowCount() throws IOException {
		 
		 int rowCount=sheet.getPhysicalNumberOfRows();
		 System.out.println("No of rows "+rowCount);
		 return rowCount;
		 
	 }

	public static String getCellDataString(int rowNum,int colNum) throws IOException {

		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		return cellData;
		
		
	}
	 
 public static int getColCount() throws IOException {
		 
		 int rowCount=sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println("No of cols "+rowCount);
		 return rowCount;
		 
		 
	 }
	
	
	
	public static void getCellDataNumber(int rowNum,int colNum) throws IOException {
	

	    double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		
	}
	 
}
