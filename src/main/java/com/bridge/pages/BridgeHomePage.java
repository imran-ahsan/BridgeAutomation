package com.bridge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BridgeTest.Com.Bridge.Test.BridgeBase;


public class BridgeHomePage extends BridgeBase {
	
	@FindBy(id= "bia-login")
	WebElement homeUser;
	
	
	public BridgeHomePage()  {
		PageFactory.initElements(driver, this);
	}
	public String validateHomeUser() {
		
		String str= (homeUser).getText();
		return str;
	}

}
