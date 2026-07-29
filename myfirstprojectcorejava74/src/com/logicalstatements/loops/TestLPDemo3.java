package com.logicalstatements.loops;

import java.util.Scanner;
//A factor is a whole number that divides another number exactly, 
//leaving no remainder, and can also be seen as a number 
//that multiplies with another to produce a given product.

//WAP to print Factors of a Given number.?
//6 = 1 2 3 6 --> 1+ 2+ 3 = 6 
//28 = 1 2 4 7 14 28 = 1+2+ 4+ 7+ 14 = 28
//24 = 1 2 3 4 6 8 12 24 = 1+ 2+3 +4 + 6 + 8 + 12 =   36
//WAP the Given number is Perfect or not ..? true or false
public class TestLPDemo3 {

	static void findFactors(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();// 6
		findFactors(n);
	}
}
