package com.orangeHRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRM.qa.base.TestBase;

public class PIMpage  extends TestBase {
	
	@FindBy(xpath="//li//label[@for='empsearch_employee_name']")
	WebElement EmpNameText;
	
	@FindBy(id="empsearch_employee_name_empName")
	WebElement EmpName;
	
	@FindBy(id="empsearch_id")
	WebElement ID;
	
	@FindBy(id="empsearch_supervisor_name")
	WebElement Supervisorname;
	
	
	@FindBy(id="searchBtn")
	WebElement SearchBtn;
	
	public PIMpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean Verifyempname() {
	return	EmpNameText.isDisplayed();
	
	}
	
	public void Enteridname(String idname , String supervisorname) {
		ID.sendKeys(idname);
		Supervisorname.sendKeys(supervisorname);
	}
	
	public void SelectEMPStatus(String statusname) {
		Select select = new Select(driver.findElement(By.id("empsearch_employee_status")));
		select.selectByVisibleText(statusname);
	}
	
	public void Selectinclude(String Include) {
		Select select = new Select(driver.findElement(By.id("empsearch_termination")));
		select.selectByVisibleText(Include);
	}	
		
	public void SelectjobTitle(String jobtitle) {
		Select select = new Select(driver.findElement(By.id("empsearch_job_title")));
		select.selectByVisibleText(jobtitle);
	}
	
	public void SelectSubunit(String Subunit) {
		Select select = new Select(driver.findElement(By.id("empsearch_sub_unit")));
		select.selectByVisibleText(Subunit);
	}
	public void clickonSearchbtn() {
		SearchBtn.click();
	}
	
}
	
	
	


