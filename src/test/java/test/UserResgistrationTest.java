package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import Pages.AuthenticationPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.RegisterPage;

public class UserResgistrationTest extends TestBase {
	
	HomePage home ;
	AuthenticationPage obj ;
	RegisterPage reg;
	MyAccountPage myAcc;
	
	@Test (priority = 1)
	//ID = TC_AutomationPractice_Register_01
	public void ResgisterWithValidData() 
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		obj = new AuthenticationPage(driver);
		obj.createAccount("salah5566@gmail.com");
		
		reg = new RegisterPage(driver);
		reg.userResgitration("Salah", "Salah", "12345", "Valeo", "Nasr City",
				"15151", "0123456789", "Ramses", "Cairo");
		myAcc = new MyAccountPage(driver);
		
		String compare = myAcc.result.getText();
		
		assertTrue(compare.contains("Welcome"));
		
		myAcc.logout();
		
	}
	
	@Test(priority = 2)
	//ID = TC_AutomationPractice_Register_02
	public void RegisterWithAlreadyRegisteredMail()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		obj = new AuthenticationPage(driver);
		obj.createAccount("salah5566@gmail.com");
		
		
		String compare = obj.authuntication_flag.getText();
		
		assertEquals(compare, "Authentication");
		
		
	}
	
	@Test
	//ID = TC_AutomationPractice_Register_03
	public void RegisterWithNullData()
	{
		home = new HomePage(driver);
		home.openSignInPage();
		
		obj = new AuthenticationPage(driver);
		obj.createAccount("salah6677@gmail.com");
		
		reg = new RegisterPage(driver);
		reg.userResgitration("", "", "", "", "", "", "", "", "");
		
		
		String compare = reg.error.getText();
		
		assertTrue(compare.contains("error"));
		
		


		
		
	}

}
