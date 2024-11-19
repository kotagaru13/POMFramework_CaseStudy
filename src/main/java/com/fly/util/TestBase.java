package com.fly.util;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestBase {

	private static TestBase testBase;
	private static WebDriver driver;
	private static Properties prop;

	private TestBase() {
		String strBrowser = "chrome";

		if (strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Init driver ...." + driver);

		} else if (strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		System.out.println("Driver obj ...." + driver);

	}

	public static void initDriver() {
		if (testBase == null) {
			testBase = new TestBase();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public static void acceptAlerts() {
		driver.switchTo().alert().accept();
	}
}
