package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	public Select select;
	public WebDriver driver;
	
	public PageBase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void clickButton (WebElement button)
	{
		button.click();
	}
	public static void fillData (WebElement text , String value)
	{
		text.sendKeys(value);
	}
	
	public static void clear (WebElement txt)
	{
		txt.clear();
	}

}
