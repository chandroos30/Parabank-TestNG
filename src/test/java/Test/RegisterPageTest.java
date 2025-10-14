package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Driver.DriverManager;
import Pages.LoginPage;
import Pages.RegisterPage;

public class RegisterPageTest{
	
	RegisterPage registerPage;
	
	@BeforeClass
	public void setUp() {
		registerPage = new RegisterPage(); // ResgisterPage constructor will be invoked in LoginPage class
	}
	
	@Test(groups = "register", priority = 0, dataProvider = "RegisterScenario", dataProviderClass = DataProviders.DataProviders.class)
	public void RegistrationProcessTest(String userName, String password) {
		registerPage.clickPreRegisterButton();
		registerPage.entercustomerLastName("Sankar");
		registerPage.entercustomerAddress("Ambur");
		registerPage.entercustomerCity("Chennai");
		registerPage.entercustomerState("TamilNadu");
		registerPage.entercustomerFirstName("Chandrasekar");
		registerPage.entercustomerSSN("123456789");
		registerPage.entercustomerZipCode("635802");
		registerPage.entercustomerPhone("9789797897");
		registerPage.entercustomerUsername(userName);
		registerPage.entercustomerPassword(password);
		registerPage.enterconfirmPassword(password);
		registerPage.clickPostRegisterButton();
		registerPage.clickLogOutButton();
		String actualValue = registerPage.getTitle();
		String expectedValue = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualValue, expectedValue);
	}

}
