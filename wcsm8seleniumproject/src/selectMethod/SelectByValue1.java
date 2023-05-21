package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		
		//selectsingle option for multi select dropdown
		
		sel.selectByValue("v8");
		
		////select multiple option from multi select dropdown
		
		for(int i=0; i<=8; i++)
		{
	        sel.selectByVisibleText("i");
	        Thread.sleep(2000);
	    } 
		

	}

}
