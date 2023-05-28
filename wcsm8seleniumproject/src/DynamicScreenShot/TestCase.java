package DynamicScreenShot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {
  @Test
  public void login() {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Assert.fail();
	  driver.findElement(By.id("loginButton")).click();
  }
}
