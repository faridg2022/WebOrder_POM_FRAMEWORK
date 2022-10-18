package com.webOrder.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrder_BasePage {
private WebDriver driver;
	
	@FindBy(id = "ctl00_MainContent_username")
	WebElement txtUsername;

	@FindBy(id = "ctl00_MainContent_password")
	WebElement txtPassword;

	@FindBy(id = "ctl00_MainContent_login_button")
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	WebElement lnLogout;
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebOrder_BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Sign in functionality
	public WebOrder_BasePage GoToHomePageAndSignIn(String username, String passwd) throws Exception {
		return signInToWebOrder(username, passwd);
	}

	public WebOrder_BasePage signInToWebOrder(String username, String passwd) {
		enterUserName(username);
		enterPassword(passwd);
		submitButton();
		return new WebOrder_BasePage(driver);
		
	}

	public void enterUserName(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
	}

	public void enterPassword(String passwd) {
		txtPassword.clear();
		txtPassword.sendKeys(passwd);
	}

	public void submitButton() {
		btnLogin.click();
	}
	
	public void logout() throws InterruptedException {

		Thread.sleep(3000);
		lnLogout.click();
		Thread.sleep(3000);

	}

}
