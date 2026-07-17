package com.operators01;

//1) Arithmetic Operators : 
//	+ - * / % 
//BODMAS : 
public class TestAirthmeticOperatorsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 97;
		int b = 7;

		double d = 10.5;
		float f = 5.9F;
//		Note : String + Anything is String only 
		System.out.println("sum of the two numbers : " + (d + f));// Addition 10.5 5.9
//		CE : The operator - is undefined for the argument type(s) String, float
//		System.out.println("Difference two numbers : " + d-f);
		System.out.println("Difference two numbers : " + (d - f));// Subtraction
		System.out.println("product of two numbers  : " + d * f);// Multiplication
		System.out.println("Quotient of Given numbers : " + a / b);// Division
		System.out.println("Reminder of Two numbers : " + a % b);// Modulus

		System.out.println(2 * 5 + 5 * 2);

		System.out.println(10 / 3 + 15 % 2);
	}
}
