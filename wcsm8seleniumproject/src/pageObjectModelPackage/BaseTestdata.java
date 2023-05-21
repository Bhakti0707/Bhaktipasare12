package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestdata extends Flib{
	
	static WebDriver driver;
	
   public void setUp() throws IOException
   {
	   Flib flib = new Flib();
	   String browservalue = flib.readyPropertyData(".data/config.properties","browser");
	   String url = flib.readyPropertyData("./data/config.properties","url");
	   
	   if( browservalue.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(url);
	   }
	   
	   else if(browservalue.equalsIgnoreCase("Firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(url);
	   }
	   
	   else if(browservalue.equalsIgnoreCase("Edge"))
	   {
		   System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		   driver=new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(url);
	   }
	   else
	   {
		   System.out.println("invalid browser value!!");
	   }
	   
	  }
   public void closeBrowser()
   {
	   driver.quit();
   }
}
