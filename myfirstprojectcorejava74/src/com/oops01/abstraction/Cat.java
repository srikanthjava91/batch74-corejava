package com.oops01.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat sounds like Meow Meow !!");
	}

	@Override
	public void walk() {
		System.out.println("Cat walk came frm Cat only !!");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat !!");
	}

}
