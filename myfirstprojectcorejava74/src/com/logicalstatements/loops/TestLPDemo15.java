package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find digit count of a Given number ..? 
public class TestLPDemo15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 4567 --> 4
		int count = 0;
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;// 456, 45, 4, 0
			count++;
		}
		System.out.println("count is : " + count);
		System.out.println("Sum is : " + sum);
	}
}
