package com.logicalstatements.loops;

import java.util.Scanner;

//Math table for a Given number : 
//input 9
//output should be 
//9 X 1 = 9 
//9 X 2 = 18 
//9 X 3 = 27
//9 X 4 = 36
//9 X 5 = 45
//9 X 6 = 54
//9 X 7 = 63
//9 X 8 = 72
//9 X 9 = 81
//9 X 10 = 90
public class TestLPDemo11 {

	public static void main(String[] args) {

		System.out.println("Math table for a Given numbe r: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Math table ");
		int n = sc.nextInt();
		
		System.out.println("Enter a number for How times to print  ");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}

}
