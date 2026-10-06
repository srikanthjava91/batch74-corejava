package com.exceptionhandling;

import java.util.Scanner;

//try catch finally 
public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Resource leak: 'sc' is never closed
//		finally block executes always whether there is a problem or not in try.
//		Like to close resources or connection related to avoid memory leaks.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		try {
			System.out.println("in try ");
			System.out.println(10 / n);
		} catch (Exception e) {
			System.out.println("in catch ");
		} finally {
			System.out.println("in finally ");
			sc.close();
		}

		System.out.println("main method ended ");
	}

}
