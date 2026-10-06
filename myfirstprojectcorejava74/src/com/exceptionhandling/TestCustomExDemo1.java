package com.exceptionhandling;

import java.util.Scanner;

public class TestCustomExDemo1 {

	static void hello() throws Exception {
		System.out.println("hello ");
	}

	public static void main(String[] args) throws Exception {

		System.out.println("main method tarte d");

		hello();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter your age");
			int age = sc.nextInt();

			if (age > 18) {
				System.out.println("You are eligible for Paradise movie");
				System.out.println("You are eligible for Driving or Voting ");
			} else {
				throw new ChariException("Babu niku inka time undi ra !!");
			}
		}
	}

}
