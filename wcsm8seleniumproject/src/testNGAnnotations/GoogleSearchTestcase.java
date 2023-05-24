package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestcase extends BaseTest{
  @Test
  public void search1() {
	  
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
  }
  
  @Test
  public void search2()
  {
	  driver.switchTo().activeElement().sendKeys("Sql",Keys.ENTER);
  }
  
  @Test
  public void search3()
  {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
