package com.multithreading;

public class TestThreadDemo5 extends Thread {

	@Override
	public void run(){

		for (int i = 0; i <= 5; i++) {
			System.out.println("run  : " + Thread.currentThread().getName() + " -> " + i);
//			Thread.yield();
//			Thread.sleep(1000);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestThreadDemo5 t = new TestThreadDemo5();

		t.start();
		t.interrupt();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main  : " + Thread.currentThread().getName() + " -> " + i);
		}

		System.out.println("main method ended ");
	}

}
