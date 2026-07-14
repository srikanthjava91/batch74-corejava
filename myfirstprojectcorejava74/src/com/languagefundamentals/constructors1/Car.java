package com.languagefundamentals.constructors1;

class Vehicle {

	String model;
	String brand;
	double price;

	Vehicle() {
		System.out.println("No arg constructor called from Vehicle ");
	}

	public Vehicle(String model, String brand, double price) {
		System.out.println("Parameterized constructor called from vechicle ");
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

}

public class Car extends Vehicle {

//	/Implicit super constructor Vehicle() is undefined. Must explicitly invoke another constructor
	Car() {
		
		System.out.println("No arg constructor called from Car ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Car c = new Car();

		System.out.println("main method ended ");
	}

}
