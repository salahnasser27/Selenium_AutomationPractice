package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class TestBase {
	
	WebDriver driver ;
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeSuite 
	@Parameters ({"browser"})
	public void startBrowser ()
	{
		System.setProperty("webdriver.chrome.driver" ,
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	@AfterSuite
	public void quit ()
	{
		driver.close();
	}
}
