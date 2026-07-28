package com.logicalstatements;

import java.util.Scanner;

//Based on the day,  We need to Give Description..
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Day : ");
		String day = sc.next().toUpperCase();

		switch (day) {
		case "SUNDAY" -> System.out.println("fun day !!");
		case "MONDAY" -> System.out.println("Lazy day !!");
		case "TUESDAY", "WEDNESDAY", "THURSDAY" -> System.out.println("Routine Day !!");
		case "FRIDAY" -> System.out.println("Weekend mode started !!");
		case "SATURDAY" -> System.out.println("Weekend party started !");
		default -> System.out.println("Invald entry !!");
		}

		sc.close();

	}

}
