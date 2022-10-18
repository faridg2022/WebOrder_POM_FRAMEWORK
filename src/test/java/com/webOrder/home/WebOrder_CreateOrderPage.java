package com.webOrder.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebOrder_CreateOrderPage {
	
	 WebDriver driver;
	
	public WebOrder_CreateOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
		WebElement product;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
	WebElement quantity;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
	WebElement pricePerUnit;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
	WebElement discount;
	
	@FindBy(xpath = "//input[@value='Calculate']")
	WebElement calculateTotal;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
	WebElement customerName;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
	WebElement street;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
	WebElement city;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
	WebElement state;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
	WebElement sip;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
	WebElement visaCard;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
	WebElement masterCard;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
	WebElement americanEXCard;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
	WebElement cardNumber;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
	WebElement expirationDate;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
	WebElement processButton;
	
	@FindBy(xpath = "//input[@value='Reset']")
	WebElement resetButton;
	@FindBy(xpath = "//h2[normalize-space()='Order']")
	WebElement orderText;
	@FindBy(xpath = "//strong[normalize-space()='New order has been successfully added.']")
	WebElement AddressAddedText;
	
	
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RegularExpressionValidator1")
	WebElement quantityErrorMessage;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator2")
	WebElement customerNameErrorMessage;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator3")
	WebElement streetErrorMessage;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator4")
	WebElement cityErrorMessage;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator5")
	WebElement zipCodeErrorMessage;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_CustomValidator1")
	WebElement cardTypeErrorMessage;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator6")
	WebElement cardNumErrorMessage ;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator7")
	WebElement experationDateErrorMessage ;
	
	
	
	
	
	public void select_product(String productNme) {
		Select productSelection= new Select(product);
		productSelection.selectByVisibleText(productNme);
		
	}
	
	public void enter_quantity(String quanity) {
		quantity.clear();
		quantity.sendKeys(quanity);
	}
	public void enter_quantity_price(String price) {
		pricePerUnit.clear();
		pricePerUnit.sendKeys(price);
	}
	public void enter_discount(String discount_percentage) {
		discount.sendKeys(discount_percentage);
	}
	public void calculate_total() {
		calculateTotal.click();
	}
	public void enter_customer_name(String name) {
		customerName.sendKeys(name);
	}
	public void enter_street(String address) {
		street.sendKeys(address);
	}
	public void enter_city(String yourCity) {
		city.sendKeys(yourCity);
	}
	public void enter_state(String yourState) {
		state.sendKeys(yourState);
	}
	public void enter_zip(String yourZip) {
		sip.sendKeys(yourZip);
	}
	public void selectMasterCard() {
		visaCard.click();
	}
	public void enter_cardNumber(String yourNumber) {
		cardNumber.sendKeys(yourNumber);
	}
	
	public void enter_expiration_date(String date) {
		expirationDate.sendKeys(date);
	}
	public void clickOnSubmit() {
		processButton.click();
	}
	public void verifyOrderText() {
		orderText.isDisplayed();
	}
	public void verifyIfAddressAdded() {
		AddressAddedText.isDisplayed();
	}
	
	
	public void verifyErrorMessage(String field,String text) {
		switch(field) {
		
		case "quantityField":
		Assert.assertEquals(quantityErrorMessage.getText(),text);
			
			
		case "customerField":
			Assert.assertEquals(customerNameErrorMessage.getText(),text);
		
		case "streetField":
			Assert.assertEquals(streetErrorMessage.getText(),text);
			
			
//		case "cityField":
//			Assert.assertEquals(cityErrorMessage.getText(),text);
//			
//			
//		case "zipcodeField":
//			Assert.assertEquals(zipCodeErrorMessage.getText(),text);
//			
			
//		case "cardTypeField":
//			Assert.assertEquals(cardTypeErrorMessage.getText(),text);
		
//			
//		case "cardNumField":
//			Assert.assertEquals(cardNumErrorMessage.getText(),text);
//			
//			
//		case "experationDateField":
//			Assert.assertEquals(experationDateErrorMessage.getText(),text);
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	

}
