package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement TimeTrackImage;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement TaskImage;
	
	//initiolization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	//utilization
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getTimeTrackImage() {
		return TimeTrackImage;
	}

	public WebElement getTaskImage() {
		return TaskImage;
	}

	
	

	
}
