package com.orangeHRM.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.TestBase;
import com.orangeHRM.qa.testdata.LoginPageTest;

public class LoginPage extends TestBase { 
	
	//just defining here page libraries //Page Factory//object Repository of Login page..
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@id='divLoginImageContainer']")
	WebElement LoginImage;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgotPswdLink;

	
	//Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateLoginPageTitle() {
	 return	 driver.getTitle(); 
	}
	
	public boolean  validateOHRMloginimage() {
		return LoginImage.isDisplayed();
	}
	
	public HomePage  Login(String Un,String pwd) {
		username.sendKeys(Un);
		password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage(); 
	 
	}
	
	
	
	
	

}
