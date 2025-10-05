package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriverManager;

public class BaseClass {

	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\SDET\\Parabank(TestNG)\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();;
	}

	public void browserClose() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DriverManager.getDriver().quit();
		DriverManager.unload();		
	}

}
