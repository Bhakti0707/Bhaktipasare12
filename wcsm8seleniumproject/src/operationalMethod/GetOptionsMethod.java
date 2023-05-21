package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/single%20select%20static%20dropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropdown);
		List<WebElement> alloptions = sel.getOptions();
		
		//to read the list of web element using looping statement
		
//		for(int i=0; i<alloptions.size(); i++)
//		{
//			String options = alloptions.get(i).getText();
//			System.out.println(options);
//		}
		
  //advance for loop
		for(WebElement op:alloptions)
		{
			String options = op.getText();
			System.out.println(options);
		}
	}

}
