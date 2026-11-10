package com.multithreading;

class Jthread1 extends Thread {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("j1 : " + i);
			sum = sum + i;
		}

		System.out.println("sum of J1: " + sum);
	}

}

class Jthread2 extends Thread {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			System.out.println("j2 : " + i);
			sum = sum + i;
		}
		System.out.println("sum of J2: " + sum);
	}

}

class Jthread3 extends Thread {

	Jthread2 t2;

	Jthread3(Jthread2 t2) {
		this.t2 = t2;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 100; i <= 150; i++) {

			if (i == 115) {
				try {
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("j3 : " + i);
			sum = sum + i;

		}

		System.out.println("sum of J3: " + sum);
	}

}

public class TestThreadDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Jthread1 j1 = new Jthread1();
		Jthread2 j2 = new Jthread2();
		Jthread3 j3 = new Jthread3(j2);

		j1.start();
		j2.start();
		j3.start();
		System.out.println("main method ended");

	}

}
