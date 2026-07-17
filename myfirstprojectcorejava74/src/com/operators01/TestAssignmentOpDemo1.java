package com.operators01;

//Assignment Operators 
//= += -= *= /= %= 
public class TestAssignmentOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int result = 10;

//		Type mismatch: cannot convert from double to int
//		result = result + 4.5;
//		result = (int) (result + 4.5);//We can do with Type Casting.
		result += 4.5;// Narrowing

//		Type mismatch: cannot convert from double to int
//		result = result - 3.5;
		result -= 3.5;// result = result - 3.5;

//		result = result * 2.5;
		result *= 2.5;// result = result * 2.5;//25

//		result = result /3.5;
		result /= 3.5;

//		result = result % 2.5;
		result %= 2.5;

		System.out.println(result);// 6 7 10 11

	}
}
