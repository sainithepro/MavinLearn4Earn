package com.oops.java;

public class inheritance_child extends Inheritance_Parent {

	public static void main(String[] args) {
		inheritance_child ic = new inheritance_child();
		ic.car();
		ic.bike();
		ic.money();
		ic.property();
		
	}
	
	public void car() {
		System.out.println("This is child's car");
	}
	
	public void bike() {
		System.out.println("This is child's bike");
	}

}
