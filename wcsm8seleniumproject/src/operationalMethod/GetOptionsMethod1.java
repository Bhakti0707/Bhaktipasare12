package operationalMethod;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	

	
	driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/multiselectstaticdropdown.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	
	Select sel = new Select(dropdown);
	
	List<WebElement> alloptions = sel.getOptions();
	for(WebElement op:alloptions)
	{
		String options = op.getText();
		System.out.println(options);
	}
	

	}

}
