package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Given name can add to the PAN details ..? 
//The name length should not greater than 15 characters.
public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name : ");
		String name = sc.nextLine();

		if (name.length() > 15) {
			System.out.println("Your name is Too Langthy, Can you give it as a Short name : ");
		} else {
			System.out.println("Your name is adding to the PAN deatils : ");
		}

		System.out.println("main method ended !!");

	}

}
