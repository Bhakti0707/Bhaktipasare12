package Assignment1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("http://127.0.0.1/login.do;jsessionid=ag57osqg26170");
		   
		  if(driver.getTitle().equals("actiTIME - Login"))
		  {
			  System.out.println("login page Title is match test case is pass");
			  
		     driver.findElement(By.name("username")).sendKeys("admin");
		     
		     driver.findElement(By.name("pwd")).sendKeys("manager");
		     
		     driver.findElement(By.id("loginButton")).click();
		  }
		  else {
			   System.out.println("login page title is not match, testcase is fail");
		    }
		  if(driver.getTitle().equals("Enter Time-Track"))
		  {
			  System.out.println("home page title is match ,test case is pass");
		  }
		  else {
			      System.out.println("home page title is not match , test case is fail");
		     }
		 
		  
		

	}

}
