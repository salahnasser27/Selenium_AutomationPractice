package test;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import Pages.AuthenticationPage;
import Pages.HomePage;
import Pages.MyAccountPage;

public class AuthenticationTest extends TestBase{
	
	HomePage home ;
	AuthenticationPage Auth;
	MyAccountPage myAcc;

	@Test
	//ID = TC_AutomationPractice_Login_01
	public void LoginWithValidData ()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		Auth = new AuthenticationPage(driver);
		Auth.login("salahnasser@gmail.com", "12345");
		myAcc = new MyAccountPage(driver);
		
		String compare = myAcc.result.getText();
		
		assertTrue(compare.contains("Welcome"));
		
		myAcc.logout();
		
	}
	
	@Test
	//ID = TC_AutomationPractice_Login_02
	public void LoginWithNullData()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		Auth = new AuthenticationPage(driver);
		Auth.login("","");
		
		
		
		String compare = Auth.error.getText();
		
		assertTrue(compare.contains("error"));
		
	
	}
	
	@Test
	//ID = TC_AutomationPractice_Login_03
	public void LoginWithWrongPassword()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		Auth = new AuthenticationPage(driver);
		Auth.login("salahnasser@gmail.com","1234");
		
		
		String compare = Auth.error.getText();
		
		assertTrue(compare.contains("error"));
		
	}
	
	@Test
	//ID = TC_AutomationPractice_Login_04
	public void LoginWithWrongEmail()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		Auth = new AuthenticationPage(driver);
		Auth.login("salahnasser11@gmail.com","12345");
		

		String compare = Auth.error.getText();
		
		assertTrue(compare.contains("error"));
		
	}
	
	@Test
	//ID = TC_AutomationPractice_Login_05
	public void LoginWithNullPassword()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		Auth = new AuthenticationPage(driver);
		Auth.login("salahnasser@gmail.com","");
		

		String compare = Auth.error.getText();
		
		assertTrue(compare.contains("error"));
	}
	
	@Test
	//ID = TC_AutomationPractice_Login_06
	public void LoginWithNullEmail()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		Auth = new AuthenticationPage(driver);
		Auth.login("","12345");
		

		String compare = Auth.error.getText();
		
		assertTrue(compare.contains("error"));
	}
	

}
