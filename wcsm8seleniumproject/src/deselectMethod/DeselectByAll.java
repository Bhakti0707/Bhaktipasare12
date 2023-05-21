package deselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByAll {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
		
		//to identify dropdown
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		//to select multiple option
		Select sel = new Select(dropdown);
		for(int i=0; i<7; i++)
		{
			Thread.sleep(3000);
			sel.selectByIndex(i);
		}
		Thread.sleep(3000);
		
		//to deselect all the option
		
		sel.deselectAll();
	}

}
