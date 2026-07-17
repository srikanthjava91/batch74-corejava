package com.operators01;

//+ - ++ -- : Pre and Post 
public class TestUnaryOpDemo1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		// Unary plus
		System.out.println(+a);

		// Unary Minus
		System.out.println(-b);

		// Post Increment
		System.out.println(a++);// a = a + 1 // 10 --> 11

		// Pre Increment
		System.out.println(++b);// b = b + 1//6 

		// Post decrement
		System.out.println(a--);// a = a-1 --> 11 --> 10 

		// Pre-Decrement
		System.out.println(--b);// b = b-1 --> 5 
		
		System.out.println("A value : " + a);
		System.out.println("B value : " + b);

	}

}
