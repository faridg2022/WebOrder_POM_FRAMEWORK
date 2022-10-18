package com.webOrder.utils;

import org.testng.annotations.DataProvider;

public class WebOrder_TestData {

	@DataProvider (name = "login")
	public Object [][] login(){
		return new Object[][] {
			{"Tester","test","ScreenSaver","","100","10","","10 john","brooklyn","new york","10012","14253743883","12/23",
			"Quantity must be greater than zero.","Field 'Customer name' cannot be empty"," Field 'Street' cannot be empty","Field 'City' cannot be empty.",
			"Field 'Zip' cannot be empty.","Select a card type.","Field 'Card Nr' cannot be empty.","Field 'Expire date' cannot be empty."},
		};
	}
	

}

