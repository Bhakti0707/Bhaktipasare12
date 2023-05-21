package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create file
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		//to make file to ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		//to get sheet
		Sheet sheet = wb.getSheet("IPL");
		
		//create row
		Row row = sheet.getRow(1);
		
		//create cell
		Cell cell = row.createCell(2);
		
		//set the value in cell
		cell.setCellValue("bhakti");
		
		//pass the value in sheet we need to create object FileOutPutStream
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		
		//write the data
		wb.write(fos);
	}

}
