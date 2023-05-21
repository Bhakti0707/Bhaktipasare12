package automationtask;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotstarLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions	co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
WebDriver	driver=new ChromeDriver(co);
   driver.manage().window().maximize();
   Thread.sleep(2000);
  driver.get("https://www.hotstar.com/");
  
  driver.findElement(By.xpath("//span[@class=' text-transparent LOGO_LABEL_TYPOGRAPHY ']")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//span[text()='Login']")).click();
  Thread.sleep(2000);
  
   driver.findElement(By.xpath("//input[contains(@title,'Phone number')]")).sendKeys("9876543210");
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//span[text()='Get OTP']")).click();
   Thread.sleep(2000);
   
  
  
  
	}

}
