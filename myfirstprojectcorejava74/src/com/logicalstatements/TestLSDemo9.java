package com.logicalstatements;

import java.util.Scanner;

//WAP to find Calculated result based on the inputs.
public class TestLSDemo9 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a first number : ");
			double a = sc.nextDouble();

			System.out.println("Enter a second number : ");
			double b = sc.nextDouble();

			System.out.println("Enter a Symbol to proceed like + - * / %");
			String symb = sc.next();

			double result = 0;

//			Cannot switch on a value of type double. 
//			Only convertible int values, strings or enum variables are permitted
			switch (symb) {

			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "*" -> result = a * b;
			case "/" -> result = a / b;
			case "%" -> result = a % b;

			default -> {
				result = 0;
				System.out.println("Invalid symobol to proceed !!");
			}

			}

			System.out.println("Result is : " + result);
			System.out.println("Do you Want to Continue ..? Click Y for Yes N for Exit");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("EXIT !!");
	}
}
