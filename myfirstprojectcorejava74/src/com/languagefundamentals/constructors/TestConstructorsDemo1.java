package com.languagefundamentals.constructors;

class Vehicle {
	String model = "Nexon";
	String brand = "Tata";
	double price = 1500000.00;

}

class Car1 extends Vehicle {

	String model = "Seltos";
	String brand = "Kia";
	double price = 1900000.00;

	void show() {
		System.out.println("Show method called ");
		System.out.println("Brand of the Car : " + super.brand);
		System.out.println("Model of the Car : " + super.model);
		System.out.println("Price of the Car : " + super.price);
	}

	void carInfo() {
		System.out.println("Show method called ");
		System.out.println("Brand of the Car : " + this.brand);
		System.out.println("Model of the Car : " + this.model);
		System.out.println("Price of the Car : " + this.price);
	}

}

//Driver class 
public class TestConstructorsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Car1 c1 = new Car1();
		c1.show();
		c1.carInfo();

		System.out.println("main method ended ");
	}

}
