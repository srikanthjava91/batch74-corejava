package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Cricketer info based on their jersey Number ..? 
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Crickter Jersey Number : ");
		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("Mahendra Singh Dhoni !!");
			System.out.println("Cool Captain ");
			System.out.println("Thala for a Reason !!");
			break;
		case 18:
			System.out.println("Virat Kohli !!");
			System.out.println("The Aggressive Cricketer !!");
			System.out.println("King Kohli !!!");
			break;
		case 45:
			System.out.println("Rohit Sharma");
			System.out.println("The Greatest Batsman, who has comleted 3 doubles ");
			System.out.println("Hitman");
			break;

		default:
			System.out.println("Inavlid Jersey number !");
			System.out.println("Details not found !");

		}
		sc.close();
	}
}
