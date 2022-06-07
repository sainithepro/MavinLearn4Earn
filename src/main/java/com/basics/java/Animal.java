package com.basics.java;

public class Animal {

	String color = "blue";
	int age = 9;

	public static void main(String[] args) {

		Birds birdRef = new Birds();
		Vehicle vehicleRef = new Vehicle();
		
		Birds newRef = new Birds();
		
		birdRef.chirping();
		birdRef.flying();
		newRef.chirping();
		
		
		vehicleRef.brakesApplied();
		vehicleRef.enigneStart();
		
		

//		barking();
//		Animal.barking();
//
//		Animal newAnimal = new Animal();
//
//		newAnimal.guarding();
//
//		newAnimal.color = "black";
//
//		System.out.println(newAnimal.color);
//
//		newAnimal.sleeping("Pink", 3);

	}

	public static void barking() {
		System.out.println("new animal is barking");
	}

	public void sleeping(String c, int a) {
		color = c;
		age = a;
		System.out.println("new animal is sleeping with color : " + color + " and age : " + age);
	}

	public void guarding() {
		System.out.println("new animal is guarding the house");
	}

}

class Birds {
	public void flying() {
		System.out.println("Bird flied");
	}

	public void chirping() {
		System.out.println("Birds are chirping");
	}
}

class Vehicle {
	
	public void enigneStart() {
		System.out.println("Engine is starting");
	}

	public void brakesApplied() {
		System.out.println("Brakes are being applied");
	}

}
