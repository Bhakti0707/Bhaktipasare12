package Assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
	  WebElement dropdown = driver.findElement(By.name("menu"));
	  Select sel = new Select(dropdown);
	  
	  //to get all the optins from dropdown
	   List<WebElement> alloptions = sel.getOptions();
	   
	   //to get the all options by using click method
	   for(WebElement op:alloptions)
	   {
		   if(op.getText().equals("chakali"))
		   {
			   
			   op.click();
			   break;
		   }
	   }
	  

	}

}
