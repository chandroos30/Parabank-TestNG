package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	String url = "https://parabank.parasoft.com/";

	private WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openSite() {
		driver.get(url);
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
		driver.findElement(preRegisterButton).click();
	}

	public void entercustomerFirstName(String firstname) {
		driver.findElement(customerFirstNameField).sendKeys(firstname);
	}

	public void entercustomerLastName(String lastname) {
		driver.findElement(customerLastNameField).sendKeys(lastname);
	}

	public void entercustomerAddress(String address) {
		driver.findElement(customerAddressField).sendKeys(address);
	}

	public void entercustomerCity(String city) {
		driver.findElement(customerCityField).sendKeys(city);
	}

	public void entercustomerState(String state) {
		driver.findElement(customerStateField).sendKeys(state);
	}

	public void entercustomerZipCode(String zipCode) {
		driver.findElement(customerZipCodeField).sendKeys(zipCode);
	}

	public void entercustomerPhone(String phone) {
		driver.findElement(customerPhoneField).sendKeys(phone);
	}

	public void entercustomerSSN(String ssn) {
		driver.findElement(customerSSNField).sendKeys(ssn);
	}

	public void entercustomerUsername(String username) {
		driver.findElement(customerUsernameField).sendKeys(username);
	}

	public void entercustomerPassword(String password) {
		driver.findElement(customerPasswordField).sendKeys(password);
	}

	public void enterconfirmPassword(String password) {
		driver.findElement(confirmPasswordField).sendKeys(password);
	}
	
	public void clickLogOutButton() {
		driver.findElement(logOutButton).click();
	}
	
	public void clickPostRegisterButton() {
		driver.findElement(postRegisterButton).click();
	}
}
