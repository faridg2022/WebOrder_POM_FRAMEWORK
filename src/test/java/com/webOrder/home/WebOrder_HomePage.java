package com.webOrder.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrder_HomePage {
	WebDriver driver;
	
	public WebOrder_HomePage(WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "View all orders")
	    WebElement lnVieuAllOrders;
    
	@FindBy(linkText = "View all products")
	    WebElement lnviewAllProducts;
	
	@FindBy(linkText = "Order")
	   WebElement lnOrder;
	
	@FindBy(xpath = "//h1[normalize-space()='Web Orders']")
	   WebElement divLogo_img;
	
	@FindBy(xpath = "//h2[normalize-space()='List of All Orders']")
	   WebElement txtListOfAllOrders;
	
	@FindBy(xpath = "//div[@class='login_info']")
	WebElement txtWelcome;
	
	@FindBy(linkText = "Logout")
	WebElement InLogout;
	
	@FindBy(linkText = "Check All")
	WebElement CheckAll;
	
	@FindBy(linkText = "Uncheck All")
	WebElement UncheckAll;
	
	@FindBy(xpath = "//input[@id='ctl00_MainContent_btnDelete']")
	WebElement DeleteSelected;
	
	
	
  
	
	public void VieuAllOrders() {
		lnVieuAllOrders.click();
	}
	
	public void lnviewAllProducts() {
		lnviewAllProducts.click();
	}
	
	public void OrderButton() {
		lnOrder.click();
	}
	
	public void LogoPresent() {
		divLogo_img.isDisplayed();
	}
	
	public void ListOfAllOrders() {
		txtListOfAllOrders.isDisplayed();
	}
	
	public void LogoutButton() { //should return?
		InLogout.click();
		
	}
	
	public void CheckAllButton() { //should return?
		CheckAll.click();
	}
	
	public void uncheckButton() {
		UncheckAll.clear();
	}
	
	public void DeleteSelectedButton() {
		DeleteSelected.click();
	}

}
