package com.orangeHRM.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.TestBase;
import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;
import com.orangeHRM.qa.pages.PIMpage;
import com.orangeHRM.qa.pages.PerformancePage;
import com.orangeHRM.qa.pages.RecruitmentPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	PerformancePage performancePage;
	PIMpage pimpage;
	RecruitmentPage Recruitmentpage;
	
	
	
	public HomePageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
    Initialization();
    loginPage=new LoginPage();
    pimpage= new PIMpage();
    performancePage=new PerformancePage();
    Recruitmentpage= new RecruitmentPage();
   homepage= loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void VeriyHomepagetitleTest() {
	String homepagetitle=homepage.verifyHomePageTitle();
	Assert.assertEquals(homepagetitle, "OrangeHRM","HomePageTitle not matched");
	
	}
	@Test(priority=2)
	public void VerifyLogonameLabel() {
	boolean homepagelogo=homepage.VerifyLogoNameLabel();
	Assert.assertTrue(homepagelogo);
		
	}
	
	@Test(priority=3)
	public void ClickonPerformanceLink() {
		performancePage=homepage.clickOnPerformaneLink();
		
	}
	
	@Test (priority=4)
	public void ClickonPIMLink() {
		pimpage=homepage.clickOnPIMLink();
		
	}
	
	@Test(priority=5)
	public void ClickOnRecruitmentPage() {
		Recruitmentpage=homepage.clickOnRecruitmentLink();
	}
	
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	
	
		
		
	}

}
