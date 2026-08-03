package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print 0 to 100 prime number ..?
//A prime number is a natural number greater than 1 that has exactly 
//two distinct positive divisors: 1 and itself. This means that a prime number cannot be divided evenly by any other number except for 1 and the number itself. For example, 2, 3, 5, 7, and 11 are all prime numbers because they can only be divided by 1 and themselves 
public class TestLPDemo9 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want print ");
		int n = sc.nextInt();// 100

		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}

		}

		System.out.println("main method ended ");
	}

}
