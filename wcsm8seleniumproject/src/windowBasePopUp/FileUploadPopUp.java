package windowBasePopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("http://127.0.0.1/login.do;jsessionid=3dbgarenu81o");
	       
	       //handel login page with valid input
	       driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       
	       //home page
	       //click on setting
	       driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
	       
	       //click on logo and color
	       driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	       
	       //click on radio button
	       driver.findElement(By.id("uploadNewLogoOption")).click();
	       
	       //click on choose file button
	       WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	       
	       //create boj of action class
	       Actions act = new Actions(driver);
	       
	       //use this method of double click
	       act.doubleClick(target).perform();
	       //Thread.sleep(2000);
	       
	       //to handle file upload popup
	       File file = new File("./autoit/uploadfile.exe");
	      String absolutepath = file.getAbsolutePath();
	      Thread.sleep(2000);
	      Runtime.getRuntime().exec(absolutepath);
	      Thread.sleep(28000);
	      Runtime.getRuntime().exec(absolutepath);
	      driver.quit();
	    		   
	     
	       

	}

}
