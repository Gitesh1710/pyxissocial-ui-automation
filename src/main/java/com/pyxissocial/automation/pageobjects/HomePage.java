package com.pyxissocial.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class='welcomeheader-right font-semibold text-right'] span")
	private WebElement welcomeHeader;

	public WebElement getWelcomeHeader() {
		return welcomeHeader;
	}
}
