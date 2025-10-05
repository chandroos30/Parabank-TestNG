package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.TransferFundsPage;

public class TransferFundPageTest extends TestSuiteSetUp {

	TransferFundsPage transferFundsPage;

	@Test(priority = 0)
	public void transferFundsPageTest() {
		transferFundsPage = new TransferFundsPage();
		transferFundsPage.transferFundButtonClick();
		transferFundsPage.enterAmountToTransfer("30");
		transferFundsPage.selectFromAccount();
		transferFundsPage.selectToAccount();
		transferFundsPage.clickTrandferButton();
	}

}
