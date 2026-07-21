package com.operators01;

//6) Bitwise Operators 		
//& | ^ ~ 
public class TestBitwiseOpDemo1 {

	public static void main(String[] args) {

		System.out.println("***** Bitwise And *********");
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false

		System.out.println("-------------ex 1 & 0's ----------");
		System.out.println(1 & 1);// 1
		System.out.println(1 & 0);// 0
		System.out.println(0 & 1);// 0
		System.out.println(0 & 0);// 0
		System.out.println("-------------numbers ----------");
		System.out.println(87 & 49);
		System.out.println(69 & 28);// 4
		System.out.println(97 & 43);// 33
		System.out.println(65 & 27);// 1

		System.out.println("***** Bitwise OR *********");
		System.out.println(true | true); // true
		System.out.println(true | false);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false

		System.out.println(87 | 49);
		System.out.println(69 | 28);// 93
		System.out.println(97 | 43);// 107
		System.out.println(65 | 27);// 91

		System.out.println("***** Bitwise XOR *********");
		System.out.println(true ^ true); // false--> 1^1 = 0
		System.out.println(true ^ false);// true --> 1 ^ 0 = 1
		System.out.println(false ^ true);// true --> 0 ^ 1 = 1
		System.out.println(false ^ false);// false --> 0 ^ 0 = 0

		System.out.println(87 ^ 49);// 102
		System.out.println(69 ^ 28);// 89
		System.out.println(97 ^ 43);// 74
		System.out.println(65 ^ 27);// 90

		System.out.println("Biwise Tilt ~");
		System.out.println(~9); // -(n+1)
		System.out.println(~78); // -(n+1)
		System.out.println(~(-10));
	}

}
