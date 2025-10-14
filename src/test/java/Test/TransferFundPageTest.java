package Test;

import org.testng.annotations.Test;

import Pages.TransferFundsPage;

public class TransferFundPageTest{

	TransferFundsPage transferFundsPage;

	@Test(priority = 0, retryAnalyzer = RetryLogic.Retry.class, dependsOnGroups = {"login"})
	public void transferFundsPageTest() throws InterruptedException {
		transferFundsPage = new TransferFundsPage();
		transferFundsPage.clickOpenNewAcMenuButton();
		transferFundsPage.clickOpenNewAcButton();
		transferFundsPage.transferFundButtonClick();
		transferFundsPage.enterAmountToTransfer("30");
		transferFundsPage.selectFromAccount();
		transferFundsPage.selectToAccount();
		transferFundsPage.clickTrandferButton();
	}

}
