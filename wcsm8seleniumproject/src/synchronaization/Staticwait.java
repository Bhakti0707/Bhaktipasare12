package synchronaization;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;

		public class Staticwait {
  //by using static wait
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
			WebDriver	driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.name("user")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin123456");
			
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
			

	}

}
