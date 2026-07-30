package com.logicalstatements.loops;

import java.util.Scanner;

//perfect number means : Sum of factors excluding the given number.
// 6 --> 1 + 2 + 3 = 6 
//Q) WAP to print whether the given number is Perfect or not ..? 
public class TestLPDemo4 {

	static boolean isPerfect(int n) {
		int sum = 0;

		if (n == 1) {
			return true;
		}

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;// 1+2+3 = 6
			}
		}

		if (sum == n) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isPerfect(n);

		if (status) {
			System.out.println("The Given number is Perfect !");
		} else {
			System.out.println("The Given number is not perfect ");
		}
	}

}
