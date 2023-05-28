package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	// to describe the method
  @Test(description = "This method perform Login")
  public void method1() {
	  
	  Reporter.log("method1 Login",true);
  }
}
