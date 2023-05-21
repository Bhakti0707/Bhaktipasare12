package deselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMultipleByIndexDropdown {
  //using multi select option for multiple drop down
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
	
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdown);
	
	//using multiple option delect form multiple dropdown
	  sel.deselectByIndex(5);
	
	
	for(int i=0; i<=5; i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(2000);
		sel.deselectByIndex(i);
		Thread.sleep(2000);
	}

	}

}
