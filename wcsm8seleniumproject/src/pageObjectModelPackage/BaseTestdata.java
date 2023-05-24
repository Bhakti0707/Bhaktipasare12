package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestdata extends Flib implements IAutoConstant1{
	
	static WebDriver driver;
	
   public void setUp() throws IOException //open browser
   {
	   Flib flib = new Flib();
	   String browservalue = flib.readyPropertyData(PROPERTY_PATH,"browser");
	   String url = flib.readyPropertyData("./data/config.properties","url");
	   
	   if( browservalue.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty(CHROME_KEY,CHROME_PATH);
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
   public void tearDown()
   {
	   driver.quit();
   }
}
