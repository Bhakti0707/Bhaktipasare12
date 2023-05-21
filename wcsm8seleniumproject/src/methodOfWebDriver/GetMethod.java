package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// to avoid illegalstate exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//to avoid connectionfieldexception
	       ChromeOptions	co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	
	//to launch chromebrowser
		WebDriver	driver=new ChromeDriver(co);
		
        driver.manage().window().maximize();
  
          //to launch webpage
              driver.get("http://omayo.blogspot.com/");

            Thread.sleep(2000);

		

	}

}
