package DynamicScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.google.common.io.Files;

public class BaseTest {
	
	static WebDriver driver;
  @BeforeTest
  public void property() {
	  System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
          }

  
  @BeforeMethod
  public void setUP()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://127.0.0.1/login.do;jsessionid=9b667got0fak4");
  }
  
  public void failedMethod(String failedMethod) throws IOException
  {
	  try 
	    {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./ScreenShot/"+failedMethod+".png");
	  Files.copy(src, dest);
	    
   }
	  
	  catch(Exception e)
	     {
		  
		  }
	  }
  
    @AfterMethod
    public void tearDown() throws InterruptedException
    {
    	Thread.sleep(2000);
    	driver.quit();
    }
  
}
