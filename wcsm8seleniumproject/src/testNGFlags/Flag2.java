package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//Method or Annotation is Enabled or disabled
  @Test(description = "Login Method")
  public void method1() {
	  
	  Reporter.log("login Performed",true);
  }
  
  @Test(enabled = false,description = "LogOut Method")
  public void method2()
  {
	  Reporter.log("logOut Perform",true);
  }
}
