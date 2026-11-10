package com.multithreading;

public class TestThreadDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestThreadDemo1 t = new TestThreadDemo1();
		t.hello();
		t.welcome();

		System.out.println("main method ended ");
	}

	void hello() {
		System.out.println("Hello method called ");
		System.out.println("Hello method called ");
		System.out.println(Thread.currentThread());
	}

	void welcome() {
		System.out.println("welclome method called ");
		System.out.println("Welcome method called ");
		System.out.println(Thread.currentThread());
	}
}
