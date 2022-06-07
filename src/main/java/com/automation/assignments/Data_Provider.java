package com.automation.assignments;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	
//	@Test(dataProvider = "getData")
//	public void carDetails(String make, String model, int year, int mileage) {
//		
//	}
	

	@DataProvider
	public Object[][] vehicleData(Method name){
		System.out.println("Test case which has this method is: " + name.getName());
		
		Object[][] data = new Object[4][4];
		
		data[0][0] = "Honda";
		data[0][1] = "Civic";
		data[0][2] = 2020;
		data[0][3] = 55000;
		
		data[1][0] = "Toyota";
		data[1][1] = "Camry";
		data[1][2] = 2022;
		data[1][3] = 65000;
		
		data[2][0] = "Honda";
		data[2][1] = "Accord";
		data[2][2] = 2010;
		data[2][3] = 155000;
		
		data[3][0] = "Nissan";
		data[3][1] = "Sentra";
		data[3][2] = 2021;
		data[3][3] = 35000;
		

		return data;
	}
	
	@DataProvider
	public Object[][] userData(Method name){
		
		System.out.println("Test case which has this method is: " + name.getName());
		
		Object[][] data = new Object[4][4];
		
		data[0][0] = "User1";
		data[0][1] = "Browser";
		data[0][2] = 34567;
		data[0][3] = 111;
		
		data[1][0] = "User2";
		data[1][1] = "Firefox";
		data[1][2] = 98748;
		data[1][3] = 222;
		
		data[2][0] = "User3";
		data[2][1] = "Edge";
		data[2][2] = 78542;
		data[2][3] = 333;
		
		data[3][0] = "User4";
		data[3][1] = "Safari";
		data[3][2] = 45642;
		data[3][3] = 444;
		
		return data;
	}


}
