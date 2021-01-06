package com.pyxissocial.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pyxissocial.automation.common.BaseTest;
import com.pyxissocial.automation.pageobjects.HomePage;
import com.pyxissocial.automation.pageobjects.LoginPage;
import com.pyxissocial.automation.pageobjects.RegistrationPage;
import com.pyxissocial.automation.util.StringUtil;

public class RegistrationTest extends BaseTest {
	WebDriver driver;

	@BeforeTest
	public void preCondition() {
		driver = setUp();
	}
	
	@Test
	public void userRegistrationTest() {
		LoginPage loginPage = new LoginPage(driver);
		RegistrationPage registrationPage = new RegistrationPage(driver);
		HomePage homePage = new HomePage(driver);
		String user= StringUtil.getRandomString(7);
		
		String email = user+"@gmail.com";

		String password = StringUtil.getRandomString(7);
		
		loginPage.clickRegistrationLink();
		
		registrationPage.enterFirstAndLastName(user);
		registrationPage.enterEmail(email);
		registrationPage.enterPassword(password);
		
		WebElement checkbox = registrationPage.gettermsAndConditionCheckBox();
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click()", checkbox);
		registrationPage.clickSignUp();

		Assert.assertEquals(homePage.getWelcomeHeader().getText(), email);
	}
}
