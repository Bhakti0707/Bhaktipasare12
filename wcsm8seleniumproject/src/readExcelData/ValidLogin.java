package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://127.0.0.1/login.do;jsessionid=3226nq194ale2");
	
	//read the valid user name from the ActiTimeTestData excel sheet
	  FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = wb.getSheet("validcreds");
	   Row row = sheet.getRow(1);
	   Cell cell = row.getCell(0);
	   
	   String validusername = cell.getStringCellValue();
	   
	   //read the valid password from the ActiTimeTestData
	    FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
	    Workbook wb2 = WorkbookFactory.create(fis2);
	    Sheet sheet2 = wb2.getSheet("validcreds");
	    Row row2 = sheet2.getRow(1);
	    Cell cell2 = row2.getCell(1);
	    String validpassword = cell2.getStringCellValue();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(validusername);
	    Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys(validpassword);
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    driver.quit();
	   
	   

	}

}

