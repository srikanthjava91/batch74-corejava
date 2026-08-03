package com.logicalstatements.loops;

//While Loop example 
public class TestLPDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int n = 10;

		////5<10 --> 1
		///5< 9 --> 2
		///5< 8 --> 3
		///5 < 7 --> 4
		///5< 6 --> 5 
		///5<5 --> false 
//		while (5 < n) {
//			System.out.println("Hello ");
//			n--;// n= n-1 = 9, 8,7,6,5
//		}

		while (9 < n) {
			System.out.println("Hello ");
			n--;
		}

		System.out.println("main method ended ");
	}
}
