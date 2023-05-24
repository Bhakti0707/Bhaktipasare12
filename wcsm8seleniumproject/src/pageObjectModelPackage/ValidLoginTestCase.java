package pageObjectModelPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTestdata {
	
     public static void main(String[] args) throws IOException, InterruptedException {
    	 
    	 BaseTestdata bt = new BaseTestdata();
    	 bt.setUp();
    	 
    	 LoginPage lp = new LoginPage(driver);
    	 HomePage hp = new HomePage(driver);
    	 Flib flib = new Flib();
    	 
    	 lp.validLogin(flib.readyPropertyData(PROPERTY_PATH,"username"),flib.readyPropertyData(PROPERTY_PATH,"password"));
    	 Thread.sleep(2000);
    	 hp.logoutMethod();
    	 Thread.sleep(2000);
    	 bt.tearDown();
    	 
    	 
	  
       
	   
		
	}
}
