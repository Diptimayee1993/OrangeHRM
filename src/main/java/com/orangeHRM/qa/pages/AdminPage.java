package com.orangeHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.TestBase;




public class AdminPage extends TestBase {
    
	@FindBy (xpath="//li//label[@for='searchSystemUser_userName']")
	WebElement usernameKey;

	@FindBy(id="searchSystemUser_userName")
	WebElement UserName;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement EmployeeName;

	@FindBy(id="searchBtn")
	WebElement searchBtn;

//Initializing the page object:
public AdminPage() {
	PageFactory.initElements(driver, this);

}	
public boolean VerifyUsernameKey() {
	return usernameKey.isDisplayed();
}



public void EnterUsername(String name,String Empname) {
	UserName.sendKeys(name);
	EmployeeName.sendKeys(Empname);
	
}
public void ClickOnSearchBtn() {
	searchBtn.click();
}

	
}
	
	
	
	
	

	





