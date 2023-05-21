package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/single%20select%20static%20dropdown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		
		//select single option from multi select dropdown
		sel.selectByIndex(8);
		
		//select multiple option from multi select dropdown
		
		for(int i=0; i<=8; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		

	}

}
