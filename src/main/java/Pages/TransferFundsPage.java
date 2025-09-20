package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {
	
	private WebDriver driver;
	
	public TransferFundsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	private By openNewAccountMenuButton = By.xpath("//a[text()='Open New Account']");
	private By openNewAccountButton = By.xpath("//input[@value='Open New Account']");
	private By transferFundsButton = By.xpath("//a[text()='Transfer Funds']");
	private By amountField = By.id("amount");
	private By fromAccountDD = By.id("fromAccountId");
	private By toAccountDD = By.id("toAccountId");
	private By transferButton = By.xpath("//input[@value='Transfer']");
	
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
		Select select = new Select(driver.findElement(fromAccountDD));
		select.selectByIndex(0);
	}
	
	public void selectToAccount() {
		Select select = new Select(driver.findElement(toAccountDD));
		select.selectByIndex(1);
	}
	
	public void clickTrandferButton() {
		driver.findElement(transferButton).click();
	}
}
