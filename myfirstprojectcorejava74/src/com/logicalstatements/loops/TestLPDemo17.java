package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to convert Decimal number to Binary number ..? 
//input : 10 -->16 8  4 2 1
//                 1  0 1 0 
//output : 1010 

//input : 20 
//output : 10100 
public class TestLPDemo17 {

	void convertDecimalToBinary(int n) {
		int r = 0;
		String bin = "";

		while (n > 0) {
			r = n % 2;// 10%2 = 0,5%2=1,2%2 = 0,1%2 = 1
			n = n / 2;// 5, 5/2=2,2/2= 1, 1/2 = 0

//			Concatenation 
			bin = r + bin;// 1010

		}

		System.out.println("The Binary value of a Given number is : " + bin);
	}

	void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nuber : ");
		int n = sc.nextInt();// 10

		convertDecimalToBinary(n);

		System.out.println("main method ended !!");

	}

}
