package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driver.DriverManager;
import Utils.Waits;

public class TransferFundsPage {
	
	private WebDriver driver;
	
	public TransferFundsPage() {
		this.driver = DriverManager.getDriver();
		Waits.implicitWait(driver);
	}
	
	//Locators
	private By openNewAccountMenuButton = By.xpath("//a[text()='Open New Account']");
	private By openNewAccountButton = By.xpath("//input[@value='Open New Account']");
	private By transferFundsButton = By.xpath("//a[text()='Transfer Funds']");
	private By amountField = By.id("amount");
	private By fromAccountDD = By.id("fromAccountId");
	private By toAccountDD = By.id("toAccountId");
	private By transferButton = By.xpath("//input[@value='Transfer']");
	
	//Actions
	public void clickOpenNewAcMenuButton() {
		driver.findElement(openNewAccountMenuButton).click();
	}
	
	public void clickOpenNewAcButton() {
		driver.findElement(openNewAccountButton).click();
	}
	
	public void transferFundButtonClick() {
		driver.findElement(transferFundsButton).click();
	}
	
	public void enterAmountToTransfer(String amount) {
		driver.findElement(amountField).sendKeys(amount);
	}
	
	public void selectFromAccount() {
		WebElement fromAcDDElement = driver.findElement(fromAccountDD);
		Select select = new Select(fromAcDDElement);
		select.selectByIndex(0);
	}
	
	public void selectToAccount() {
		WebElement toAcDDElement = driver.findElement(toAccountDD);
		Select select = new Select(toAcDDElement);
		select.selectByIndex(1);
	}
	
	public void clickTrandferButton() {
		driver.findElement(transferButton).click();
	}
}
