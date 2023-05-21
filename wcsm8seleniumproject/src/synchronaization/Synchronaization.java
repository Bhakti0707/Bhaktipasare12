package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Synchronaization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin123456");
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	

	}

}
