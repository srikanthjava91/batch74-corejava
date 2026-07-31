package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of a Given number using recursion ..? 
//5 
public class TestLPDemo7 {

	static int fact(int n) {

		if (n == 1 || n == 0) {
			return 1;
		}
		return fact(n - 1) * n;
	}

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 5

		int fact = fact(n);

		System.out.println("Factorial of a Given number : " + fact);

	}
}
