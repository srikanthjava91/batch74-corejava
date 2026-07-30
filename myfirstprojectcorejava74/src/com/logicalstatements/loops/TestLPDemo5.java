package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to Print sum of Digits..? 
//input : 123 --> output = 6
//input : 4567 --> output = 22

//123 % 10 --> 3(r) --> 12(q) 
//12 % 10 --> 2(r) --> 1(q)
//1 % 10 --> 1(r)  --> 0(q)

public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();// 123
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// 123 % 10 --> 3, 12%10 --> 2, 1%10 --> 1
			n = n / 10;// 123/10 --> 12, 12/10 --> 1,1/10 -->0
			sum = sum + r;
		}

		System.out.println("sum of all the digists is : " + sum);
		sc.close();

	}

}
