package com.operators01;

//8) Ternary Operators : it is for conditional check in less lines.
//? : 
public class TestTernaryOpDemo1 {

	public static void main(String[] args) {

		// WAL for find max number from Given two numbers
		int a = 100;
		int b = 50;
		int c = 150;

//		int max = (a > b) ? a : b;
//		int min = (a < b) ? a : b;

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println("Maximum number  is : " + max);
//		System.out.println("Minimum number  is : " + min);

		// WAL for find Eligibility for the Driving or Voting
		int age = 23;
		boolean isEligible = (age > 18) ? true : false;
		System.out.println("The Given age is ELigible ..? " + isEligible);

		System.out.println("--------------------------");
		int age1 = 22;
		String status = (age1 > 18) ? "Yes" : "No";
		System.out.println("The Given age is ELigible ..? " + status);

	}

}
