package com.orangeHRM.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangeHRM.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			// System.getProperty("user.dir")
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\OrangeHrm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace(); // printStackTrace() method prints this throwable and its backtrace to the
									// standard error stream.

		} catch (IOException e) { // ioexception . This exception is related to Input and Output operations in the
									// Java code.'IOException' is a checked exception. .. While reading a file,
									// EOFException occurs when end of the file is reached.This exception happens
									// when there is a failure during reading, writing and searching file or
									// directory operations
			e.printStackTrace();

		}
	}
 
	public static void Initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-PC\\Downloads\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			if (browsername.equals("FF")) {
				System.setProperty("webdriver.gech.driver", "C:\\Users\\DELL-PC\\Downloads\\chrome\\gechodriver.exe");
				driver = new FirefoxDriver();
			}
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicityWait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
}