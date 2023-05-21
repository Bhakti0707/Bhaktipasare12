package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//enter url of(bluestone)
		driver.get("https://www.bluestone.com/");
		
		//handle the popup
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		//create obj of action class to move to the coin
		Actions act = new Actions(driver);
		
		//use this method to move
		act.moveToElement(target).perform();
		
		//click on 1gm for 22
		driver.findElement(By.xpath("//span[.='1 gram' and (@data-p='gold-coins-weight-1gms,m')]")).click();
		
		//verify the 1gm 22k coins is displayed or not
				WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
				
		if(coin.isDisplayed())
		{
			System.out.println("coin is displayed");
		}
		else {
			   System.out.println("coin is not displayed");
		   }
		
		

	}

}
