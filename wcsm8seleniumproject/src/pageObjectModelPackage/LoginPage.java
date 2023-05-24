package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//record all the Webelement of login page by using @FindBy annotation
	
	@FindBy(name="username") private WebElement UserNameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(linkText="Actimind Inc.") private WebElement actiMindLink;
	
	//initialization
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getUserNameTB() {
		return UserNameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	
	//operational method

	public void validLogin(String validUsername, String validPassword)
	{
	  UserNameTB.sendKeys(validUsername);
	  PasswordTB.sendKeys(validPassword);
	  loginButton.click();
	   
	 }
	   public void invalidLogin(String invalidUserName, String invalidPassword) throws InterruptedException
	   {
		   UserNameTB.sendKeys(invalidUserName);
		   PasswordTB.sendKeys(invalidPassword);
		   loginButton.click();
		   Thread.sleep(2000);
		   UserNameTB.clear();
	   }
	
}
