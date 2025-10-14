package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Base.BaseClass;
import Driver.DriverManager;

public class TestSuiteSetUp extends BaseClass{
	WebDriver driver;
	String url = "https://parabank.parasoft.com/";
	
	@BeforeSuite
	public void setUpTest() {
		browserLaunch();
		this.driver = DriverManager.getDriver();
		driver.get(url);
		
	}
		
	@AfterSuite
	public void quitBrowser() {
		browserClose();
	}
	
}
