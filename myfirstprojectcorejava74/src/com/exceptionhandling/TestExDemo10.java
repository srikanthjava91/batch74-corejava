package com.exceptionhandling;

//nested try catch finally 
public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try-1");
			try {
				System.out.println("in try-2");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println("in catch-2");
				System.out.println(10 / 0);
			} finally {
				System.out.println("in finally-2");
			}

		} catch (Exception e) {
			System.out.println("in catch-1");
		} finally {
			System.out.println("in finally-1");
		}
		System.out.println("main method ended");
	}
}
