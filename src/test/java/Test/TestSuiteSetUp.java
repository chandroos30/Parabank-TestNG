package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Base.BaseClass;

public class TestSuiteSetUp extends BaseClass{
	
	@BeforeSuite
	public void setUpTest() {
		browserLaunch();
	}
	
	@AfterSuite
	public void quitBrowser() {
		browserClose();
	}
	
}
