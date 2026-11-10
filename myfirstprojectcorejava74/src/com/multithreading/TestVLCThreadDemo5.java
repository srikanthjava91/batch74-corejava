package com.multithreading;

class AudioThread extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Audio");
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Audio : " + Thread.currentThread().getName());
		System.out.println("Audio : " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio**** : " + i);
		}
	}

}

class VideoThread extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("Video");
		Thread.currentThread().setPriority(5);
		System.out.println("Video : " + Thread.currentThread().getName());
		System.out.println("Video : " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Video : " + i);
		}
	}

}

class TimerThread extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Timer");
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Timer : " + Thread.currentThread().getName());
		System.out.println("Timer : " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Timer : " + i);
		}
	}

}

public class TestVLCThreadDemo5 {

	public static void main(String[] args) {
		System.out.println("mian method started ");
		System.out.println("main : " + Thread.currentThread());
		AudioThread at = new AudioThread();
		at.setDaemon(true);
		System.out.println(at.isDaemon());
		VideoThread vt = new VideoThread();
//		TimerThread tt = new TimerThread();

		at.start();
		vt.start();
//		tt.start();
		System.out.println("mian method ended ");
	}

}
