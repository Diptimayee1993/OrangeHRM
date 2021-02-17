package com.orangeHRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a//img[@alt='OrangeHRM']")
	WebElement Logonamelabel;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIMLink;
	
	@FindBy(id="menu__Performance")
	WebElement PerformanceLink;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement RecruitmentLink;
	
	//Initializing the page object by creating home page constructor.
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	
	public String verifyHomePageTitle() {
	return  driver.getTitle();
	}
	
	public boolean VerifyLogoNameLabel() {
		return Logonamelabel.isDisplayed();
	}
	
	
	public PerformancePage clickOnPerformaneLink() {
		 PerformanceLink.click();
		 return new PerformancePage();
	}
	
	public PIMpage clickOnPIMLink() {//this the page object/page chaining model,if i clicking on particular any link then next landing page is that particular clicking page.
		 PIMLink.click();            // whenever we clicking a link or button if it is moving to the next page so next that particular method should return the next landing page object.
		 return new PIMpage();
	}	 
	 public AdminPage clickOnAdminLink() {
			 AdminLink.click();
			 return new AdminPage();
	 }
	
	 public RecruitmentPage clickOnRecruitmentLink() {
			 RecruitmentLink.click();
			 return new RecruitmentPage();
		 
		 
		 
	
	
	
	
		
		
		
	}
	
	
	
	
	
	

}
