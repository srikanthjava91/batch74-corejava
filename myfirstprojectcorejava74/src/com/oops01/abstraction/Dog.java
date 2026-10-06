package com.oops01.abstraction;

//Implemented class from Animal interface 
public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow bow !!");
	}

	@Override
	public void eat() {
		System.out.println("Dog mostly eats Non-veg !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and also run like anything !!");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog mostly Sleep in the morning !! and helps at Nights ");
	}

}
