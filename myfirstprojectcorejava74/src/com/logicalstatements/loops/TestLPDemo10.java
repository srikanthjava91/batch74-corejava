package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Whether the Given number is Prime or not ..? 
public class TestLPDemo10 {

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		boolean flag = isPrime(a);

		if (flag) {
			System.out.println("The Given number is Prime number : ");
		} else {
			System.out.println("The Given number is not Prime number : ");
		}

	}

}
