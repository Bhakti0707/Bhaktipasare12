package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorUpperCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions	co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("sarika");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class^='_acan _acap']")).click();
	  

	}

}
