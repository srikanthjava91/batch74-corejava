package com.oops01.inheritance;

class TestB1 {

	TestB1() {

		System.out.println("TestB1 constructor called ");
	}

}

class TestB2 extends TestB1 {
	TestB2() {
		super();
		System.out.println("TestB2 constructor called ");

	}

}

class TestB3 extends TestB2 {

	TestB3() {
		super();
		System.out.println("TestB3 constructor called ");
	}

}

public class TestInhDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestB3 t = new TestB3();

		System.out.println("main method eneded ");

	}

}
