package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username : ");
		String username = sc.next();

		System.out.println("Enter your password : ");
		sc.nextLine();
		String password = sc.nextLine();

		if (username.equalsIgnoreCase("user") && password.equals("Admin@123")) {
			System.out.println("Welcome to Home Page !!");
		} else {
			System.err.println("Invalid user credentials !!");
		}

	}

}
