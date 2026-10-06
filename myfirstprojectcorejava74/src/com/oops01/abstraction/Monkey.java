package com.oops01.abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("Monkey sounds like shikwkkgsjslkkjgyw  !!");

	}

	@Override
	public void walk() {
		System.out.println("Monkey can walk and also jumps ");
	}

	@Override
	public void eat() {
		System.out.println("Monkey mostly east Bananas !!");
	}

	// Default methods are allowed only in interfaces.
	@Override
	public void run() {
		System.out.println("Monkey not only runs and also can Jump like anything !!");
	}

}
