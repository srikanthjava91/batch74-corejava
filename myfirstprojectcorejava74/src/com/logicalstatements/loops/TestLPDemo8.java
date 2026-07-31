package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print 10 Fibonacci series values..? 
// 0 1 1 2 3 5 8 13 21 34 55
public class TestLPDemo8 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.println("How many values you want to print ..? ");
		int n = sc.nextInt();

		System.out.print(n1 + " " + n2);// 0 1
		for (int i = 1; i <= n - 2; i++) {
			n3 = n1 + n2;// 1
			System.out.print(" " + n3);// 1
			n1 = n2;
			n2 = n3;
		}

	}

}
