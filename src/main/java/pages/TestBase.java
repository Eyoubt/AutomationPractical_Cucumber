package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static void initDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*
	 * public void takeScreenshot(WebDriver driver) {
	 * 
	 * TakesScreenshot ts = (TakesScreenshot) driver;
	 * 
	 * try { SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
	 * Date date = new Date(); String label = formatter.format(date);
	 * FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new
	 * File(System.getProperty("user.dir") + "/screenshot/" + label + ".png")); }
	 * catch (WebDriverException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } }
	 */

}
