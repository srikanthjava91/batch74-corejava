package com.multithreading;

public class TestThreadDemo2 extends Thread{

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestThreadDemo2 t = new TestThreadDemo2();
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main :" + i);
		}

		System.out.println("main method ended ");

	}

	@Override
	public void run() {
		System.out.println("hello method started ");
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello : " + i);
		}
		System.out.println("hello method ended ");

	}

}
