package com.exceptionhandling;

//Whenever we keep parent exception first.
//CE : Unreachable catch block for ArithmeticException. 
//It is already handled by the catch block for Exception
public class TestExDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			System.out.println("in try ");
			int x = 100 / 5;

			String str = "Srikanth";
			System.out.println(str.charAt(x));// i

		} catch (ArithmeticException e) {
			System.err.println("In catch of AE : ");
		} catch (StringIndexOutOfBoundsException se) {
			System.err.println("In catch of SE : ");
			System.err.println(se.getMessage());
		} catch (Exception e) {
			System.err.println("In catch of E : ");
		}
		System.out.println("main method ended ");

	}

}
