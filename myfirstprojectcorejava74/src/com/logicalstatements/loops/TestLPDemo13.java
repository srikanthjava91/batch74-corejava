package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Reverse number of a given number ..?
//Q) WAP to print the Given is number is Palindrome or not ..? 
//input --> 345
//output --> 543 
public class TestLPDemo13 {

	static int reverseNumber(int n) {
		int rn = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// 123 % 10 --> 3, 12%10 --> 2, 1% 10 --> 1
			n = n / 10;// 123/10 --> 12 , 12/10 --> 1 1/10 --> 0
			rn = rn * 10 + r;// 3*10 + 2 --> 32*10 --> 320 + 1 = 321
		}

		return rn;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 123

		int reverseNumber = reverseNumber(n);
		System.out.println("Reverse number of a Given numbe r: " + reverseNumber);
		
		if(reverseNumber == n) {
			System.out.println("The Given number is Palindrome !!");
		}else {
			System.out.println("The Given number is not a Palindrome !");
		}

		System.out.println("main method ended ");
	}
}
