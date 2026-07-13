package com.languagefundamentals.constructors;

public class Car {

	String model;
	String brand;
	double price;
	int year;
	String color;

	public  Car() {
		System.out.println("no arg constructor called ");
	}

	public Car(String model, String brand, String color) {
		Car c = new Car();
		c.model = model;
		this.brand = brand;
		this.color = color;
	}

	public Car(String model, String brand, double price, int year, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Car c1 = new Car();
		c1.carInfo();

		Car c2 = new Car("Sonet", "KIA", "RED");
		c2.carInfo();

	}

	void carInfo() {
		System.out.println("************Car Info******************");
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Price of the Car : " + price);
		System.out.println("Year of the Car : " + year);
		System.out.println("Color of the Car : " + color);
		System.out.println("******************************");
	}

}
