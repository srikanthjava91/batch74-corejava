package com.logicalstatements;

import java.util.Scanner;

//1 --> Sunday 
//2 --> Monday 
//3 --> Tuesday 
//4 --> Wednesday 
//5 --> Thursday 
//6 --> Friday 
//7 --> Saturday 

public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Week day number ");
		int day = sc.nextInt();

		switch (day) {

		case 1 -> {
			System.out.println("Sunday");
			System.out.println("Sunday's are always fun or Jolly or Happy days to enjoy");
		}
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Invalid day !");

		}

	}
}
