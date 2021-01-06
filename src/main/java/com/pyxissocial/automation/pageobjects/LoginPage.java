package com.pyxissocial.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[href='/sign-up']")
	private WebElement registerationLink;

	public WebElement getRegisterationLink() {
		return registerationLink;
	}
	
	public void clickRegistrationLink() {
		registerationLink.click();
	}

}
