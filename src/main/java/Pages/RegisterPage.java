package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

	public RegisterPage(WebDriver driver) {
		super(driver);

	}

	// Personal Information
	@FindBy (id ="id_gender1")
	WebElement gedner_radioBtn_MR;

	@FindBy (id ="id_gender2")
	WebElement gedner_radioBtn_MRS;

	@FindBy (id = "customer_firstname")
	WebElement firstname_txt;

	@FindBy (id = "customer_lastname")
	WebElement lastname_txt;

	@FindBy (id ="passwd")
	WebElement password_txt;

	@FindBy (id = "days")
	WebElement dayDropDownMenu;

	@FindBy (id = "months")
	WebElement monthsDropDownMenu;

	@FindBy (id = "years")
	WebElement yearsDropDownMenu;

	//	Your  Address

	@FindBy (id = "firstname")
	WebElement firstname_txt_address;

	@FindBy (id = "lastname")
	WebElement lastname_txt_address;

	@FindBy (id = "company")
	WebElement company_txt_address;

	@FindBy (id = "address1")
	WebElement address_txt;

	@FindBy (id = "city")
	WebElement city_txt;

	@FindBy (id = "id_state")
	WebElement stateDropDownList;

	@FindBy (id = "postcode")
	WebElement postcode_txt;

	@FindBy (id = "id_country")
	WebElement countryDropDownList;

	@FindBy (id = "phone_mobile")
	WebElement phoneNumber_txt;

	@FindBy (id = "alias")
	WebElement alias_address_txt;

	@FindBy (id="submitAccount")
	WebElement register_btn;





	public void userResgitration (String firstname , String lastname , String password ,String company ,
			String address ,String postcode , String phoneNumber , String alias_address , String city)
	{
		
		gedner_radioBtn_MR.click();
		fillData(firstname_txt, firstname);
		fillData(lastname_txt, lastname);
		fillData(password_txt, password);
		fillData(company_txt_address, company);
		fillData(address_txt, address);
		fillData(postcode_txt, postcode);
		fillData(phoneNumber_txt, phoneNumber);
		clear(alias_address_txt);
		fillData(alias_address_txt, alias_address);
		fillData(city_txt, city);
		select = new Select(dayDropDownMenu);
		select.selectByIndex(14);
		select = new Select(yearsDropDownMenu);
		select.selectByValue("1990");
		select = new Select(monthsDropDownMenu);
		select.selectByValue("6");
		select = new Select (stateDropDownList);
		select.selectByValue("15");
		

		clickButton(register_btn);

	}

	@FindBy (xpath = "//p[normalize-space()='There are 8 errors']")
	public WebElement error;

	
















}
