package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//generalize the row count
				FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
				  
				Workbook wb2 = WorkbookFactory.create(fis2);
				Sheet sheet2 = wb2.getSheet("IPL");
				
				int rc = sheet2.getLastRowNum();
				
				
				
		
		//read multiple data by using for loop
		for(int i=1; i<=rc; i++)
		{
			
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//
		
		//make the file ready for read
		Workbook wb = WorkbookFactory.create(fis);
		
		//get into sheet
		Sheet sheet = wb.getSheet("IPL");
		
		//get into desired row
		Row row = sheet.getRow(i);
		
		//get into desired cell/col
		Cell cell = row.getCell(0);
		
		//get the value for cell/col
		String data = cell.getStringCellValue();
		Thread.sleep(2000);
		System.out.println(data);
		
		}
		
		
		
		
        
	}

}
