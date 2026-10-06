package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number as String ");
			String str = sc.next();
			int i = Integer.parseInt(str);// Convert to String to int
			System.out.println(i * 10);
		} catch (NumberFormatException ne) {
			System.err.println(ne.toString());
		}

		System.out.println("main method ended ");
	}

}
