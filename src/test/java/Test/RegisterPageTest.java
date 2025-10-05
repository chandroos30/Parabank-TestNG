package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.DriverManager;
import Pages.LoginPage;
import Pages.RegisterPage;

public class RegisterPageTest extends TestSuiteSetUp{
	
	RegisterPage registerPage;
	
	@BeforeClass
	public void setUp() {
		registerPage = new RegisterPage(); // ResgisterPage constructor will be invoked in LoginPage class
		registerPage.openSite();
	}
	
	@Test(priority = 0)
	public void RegistrationProcessTest() {
		registerPage.clickPreRegisterButton();
		registerPage.entercustomerLastName("Sankar");
		registerPage.entercustomerAddress("Ambur");
		registerPage.entercustomerCity("Chennai");
		registerPage.entercustomerState("TamilNadu");
		registerPage.entercustomerFirstName("Chandrasekar");
		registerPage.entercustomerSSN("123456789");
		registerPage.entercustomerZipCode("635802");
		registerPage.entercustomerPhone("9789797897");
		registerPage.entercustomerUsername("Chandruoo");
		registerPage.entercustomerPassword("Chandru@3");
		registerPage.enterconfirmPassword("Chandru@3");
		registerPage.clickPostRegisterButton();
		registerPage.clickLogOutButton();
	}

}
