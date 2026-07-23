package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Entered age is eligible for Voting or Driving ..? 
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");

		int age = sc.nextInt();//

		if (age > 18)
			System.out.println("You are eligible for Voting or Driving !!");
		else
			System.out.println("Arey babu !! niku inka time undi ra !!");
		
		System.out.println("Good morning Have a nice day !!");
		System.out.println("main method ended ");
		sc.close();
	}
}
