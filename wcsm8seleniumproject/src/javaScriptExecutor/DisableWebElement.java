package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/ADMIN/Desktop/HTMLSelenium/DisableWebElement.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i1').value='bhakti'");

	}

}
