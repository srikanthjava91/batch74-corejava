package com.operators01;

public class TestSwapDemo2 {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

//		a = a + b;// 30
//		b = a - b;// 30-10= 20
//		a = a - b;// 30-20 =10
		
		a = a ^ b;// 30
		b = a ^ b;// 30-10= 20
		a = a ^ b;// 30-20 =10

		System.out.println("A value is : " + a);// 20 --> 10
		System.out.println("B value is : " + b);// 10 --> 20

	}

}
