package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.DriverManager;


public class WaitUtils{
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public WaitUtils(int timeOutInSeconds) {
		this.driver = DriverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
	}
	
	public WebElement waitForVisibility(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
