package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Waits;

public class BaseClass{

	public static WebDriver driver;
	Waits wait = new Waits();

	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SDET\\Parabank(TestNG)\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait.implicitWait(driver);
	}

	public void browserClose() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
