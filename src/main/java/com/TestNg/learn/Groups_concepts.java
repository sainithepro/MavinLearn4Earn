package com.TestNg.learn;

import org.testng.annotations.Test;

public class Groups_concepts {
	
	@Test(groups = {"smoke"})
	public void tc1() {
		
		System.out.println("This is the output for TC1");
		
	}
	
	@Test(groups = {"smoke","sanity"})
	public void tc2() {
		System.out.println("This is the output for TC2");
	}
	
	@Test(groups = {"smoke","sanity", "regression"})
	public void tc3() {
		System.out.println("This is the output for TC3");
	}
	
	@Test(groups = {"sanity"})
	public void tc4() {
		System.out.println("This is the output for TC4");
	}
	
	@Test(groups = {"regression"})
	public void tc5() {
		System.out.println("This is the output for TC5");
	}

}
