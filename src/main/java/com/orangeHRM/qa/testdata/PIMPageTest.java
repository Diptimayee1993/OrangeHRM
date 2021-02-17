package com.orangeHRM.qa.testdata;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.TestBase;
import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;
import com.orangeHRM.qa.pages.PIMpage;

public class PIMPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
    PIMpage pimpage;
    
public PIMPageTest() {
	super();
	
}
@BeforeMethod
public void setUp() {
Initialization();
loginPage=new LoginPage();
homepage= loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
pimpage= homepage.clickOnPIMLink();
	
}


@Test(priority=1)
public void VerifyEmpNameTest() {
	Assert.assertTrue(pimpage.Verifyempname(), "Emp name is missing");
	
}
@Test(priority=2)
public void ValidateIDnameTest() {
	pimpage.Enteridname("Lisa", "shreesha");
}

@Test(priority=3)
public void ValidateEMPStausTest() {
	pimpage.SelectEMPStatus("Freelance");
}
@Test(priority=4)
public void IncludeBoxTest() {
	pimpage.Selectinclude("Current Employees Only");
}

@Test(priority=5)
public void JobTitleTest() {
	pimpage.SelectjobTitle("HR Manager");
}

@Test(priority=6)
public void SubUnitTest() {
	pimpage.SelectSubunit("Administration");
}
@Test(priority=7)
public void SearchBtnTest() {
	pimpage.clickonSearchbtn();
}


@AfterMethod 
public void Teardown() {
driver.quit();

}

	
}
