package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (linkText = "Sign in")
	WebElement signIn_btn;
	
	public void openSignInPage ()
	{
		clickButton(signIn_btn);
	}
	
	

}
