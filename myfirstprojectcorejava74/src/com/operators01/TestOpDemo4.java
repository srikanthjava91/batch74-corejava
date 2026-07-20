package com.operators01;

//4) Comparison Operators will give the resulted values are boolean expressions like true or false
//==  < <=    > >= !=
public class TestOpDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int x = 10;
		int y = 9;

		System.out.println(x == y++);

		int a = 10;
		int b = 5;
		int c = 10;

		System.out.println(a < b);// false
		System.out.println(a <= c);// true

		System.out.println(a > b);// true
		System.out.println(a > c);// false
		System.out.println(a >= c); // true
		System.out.println("************************");
		System.out.println(a != c);// false

	}

}
