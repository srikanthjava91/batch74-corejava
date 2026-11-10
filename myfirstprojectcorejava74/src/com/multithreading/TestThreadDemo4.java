package com.multithreading;

class Test {

}

public class TestThreadDemo4 extends Test implements Runnable {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestThreadDemo4 t = new TestThreadDemo4();
		Thread t1 = new Thread(t);
		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended ");
	}
	
	void run(int a) {
		System.out.println("run method called with int params !");
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}

	}

}
