package com.operators01;

//WAP to swap the variables using third variable (temp).
//WAP to swap the variables without using third variable.
//WAP to swap the variables using Bitwise operators.
public class TestSwapDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 10;
		int b = 20;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("A value is : " + a);// 10 --> 20
		System.out.println("B value is : " + b);// 20 --> 10
	}
}
