package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import Pages.LoginPage;

public class LoginPageTest{

	LoginPage loginPage; // declaring here so that all methods can access this object
	
	@BeforeClass
	public void setUp() {
		loginPage = new LoginPage(); // LoginPage constructor will be invoked in LoginPage class
	}

	
	  @Test(groups = "login", priority = 0, retryAnalyzer = RetryLogic.Retry.class, dependsOnGroups = "register")
	  public void verifyLoginWithInvalidCredentials() { 
		  loginPage.enterUsername("Chandru"); 
		  loginPage.enterPassword("Chandru@4");
		  loginPage.clickLogin();
		  String actualValue = loginPage.getTitleoOfPage();
		  String expectedValue = "ParaBank | Error"; 
		  Assert.assertEquals(actualValue, expectedValue); 
	  }
	 

	@Test(groups = "login", priority = 1, dataProvider = "RegisterScenario", dataProviderClass = DataProviders.DataProviders.class, dependsOnMethods = "verifyLoginWithInvalidCredentials")
	public void verifyLoginWithValidCredentials(String userName, String password) {
		loginPage.enterUsername(userName);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		String actualTitle = loginPage.getTitleoOfPage();
		System.out.println(loginPage.getTitleoOfPage());
		String expectedTitle = "ParaBank | Accounts Overview";
		Assert.assertEquals(actualTitle, expectedTitle, "Title of the Page mismatched");
	}

}
