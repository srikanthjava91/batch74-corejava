package com.exceptionhandling;

public class TestExDemo11 {

	public static void main(String[] args) {

		System.out.println("main method started");
		try {
			System.out.println("in try-2");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("in catch-2");

			try {
				System.out.println("in try 3");
				System.out.println(10 / 0);
				
			} catch (Exception e1) {
				System.out.println("in catch 3");
			}

		} finally {
			
			try {
				System.out.println("in try 3");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("in catch 3");
			}
			
			System.out.println("in finally-2");
		}

		System.out.println("main method ended");
	}

}
