package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
//		System.out.println(10 / 0);// AE
		System.out.println(10 / 0.0);//Infinity
		System.out.println(0.0 / 0.0);// NaN
//		System.out.println(0 / 0);//AE
		System.out.println(0.0 / 0);// NaN
		System.out.println(10.5 / 0);//Infinity

		System.out.println(10 % 0);
		System.out.println("main method ended ");
	}

}
