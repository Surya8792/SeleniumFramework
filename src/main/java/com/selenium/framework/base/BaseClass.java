package com.selenium.framework.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass
{
	public static WebDriver driver;
	String g_browser = ExcelData.getValue("BaseUtils", 1, 1);
	String g_appURL = ExcelData.getValue("BaseUtils", 2, 1);
	String g_browser_Key = ExcelData.getValue("BaseUtils", 3, 1);
	String g_browser_Values = ExcelData.getValue("BaseUtils", 4, 1);

	@BeforeSuite(alwaysRun = true)
	public void launchBrowser() {
		System.setProperty(g_browser_Key, g_browser_Values);

		if (g_browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(g_appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
	}

	@AfterSuite(alwaysRun = true)
	public void closeApplication() {
		driver.close();
		driver.quit();
	}
}
