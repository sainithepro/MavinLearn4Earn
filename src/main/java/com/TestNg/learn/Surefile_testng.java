package com.TestNg.learn;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Surefile_testng {
	
	@Test
	public void passingTest() {
		System.out.println("This test should pass");
	}
	
	@Test
	public void testingSurefire() {
	System.out.println("This is the 2nd test, which should be passing now");
	}

}
