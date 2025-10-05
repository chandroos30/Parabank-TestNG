package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.DriverManager;
import Utils.Waits;

public class LoginPage {

	private WebDriver driver;

	public LoginPage() { // once this constructor is invoked, driver inside the constructor will be
											// assigned to all driver. instances
		this.driver = DriverManager.getDriver(); // this.driver -> driver inside this class | driver from LoginPageTest class is assigned here!
		Waits.implicitWait(driver);
	}

	// Locators
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By loginButton = By.xpath("//input[@type='submit']");
	private By BillPayButton = By.xpath("//a[text()='Bill Pay']");

	// Actions
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public String getTitleoOfPage() {
		return driver.getTitle();
	}

	public void billPay() {
		driver.findElement(BillPayButton).click();
	}

}
