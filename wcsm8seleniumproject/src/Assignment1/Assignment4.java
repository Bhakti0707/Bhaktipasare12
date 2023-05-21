package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Assignment4 {

	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 
		 WebDriver driver=new EdgeDriver();
   
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
		 
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(2000);
		   List<WebElement> options = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 
		   List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		  for(int i=0;i<options.size();i++)
		  {
			  String nameofmobiles = options.get(i).getText();
			  
		
			
			for(int j=i; j<=i;j++)
			{
			  String priceofmobiles = alloptions.get(j).getText();
			  System.out.print("Name of mobiles :"+nameofmobiles+"price of mobile :"+priceofmobiles);
					  
			}
			
			System.out.println();
			
			
		  }
		    
	}
     
}
