package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends PageBase {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "email_create")
	WebElement email_txt ;
	
	@FindBy (id ="SubmitCreate")
	WebElement createAccount_btn;
	
	@FindBy (id = "email")
	WebElement email_txt_login;
	
	@FindBy (id = "passwd")
	WebElement password_txt;
	
	@FindBy (id = "SubmitLogin")
	WebElement signIn_btn;
	

	
	public void createAccount (String email)
	{
		fillData(email_txt, email);
		clickButton(createAccount_btn);
	}
	
	public void login (String email , String password)
	{
		fillData(email_txt_login, email);
		fillData(password_txt, password);
		clickButton(signIn_btn);
		
	}
	
	@FindBy(xpath = "//p[normalize-space()='There is 1 error']")
	public WebElement error;
	
	@FindBy (className = "navigation_page")
	public WebElement authuntication_flag;
	

}
