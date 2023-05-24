package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  System.out.println("hii TestNG!!");
	  Reporter.log("hi TestNG",true);
	  }
  
    @Test
   public void g()
 {
	  System.out.println("Hey Java");
	  Reporter.log("Hii Java",true);
 }
}
