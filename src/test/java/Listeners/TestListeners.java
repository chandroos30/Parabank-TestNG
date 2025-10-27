package Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Driver.DriverManager;
import Utils.ScreenshotUtils;

public class TestListeners implements ITestListener {
	
	WebDriver driver;
	String testName;
	
	@Override
	public void onTestFailure(ITestResult result) {
		testName = result.getName();
		this.driver = DriverManager.getDriver();
		ScreenshotUtils.takeScreenshot(driver, testName);
		System.out.println("Test Failed: " + testName + " -> Screenshot captured");
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}
}
