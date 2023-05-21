package Assignment1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeChildWindow {

	//perform max on child window
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://omayo.blogspot.com/");

		//find web element of web page
		WebElement link = driver.findElement(By.linkText("Open a popup window"));

		//find the position of web element
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();

		//scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(" +xaxis+","+(yaxis-300)+")");
		
		//address of parent window
		String parenthandle = driver.getWindowHandle();
		
		//click on link for child window
		link.click();

		//to handle or get the address of parent as will as child
		Set<String> wh = driver.getWindowHandles();
		
		//maximize the child window
		for(String el:wh)
		{
			if(!parenthandle.equals(wh))
			{
				Thread.sleep(2000);
                driver.switchTo().window(wh).manage().window().maximize();
			}
		}
		System.out.println("parent and child address: "+wh);
		
	

	}

}
