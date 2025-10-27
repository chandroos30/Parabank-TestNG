package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	public static void takeScreenshot(WebDriver driver, String testName) {
		TakesScreenshot takess = (TakesScreenshot) driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File source = takess.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "/Screenshots/"+ testName+"_"+timestamp+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			System.out.println("Screenshot not captured: " + e.getMessage());
		}
	}

}
