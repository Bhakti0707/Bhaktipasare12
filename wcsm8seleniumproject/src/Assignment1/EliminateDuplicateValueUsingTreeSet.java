package Assignment1;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateValueUsingTreeSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/single%20select%20static%20dropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		
	//to handel dropdown create boject from select class
		
		Select sel = new Select(dropdown);
		
		//to get all the options from dropdown
		List<WebElement> alloptions = sel.getOptions();
		
		//to elimibnate the duplicate value & maintain the order of insertion we use
		TreeSet<String> ts = new TreeSet<String>();
		
		//to read the list by eliminate duplicate
		for(int i=0; i<alloptions.size(); i++)
		{
			//get the options and text of options
			String op = alloptions.get(i).getText();
			
			//add the text of options to treeset
			ts.add(op);
		}
		//to read the options from text
      for(String options:ts)
      {
    	  Thread.sleep(2000);
    	  System.out.println(options);
      }

	}

}
