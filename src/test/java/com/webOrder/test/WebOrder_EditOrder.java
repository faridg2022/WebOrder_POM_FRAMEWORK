package com.webOrder.test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.common.WebOrder_BasePage;
import com.webOrder.common.WebOrder_BaseSetup;
import com.webOrder.home.WebOrder_EditOrderPage;
import com.webOrder.home.WebOrder_HomePage;
import com.webOrder.home.WebOrder_VerifyListOffOrdersPage;

/* This is Edit Order Test Page */

public class WebOrder_EditOrder extends WebOrder_BaseSetup {

	WebOrder_BasePage basePage;
	WebOrder_BaseSetup baseSetup;
	WebOrder_HomePage homePage;
	WebOrder_EditOrderPage editOrder;
	WebOrder_VerifyListOffOrdersPage verifyOrders;
	
	private WebDriver driver;
	

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new WebOrder_BasePage(driver);
		homePage = new WebOrder_HomePage(driver);
		verifyOrders = new WebOrder_VerifyListOffOrdersPage(driver);
		editOrder = new WebOrder_EditOrderPage(driver);
		
	}

	@Test(description = "Edit Order Customer Name", priority = 1)
	public void editOrderCustomerName() throws Exception {
		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		
		basePage.GoToHomePageAndSignIn("Tester", "test");
		Thread.sleep(2000);
		homePage.ListOfAllOrders();
		Thread.sleep(2000);
		verifyOrders.clickOneditOrderButton();
		Thread.sleep(2000);
		editOrder.editcustname("Vandana Test Edit");
		Thread.sleep(2000);
		editOrder.clickupdatebutton();
	
		
	}
	
	
}
