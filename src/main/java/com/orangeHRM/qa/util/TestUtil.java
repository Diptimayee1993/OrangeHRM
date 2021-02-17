package com.orangeHRM.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRM.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PageLoadTimeOut=20;
	public static long implicityWait=10;
	
	public void HandelDropdown(String DropDownName, String Value) {
		if(DropDownName.equalsIgnoreCase("User Role")) {
			Select select=new Select(driver.findElement(By.id("searchSystemUser_userType")));
			select.selectByVisibleText(Value);
		}
		if(DropDownName.equalsIgnoreCase("Status")) {
			Select select=new Select(driver.findElement(By.id("searchSystemUser_status")));
			select.selectByVisibleText(Value);
		}
		
	}
	
	

}
