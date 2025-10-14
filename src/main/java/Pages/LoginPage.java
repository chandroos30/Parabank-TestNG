package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.DriverManager;
import Utils.WaitUtils;

public class LoginPage {

	private WebDriver driver;
	private WaitUtils waitUtils;

	public LoginPage() { // once this constructor is invoked, driver inside the constructor will be
											// assigned to all driver. instances
		this.driver = DriverManager.getDriver(); // this.driver -> driver inside this class | driver from LoginPageTest class is assigned here!
		this.waitUtils = new WaitUtils(20);
	}

	// Locators
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By loginButton = By.xpath("//input[@type='submit']");
	private By BillPayButton = By.xpath("//a[text()='Bill Pay']");

	// Actions
	public void enterUsername(String username) {
		waitUtils.waitForVisibility(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		waitUtils.waitForVisibility(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		waitUtils.waitForVisibility(loginButton).click();
	}

	public String getTitleoOfPage() {
		return driver.getTitle();
	}

	public void billPay() {
		driver.findElement(BillPayButton).click();
	}

}
