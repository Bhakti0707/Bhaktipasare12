package testNGFlags;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags5 {
	
  @Test(description = "Login Testcase")
  public void loginMethod() {
	  
	  Reporter.log("login performed",true);
	  
  }
  @Test(description = "create user testcase",dependsOnMethods = "loginMethod")
  public void createUser() {
	  Assert.fail();
	  Reporter.log("user created",true);
	  
  }
  
  @Test(description = "Logout Testcase",dependsOnMethods = "createUser",alwaysRun = true)
  public void logOutMethod() {
	  Reporter.log("logout performed",true);
	  
  }
  
}
