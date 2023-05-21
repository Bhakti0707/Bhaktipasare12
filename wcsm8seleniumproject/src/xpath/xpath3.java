package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath3 {

	public static void main(String[] args) throws InterruptedException {
		 //xpath by using contains function
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]")).click();
		

	}

}
