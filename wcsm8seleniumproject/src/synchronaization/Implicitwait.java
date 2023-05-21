package synchronaization;


		import java.time.Duration;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;

		public class Implicitwait {
			
       //by using implicit wait
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
			WebDriver	driver=new ChromeDriver();
			
			driver.manage().window().maximize();
	
			
			driver.get("https://www.instagram.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin123456");
			
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
			
		
			

	}

}
