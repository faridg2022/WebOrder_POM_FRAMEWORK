package com.webOrder.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.common.WebOrder_BasePage;
import com.webOrder.common.WebOrder_BaseSetup;
import com.webOrder.home.WebOrder_CreateOrderPage;
import com.webOrder.home.WebOrder_HomePage;
import com.webOrder.utils.WebOrder_TestData;

public class Weborder_create extends WebOrder_BaseSetup{

	

	WebOrder_BasePage basePage ;                                         
	WebOrder_BaseSetup baseSetup;
	WebOrder_CreateOrderPage createOrder;
	WebOrder_HomePage homePage;
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new WebOrder_BasePage(driver);
		homePage = new 	WebOrder_HomePage(driver);
		createOrder = new WebOrder_CreateOrderPage(driver);
	}
	
	@Test(dataProvider = "login", dataProviderClass =  WebOrder_TestData.class)
	public void createOrder(String uName,String Pword,String product, String quantity,
			String priceUnit, String discount, String name, String address,String city,
			String state,String zip,String cardNum,String experation,String quantityText,
			String nameText, String streetText, String cityText, String zipText, String cardText,
			String cardNumText, String exDateText) throws Exception {
		
		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		basePage.GoToHomePageAndSignIn(uName, Pword);
		
		homePage.OrderButton();
		
		createOrder.verifyOrderText();
		
		createOrder.select_product(product);
		
		createOrder.enter_quantity(quantity);
		
		createOrder.enter_quantity_price(priceUnit);
		
		createOrder.enter_discount(discount);
	
		createOrder.calculate_total();
		
		createOrder.enter_customer_name(name);
		
		createOrder.enter_street(address);
		
		createOrder.enter_city(city);
		
		createOrder.enter_state(state);
	
		createOrder.enter_zip(zip);
	
		createOrder.selectMasterCard();
		
		createOrder.enter_cardNumber(cardNum);
		
		createOrder.enter_expiration_date(experation);
		
		createOrder.clickOnSubmit();
		Thread.sleep(2000);
		
		if(quantity=="" || name =="" || address =="" || city =="" || zip=="" || cardNum =="" || experation=="") {
//			createOrder.verifyErrorMessage("quantityField",quantityText);
//			createOrder.verifyErrorMessage("customerField",nameText);
		
		}
		
		if(quantity =="") {
			createOrder.verifyErrorMessage("quantityField",quantityText);
		}
		
		if(name =="") {
			createOrder.verifyErrorMessage("field",nameText);
		}
//			if(name ==""){
//			createOrder.verifyErrorMessage("customerField",nameText);
//		
//		}
//		if(address==null) {
//			createOrder.verifyErrorMessage("streetField",streetText);
//			
//		}
//			if(city==null) {
//			createOrder.verifyErrorMessage("cityField",cityText);
//		}if(zip==null) {
//			createOrder.verifyErrorMessage("zipcodeField",zipText);
//		}
//	if(cardNum==null) {
//			createOrder.verifyErrorMessage("cardNumField",cardNumText);
//		}
//	if(experation==null) {
//			createOrder.verifyErrorMessage("experationDateField",nameText);
//		}
//			
		
		
		
//		
//		
//		
//		
//		createOrder.verifyErrorMessage("cardTypeField",cardText);
//		
//		createOrder.verifyErrorMessage("experationDateField",nameText);
		
		
		Thread.sleep(2000);
		
//		createOrder.verifyIfAddressAdded();
		
	}

}
