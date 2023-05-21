package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase  extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		//launch the browser using generic reusable method
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//read the multiple data using generic reusable method
		 Flib flib = new Flib();
		 int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","invalidcreds");
		 
		 for(int i=1; i<rc; i++)
		 {
			 //read the excel data in DataDriven FrameWork using generic reusable method
			 String InvalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i, 0);
			 String InvalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 1);
			 
		  driver.findElement(By.name("username")).sendKeys(InvalidUsername);
		  driver.findElement(By.name("pwd")).sendKeys(InvalidPassword);
		  driver.findElement(By.id("loginButton")).click();
		  driver.findElement(By.name("username")).clear();
		 }
		 
		 
	}

}
