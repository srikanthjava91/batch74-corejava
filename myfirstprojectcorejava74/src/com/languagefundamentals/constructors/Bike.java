package com.languagefundamentals.constructors;

public class Bike {

	String brand;
	String model;
	String color;
	double price;

	Bike() {
		this("Vcube");
		System.out.println("No arg constructor called ");
	}

	Bike(String brand) {
		this(brand, "unknown");
		System.out.println("one arg constructor called !");
	}

	Bike(String brand, String model) {
		this(brand, model, 100000.00);
		System.out.println("Two arg constructor called !");
	}

	Bike(String brand, String model, double price) {
		this(brand, model, price, "Unknown");
		System.out.println("Three arg constructor called ");
	}

	Bike(String brand, String model, double price, String color) {
		System.out.println("Four arg constructor called ");
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;

	}

	public static void main(String[] args) {
		System.out.println("Bike main method started ");

		Bike b = new Bike();
		b.bikeInfo();

		Bike b1 = new Bike("Royel Enfield");
		b1.bikeInfo();
//
		Bike b2 = new Bike("Yamaha", "FZ-S");
		b2.bikeInfo();
//
		Bike b3 = new Bike("Bajaj", "N250", 200000.00);
		b3.bikeInfo();
//
		Bike b4 = new Bike("Jawa", "SD", 200000.00, "Green");
		b4.bikeInfo();

		System.out.println("Bike main method ended ");
	}

	void bikeInfo() {
		System.out.println("********************************************");
		System.out.println("Brand of the Bike :  " + brand);
		System.out.println("Model of the Bike :  " + model);
		System.out.println("Price of the Bike :  " + price);
		System.out.println("Color of the Bike :  " + color);
		System.out.println("********************************************");

	}
}
