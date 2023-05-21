package synchronaization;


		import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

		public class ActitimeTestCase2 {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  
				  driver.manage().window().maximize();
				  
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				  
				  driver.get("http://127.0.0.1/login.do;jsessionid=ag57osqg26170");
				  
				  String loginPageTitle = driver.getTitle();
				  
				  WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				  
				  if(Wait.until(ExpectedConditions.titleContains(loginPageTitle)))
				  {
					  System.out.println("Login Page title is matched, test case is pass");
					  
					  driver.findElement(By.name("username")).sendKeys("admin");
					  driver.findElement(By.name("pwd")).sendKeys("manager");
					  driver.findElement(By.id("loginButton")).click();
				  }
				  else {
					     System.out.println("login page title is not match test case is fail");
				     }
				  String homepagetitle = driver.getTitle();
				  
				  if(Wait.until(ExpectedConditions.titleContains(homepagetitle)))
					  
				  {
					  System.out.println("home page title is match test case is match");
				  }
				  else {
					   System.out.println("home page is not match test case is fail");
				     }
				   
	}

}
