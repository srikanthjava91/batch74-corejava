package com.languagefundamentals.methods;

//Arithmetic Operators : + - * / % 
//ii) no return type + arguments 
//Calculator
//WAP 
//	- to print Multiplication value with the method below -- >multiplication --> *
//ex: multiplication(byte b, short s, int i, long l, double d, float f )
//	 - to print Quotient take float f1, float f2 --> 100/5 = 20 (division / --> quotient )
//   - to print Reminder take double d1, int i1  --> 97%7 =  6 (modulus % --> reminder)


public class TestDemo2 {

	void addition() {
		System.out.println("addition with no args");
	}

	void addition(int a, int b) {
		System.out.println("addition with int args ");
		int sum = a + b;
		System.out.println("Sum of two numbers : " + sum);
	}

	void subtraction(float f, double d) {
		System.out.println("subtraction called with float & double");

		double diff = d - f;

		System.out.println("difference of two numbers : " + diff);// 100.0
	}

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		TestDemo2 t2 = new TestDemo2();

		// calling the method with no argument
		t2.addition();

		// Calling the method with int args
		t2.addition(10, 20);

		t2.subtraction(100.5F, 200.9);

		System.out.println("main method ended ");
	}

}
