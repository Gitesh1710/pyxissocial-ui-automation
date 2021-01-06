package com.pyxissocial.automation.pageobjects;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="full_name")
	private WebElement firstAndLastName_textBox;
	
	@FindBy(name="email")
	private WebElement emailAddress_textBox;
	
	@FindBy(name="pass")
	private WebElement password_textBox;

	@FindBy(css="label[for='termCheck']")
	private WebElement termsAndConditions_checkBox;

	@FindBy(css="input[value='Sign Up']")
	private WebElement signUp_button;

	public WebElement gettermsAndConditionCheckBox() {
		return termsAndConditions_checkBox;
	}
	
	public void enterFirstAndLastName(String firstAndLastName) {
		firstAndLastName_textBox.sendKeys(firstAndLastName);
	}
	
	public void enterEmail(String email) {
		emailAddress_textBox.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		password_textBox.sendKeys(password);
	}
	
	public void clickSignUp() {
		signUp_button.click();
	}
}
