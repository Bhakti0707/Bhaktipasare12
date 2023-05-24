package pageObjectModelPackage;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTestdata{
	
	public static void main(String [] args) throws InterruptedException, IOException  {
	
	BaseTestdata bt = new BaseTestdata();
	bt.setUp();
	
	Flib flib = new Flib();
	
	Thread.sleep(2000);
	LoginPage lp = new LoginPage(driver);
	
	
	
	int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
	for(int i=1;i<=rc;i++)
	{
	String invalidUsername = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 0);
	String invalidPassword = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 1);
	lp.invalidLogin(invalidUsername,invalidPassword);
	}
	bt.tearDown();
	}
}
