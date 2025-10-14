package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driver.DriverManager;
import Utils.WaitUtils;

public class TransferFundsPage {

	private WebDriver driver;
	private WaitUtils waitUtils;

	public TransferFundsPage() {
		this.driver = DriverManager.getDriver();
		this.waitUtils = new WaitUtils(20);
	}

	// Locators
	private By openNewAccountMenuButton = By.xpath("//a[normalize-space()='Open New Account']");
	private By openNewAccountButton = By.xpath("//input[@value='Open New Account']");
	private By transferFundsButton = By.xpath("//a[text()='Transfer Funds']");
	private By amountField = By.id("amount");
	private By fromAccountDD = By.id("fromAccountId");
	private By toAccountDD = By.id("toAccountId");
	private By transferButton = By.xpath("//input[@value='Transfer']");

	// Actions
	public void clickOpenNewAcMenuButton()  {
		WebElement element = waitUtils.waitForVisibility(openNewAccountMenuButton);
		System.out.println(element);
		element.click();
		System.out.println("Open New Acc Menu Button Clicked");
	}

	public void clickOpenNewAcButton()  {
		WebElement element = waitUtils.waitForVisibility(openNewAccountButton);
		System.out.println(element);
		element.click();
		System.out.println("Open New Acc Button Clicked");
	}

	public void transferFundButtonClick()  {
		WebElement element = waitUtils.waitForVisibility(transferFundsButton);
		System.out.println(element);
		element.click();
		System.out.println("Transfer Button Clicked");
	}

	public void enterAmountToTransfer(String amount)  {
		WebElement element = waitUtils.waitForVisibility(amountField);
		System.out.println(element);
		element.sendKeys(amount);
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
		waitUtils.waitForVisibility(transferButton).click();
	}
}
