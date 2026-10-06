package com.exceptionhandling;

public class TestExDemo8 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		try {
			System.out.println("in try ");
			System.out.println(10 / 0);
		} finally {
			System.out.println("in finally ");
		}

		System.out.println("main method ended ");
	}

}
