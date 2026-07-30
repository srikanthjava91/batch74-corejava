package com.logicalstatements.loops;

import java.util.Scanner;

///WAP to print factorial of a Given number using for loop ..?
///input =5 --> output --> 5*4*3*2*1 = 120
///input = 4 --> output --> 4 * 3* 2 *1 = 24 
////input =6 --> output --> 6* 5*4*3*2*1 = 120
public class TestLPDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbe r: ");
		long n = sc.nextLong();
		long fact = findFactorial(n);
		System.out.println("Factorila of a Given numbe r: " + fact);
	}

	private static long findFactorial(long n) {
		long fact = 1;
		for (long i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
