package deselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		 Select sel = new Select(dropdown);
		 
		//select single option from multi deselect dropdown
		 sel.selectByValue("v5");
		 Thread.sleep(2000);
		 sel.selectByValue("v3");
		 
		////select multiple option from multi deselect dropdown
			
			Thread.sleep(2000);
			sel.deselectByValue("v5");
			Thread.sleep(2000);
			sel.deselectByValue("v3");
			
		       
		        
		 
		 

	}

}
