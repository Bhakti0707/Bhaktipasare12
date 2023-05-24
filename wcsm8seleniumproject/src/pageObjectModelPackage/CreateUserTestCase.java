package pageObjectModelPackage;

import java.io.IOException;

public class CreateUserTestCase extends BaseTestdata{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTestdata bt = new BaseTestdata();
		bt.setUp();

		Flib flib = new Flib();

		LoginPage lp = new LoginPage(driver);

		lp.validLogin(flib.readyPropertyData(PROPERTY_PATH, "username"),flib.readyPropertyData(PROPERTY_PATH, "password"));
          
		Thread.sleep(1000);
		
		HomePage hp = new HomePage(driver);
		hp.userModuleMethod();
		
		Thread.sleep(2000);
		UserListPage ulp = new UserListPage(driver);
	     
		String usn = flib.readExcelData(EXCEL_PATH,"createusers",1, 0);
		String pass = flib.readExcelData(EXCEL_PATH,"createusers",1, 1);
		String Fn = flib.readExcelData(EXCEL_PATH,"createusers",1, 2);
		String Ln = flib.readExcelData(EXCEL_PATH,"createusers",1,3);
		
		Thread.sleep(2000);
		ulp.createUserMethod(usn, pass, Fn, Ln);
		Thread.sleep(2000);
		ulp.deleteUserMethod();
	}
		
}
