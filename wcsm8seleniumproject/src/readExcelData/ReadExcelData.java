package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
   // read data from ipl excel 
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for ready
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(8);//get into desired row
		Cell cell = row.getCell(1);//get into desired col/cell
		String data = cell.getStringCellValue();//read the value from cell
		System.out.println(data);
		
		
				
		
	}
}
