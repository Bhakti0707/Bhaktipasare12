package keyWordDrivenPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//it is use to  store generic reusable method
	//all the methods are non static
   
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		//read the excel sheet
		FileInputStream fis = new FileInputStream(excelPath);
		
		//make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		//get sheet
		Sheet sheet = wb.getSheet(sheetName);
		
		//get row
		Row row = sheet.getRow(rowCount);
		
		//get cell
		Cell cell = row.getCell(cellCount);
		
		//get value of cell
		String data = cell.getStringCellValue();
		return data;
		
	}
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		//read the excel file
		FileInputStream fis = new FileInputStream(excelPath);
		
		//make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the sheet
		Sheet sheet = wb.getSheet(sheetName);
		
		//get the row
		int rowNum = sheet.getLastRowNum();
		return rowNum;
	}
	
	
	//wright excel data
		public void writeExcelData(String excelpath,String sheetname,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetname);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(excelpath);
			wb.write(fos);

		}
		
	public String readyPropertyData(String propertyPath,String key) throws IOException
	{
		//provide path of the property file
		FileInputStream fis = new FileInputStream(propertyPath);
		
		//read the data from property file
		Properties prop = new Properties();
		
		//make the property file to read
		prop.load(fis);
		
		//read the data
	  String data = prop.getProperty(key);
	  return data;
	  
	}
	
	

}


