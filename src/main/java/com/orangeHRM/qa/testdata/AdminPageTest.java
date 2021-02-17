package com.orangeHRM.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.TestBase;
import com.orangeHRM.qa.pages.AdminPage;
import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;
import com.orangeHRM.qa.util.TestUtil;

public class AdminPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepage;
    TestUtil testUtil;
    AdminPage adminpage;
    
public AdminPageTest() {
	super();
	
}
@BeforeMethod
public void setUp() {
Initialization();
loginPage=new LoginPage();
homepage= loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
testUtil= new TestUtil();
adminpage = homepage.clickOnAdminLink();

}

@Test(priority=1)
public void VerifyUserKeywordlabel() {
	Assert.assertTrue(adminpage.VerifyUsernameKey(), "Contact label is missing");	
}

@Test(priority=2)
public void SelectUserName() {
	adminpage.EnterUsername("Dipti", "Swadhin");
	
}

@Test(priority=3)
public void  handeldropdown() {
	testUtil.HandelDropdown("User Role", "Admin");
	testUtil.HandelDropdown("Status", "Enabled");
}

@Test(priority=4)
public void ClickOnSearchBtn() {
	adminpage.ClickOnSearchBtn();
}




  @AfterMethod public void Teardown() { driver.quit();
  
  }
 


}