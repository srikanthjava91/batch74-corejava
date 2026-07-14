package com.languagefundamentals.constructors1;

class Animal {

	String color;
	int age;

	Animal() {
		System.out.println("Animal Default Constructor");
	}

	Animal(String color, int age) {
		System.out.println("Animal Parameterized Constructor");
		this.color = color;
		this.age = age;
	}

	void animalInfo() {
		System.out.println("----------------");
		System.out.println("Color : " + color);
		System.out.println("Age : " + age);
	}
}

public class Dog extends Animal {

	String breed;

	Dog() {
		System.out.println("Dog Default Constructor");
	}

	Dog(String color, int age, String breed) {
		super(color, age);
		System.out.println("Dog Parameterized Constructor");
		this.breed = breed;
	}

	void dogInfo() {
		animalInfo();
		System.out.println("Breed : " + breed);
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Dog d = new Dog("White", 3, "Golden Retriever");
		d.dogInfo();
	}
}
