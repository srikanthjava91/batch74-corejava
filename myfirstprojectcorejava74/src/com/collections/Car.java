package com.collections;

public class Car {

	String model;
	String brand;
	String color;
	int year;
	double price;
	
	

//	@Override
//	public String toString() {
//
//		return "Car Info [Model -  " + model 
//					+ " | Brand -  " + brand
//					+ " | Color -  " + color
//					+ " | Year -  " + year
//					+ " | Price -  " + price;
//		 
//	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", color=" + color + ", year=" + year + ", price=" + price
				+ "]";
	}



	public Car(String model, String brand, String color, int year, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.year = year;
		this.price = price;
	}

}
