package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.DriverManager;
import Utils.WaitUtils;

public class RegisterPage {
	private WebDriver driver;
	private WaitUtils waitUtils;

	public RegisterPage() {
		this.driver = DriverManager.getDriver();
		this.waitUtils = new WaitUtils(20);
	}

	// Locators
	private By preRegisterButton = By.xpath("//a[text()='Register']");
	private By customerFirstNameField = By.id("customer.firstName");
	private By customerLastNameField = By.id("customer.lastName");
	private By customerAddressField = By.id("customer.address.street");
	private By customerCityField = By.id("customer.address.city");
	private By customerStateField = By.id("customer.address.state");
	private By customerZipCodeField = By.id("customer.address.zipCode");
	private By customerPhoneField = By.id("customer.phoneNumber");
	private By customerSSNField = By.id("customer.ssn");
	private By customerUsernameField = By.id("customer.username");
	private By customerPasswordField = By.id("customer.password");
	private By confirmPasswordField = By.id("repeatedPassword");
	private By postRegisterButton = By.xpath("//input[@value='Register']");
	private By logOutButton = By.xpath("//a[text()='Log Out']");

	// Actions
	public void clickPreRegisterButton() {
		waitUtils.waitForVisibility(preRegisterButton).click();
		;
	}

	public void entercustomerFirstName(String firstname) {
		waitUtils.waitForVisibility(customerFirstNameField).sendKeys(firstname);
	}

	public void entercustomerLastName(String lastname) {
		waitUtils.waitForVisibility(customerLastNameField).sendKeys(lastname);
	}

	public void entercustomerAddress(String address) {
		waitUtils.waitForVisibility(customerAddressField).sendKeys(address);
	}

	public void entercustomerCity(String city) {
		waitUtils.waitForVisibility(customerCityField).sendKeys(city);
	}

	public void entercustomerState(String state) {
		waitUtils.waitForVisibility(customerStateField).sendKeys(state);
	}

	public void entercustomerZipCode(String zipCode) {
		waitUtils.waitForVisibility(customerZipCodeField).sendKeys(zipCode);
	}

	public void entercustomerPhone(String phone) {
		waitUtils.waitForVisibility(customerPhoneField).sendKeys(phone);
	}

	public void entercustomerSSN(String ssn) {
		waitUtils.waitForVisibility(customerSSNField).sendKeys(ssn);
		driver.findElement(customerSSNField);
	}

	public void entercustomerUsername(String username) {
		waitUtils.waitForVisibility(customerUsernameField).sendKeys(username);
	}

	public void entercustomerPassword(String password) {
		waitUtils.waitForVisibility(customerPasswordField).sendKeys(password);
	}

	public void enterconfirmPassword(String password) {
		waitUtils.waitForVisibility(confirmPasswordField).sendKeys(password);
	}

	public void clickLogOutButton() {
		waitUtils.waitForVisibility(logOutButton).click();
	}

	public void clickPostRegisterButton() {
		waitUtils.waitForVisibility(postRegisterButton).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
