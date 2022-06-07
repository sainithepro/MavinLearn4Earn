package com.TestNg.learn;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITTestContext {
	
	@Test(priority = 3)
	public void setUp(ITestContext context) {
		System.out.println("This is setup of our new laptop");
		context.setAttribute("Dictionary", "Words");
		
		System.out.println("***********************");
		String output1 = (String) context.getAttribute("Model");
		System.out.println("The model of my car is: " + output1);
		
	}
	
	@Test(priority = 2, dependsOnMethods = "setUp")
	public void Logic(ITestContext context) {
		System.out.println("This is the logical functioning of our new laptop");
		
		String output = (String) context.getAttribute("Dictionary");
		System.out.println("The dictionary has: " + output);
		
		context.setAttribute("Model", "Honda");
		
		System.out.println("***********************");
	}
	
	@Test(priority = 1, dependsOnMethods = {"setUp","Logic"})
	public void exit(ITestContext context) {
		System.out.println("This is exit of our new Laptop");
		
		String output = (String) context.getAttribute("Dictionary");
		System.out.println("The dictionary has: " + output);
		
		String output1 = (String) context.getAttribute("Model");
		System.out.println("The model of my car is: " + output1);
		
	}

}
