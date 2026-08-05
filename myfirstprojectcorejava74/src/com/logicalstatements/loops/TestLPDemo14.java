package com.logicalstatements.loops;

import java.util.Scanner;

//232
//WAP to print the Given number is Palindrome or not ..? 
//Palindrome means Given number and the Reverse number is same.
public class TestLPDemo14 {

	static boolean isPalindrome(int n) {
		boolean flag = false;

		int temp = n;
		int rev = 0;
		int r = 0;

//		while (n > 0) {
//			r = n % 10;// 2 3 2
//			n = n / 10;// 23 2 0
//			rev = rev * 10 + r;// 232
//
//		}

		rev = TestLPDemo13.reverseNumber(n);
		if (temp == rev) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isPalindrome(n);

		if (status) {
			System.out.println("The Given nunber is palindrome");
		} else {
			System.out.println("The Given nunber is not palindrome");
		}

		System.out.println("main method ended ");
	}
}
