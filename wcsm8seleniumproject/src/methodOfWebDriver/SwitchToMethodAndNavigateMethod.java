package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethodAndNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(2000);
	
	driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	
	//use back operation
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.switchTo().activeElement().sendKeys("automation testing",Keys.ENTER);
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	

	}

}
