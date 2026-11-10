package com.multithreading;

public class TestThreadDemo3 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestThreadDemo3 t = new TestThreadDemo3();
		t.start();
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended ");
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}
	}
}
