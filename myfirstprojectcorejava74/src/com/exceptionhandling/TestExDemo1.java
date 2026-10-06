package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//No exception of type Object can be thrown; 
//an exception type must be a subclass of Throwable
public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter a number  : ");
			int a = sc.nextInt();

			System.out.println("Enter another number :");
			int b = sc.nextInt();

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("in catch");
			e.printStackTrace();// Prints this throwable and its backtrace to the standard error stream
		} catch (InputMismatchException e) {
			e.printStackTrace();// Prints this throwable and its backtrace to the standard error stream
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
	}
}
