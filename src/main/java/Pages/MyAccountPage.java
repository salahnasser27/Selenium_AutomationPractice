package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (linkText  = "Sign out")
	WebElement logout_btn;
	
	@FindBy (xpath  = "//*[@id=\"center_column\"]/p")
	public WebElement result;
	
	public void logout ()
	{
		clickButton(logout_btn);
	}
}
