package pageObjectModelPackage;

public class WorkLib extends BaseTestdata{

	
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}
}
