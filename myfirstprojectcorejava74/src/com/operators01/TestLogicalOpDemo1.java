package com.operators01;

//5) Logical Operators 
//&& || !   --> boolean expressions 

public class TestLogicalOpDemo1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 15;

		System.out.println("*********Logical and ********");
//		System.out.println(10 && 20);//The operator && is undefined for the argument type(s) int, int

		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false --> Dead code
		System.out.println(false && false);// false
		System.out.println("----------------------");
		System.out.println(a < b && b > c && true && true || false);
		System.out.println(a < b && b < c);
		System.out.println(a > b && b > c);
		System.out.println(a > b && b < c);

		System.out.println("***** Logical OR *********");
		System.out.println(true || true); // true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		System.out.println("----------------------");
		System.out.println(a < b || b > c);// true
		System.out.println(a < b || b < c);// true
		System.out.println(a > b || b > c);// true
		System.out.println(a > b || b < c);// false

		System.out.println("***** Logical not *********");

		System.out.println(a > b);// false
		System.out.println(!(a > b));//true

	}

}
