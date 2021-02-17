package com.orangeHRM.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.TestBase;
import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super();//super class constructor is by using super keyword-----it  used for calling the base class constructor & then base class property will be initialize.
	}

	@BeforeMethod
	public void setUp() {
		Initialization();
		loginPage = new LoginPage();//so that i can access login class method.

	}

	@Test(priority = 1)
	public void OHRMPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 2)
	public void LoginpageImageTest() {
		boolean flag = loginPage.validateOHRMloginimage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginpageTest() {
		homepage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
