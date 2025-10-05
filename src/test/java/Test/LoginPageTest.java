package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginPageTest extends TestSuiteSetUp{

	LoginPage loginPage; // declaring here so that all methods can access this object
	
	@BeforeClass
	public void setUp() {
		loginPage = new LoginPage(); // LoginPage constructor will be invoked in LoginPage class
	}

	@Test(priority = 0)
	public void verifyLoginWithInvalidCredentials() {
		loginPage.enterUsername("Chandru");
		loginPage.enterPassword("Chandru@4");
		loginPage.clickLogin();
	}

	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
//		LoginPage loginPage = new LoginPage(driver); // By extending the BaseClass the driver is assigned here.
		loginPage.enterUsername("Chandruo");
		loginPage.enterPassword("Chandru@3");
		loginPage.clickLogin();
	}

}
