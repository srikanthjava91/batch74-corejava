package com.logicalstatements;

import java.util.Scanner;

//WAP to Check Multiple conditions based on the Requirements ..!
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Welcome to Vcube Matrimonial site !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Welcome Mr : " + name);

		System.out.println("Enter your Assets : ");
		double assets = sc.nextDouble();

		System.out.println("Enter Your Salary : ");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 || salary >= 1000000.00) {
			System.out.println("Okay !! Lets start the discussion !!");

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age >= 26 && age <= 29) {
				System.out.println("Okay good to go !!");

				System.out.println("Enter your height :");
				float height = sc.nextFloat();

				System.out.println("Enter your weight : ");
				double weight = sc.nextDouble();

				if ((height >= 5.5 && height <= 6.0) && (weight >= 65 && weight <= 75)) {
					System.out.println("Okay will discuss more ");

					System.out.println("Do you Drink or Smoke ..? ");
					boolean habbitStatus = sc.nextBoolean();

					if (!habbitStatus) {
						System.out.println("OKay Cool !! Will discuss ");

						System.out.println("Do you have Siblings ..? ");
						boolean sibStatus = sc.nextBoolean();

						if (sibStatus) {
							System.out.println("Oh My God !! ");
						} else {
							System.out.println("Oh nice !! Will meet soon !!");
						}

					} else {
						System.out.println("YOu can Leav for the day !! ");
					}

				} else {
					System.out.println("You must need to Gym or You are too short or too height!!");
				}

			} else {
				System.out.println("Sorry !! Your age is not matching with our profile ");
			}

		} else {
			System.out.println("You can leave for the day !!");
		}

	}

}
