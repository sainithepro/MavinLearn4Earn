package com.oops.polymorphism;

public class Static_Polymorphism {

	public static void main(String[] args) {
		Static_Polymorphism sp = new Static_Polymorphism();
		sp.show();
		sp.show(5,6);
		sp.show(5);

	}
	
	public void show() {
		System.out.println("This is a method without param");
	}
	
	public void show(int i) {
		System.out.println("This is a method with 1 param");
	}
	
	public void show(int i, int j) {
		System.out.println("This is a method with 2 param");
	}

}
