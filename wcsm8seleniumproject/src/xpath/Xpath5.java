package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath5 {
    // xpath by using Axes
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions	co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	 driver.manage().window().maximize();
	 
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
	Thread.sleep(2000);
	
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i5')]")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Brand')]")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='HP']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='Operating System']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='Processor Generation']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='11th Gen']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='SSD Capacity']")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//div[text()='256 GB']")).click();
   Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Show  more']")).click();
    
 
   
	}

}

