package com.automation.assignments;

import org.testng.annotations.Test;

public class Using_Data_Provider {

	@Test(dataProviderClass = Data_Provider.class, dataProvider = "vehicleData")
	public void launchUrl(String make, String model, int year, int mileage) {
		
		System.out.println(make +"---"+ model +"---"+ year +"---"+ mileage);
	}
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider = "userData")
	public void getTitle(String user, String Browser, int ssn, int userId) {
		System.out.println(user +"---"+ Browser +"---"+ ssn +"---"+ userId);
	}
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider = "vehicleData")
	public void enterCredentials(String make, String model, int year, int mileage) {
		System.out.println(make +"---"+ model +"---"+ year +"---"+ mileage);
	}
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider = "userData")
	public void logOut(String user, String Browser, int ssn, int userId) {
		System.out.println(user +"---"+ Browser +"---"+ ssn +"---"+ userId);
	}
}
