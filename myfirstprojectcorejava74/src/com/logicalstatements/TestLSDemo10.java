package com.logicalstatements;

import java.util.Scanner;

//WAP to create vegetables or fruit market related console based app.
public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("Vcube Vegetable / Fruit Market ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Category : ");
		String catg = sc.next();

		String yn1 = "";

		switch (catg) {

		case "veg" -> {
			do {
				System.out.println("Enter the Item : ");
				String item = sc.next();

				switch (item) {
				case "tmt" -> System.out.println("Tomato - Price: 50 Rs/kg");
				case "ptt" -> System.out.println("Potato - Price: 40 Rs/kg");
				case "onn" -> System.out.println("Onion - Price: 30 Rs/kg");
				case "crt" -> System.out.println("Carrot - Price: 60 Rs/kg");
				case "btn" -> System.out.println("Beetroot - Price: 45 Rs/kg");
				case "cab" -> System.out.println("Cabbage - Price: 35 Rs/kg");
				case "cfl" -> System.out.println("Cauliflower - Price: 55 Rs/kg");
				case "brn" -> System.out.println("Brinjal - Price: 50 Rs/kg");
				case "chk" -> System.out.println("Chilli - Price: 80 Rs/kg");
				case "gin" -> System.out.println("Ginger - Price: 120 Rs/kg");
				default -> System.out.println("Item Not Available");
				}
				System.out.println("Do you want to continue with items: Click Y for Yes N for No ");
				yn1 = sc.next();
			} while (yn1.equalsIgnoreCase("y"));

		}

		case "fru" -> {
			System.out.println("Enter the Fruit  : ");
			String fruit = sc.next();

			switch (fruit) {
			case "apl" -> System.out.println("Apple - Price : 180 Rs/KG");
			case "ban" -> System.out.println("Banana - Price : 70 Rs/Dozen");
			case "grp" -> System.out.println("Grapes - Price : 120 Rs/KG");
			case "wml" -> System.out.println("Watermelon - Price : 30 Rs/KG");
			case "pap" -> System.out.println("Papaya - Price : 50 Rs/KG");
			case "pin" -> System.out.println("Pineapple - Price : 80 Rs/Piece");
			case "gau" -> System.out.println("Guava - Price : 90 Rs/KG");
			case "pom" -> System.out.println("Pomegranate - Price : 220 Rs/KG");
			case "chk" -> System.out.println("Chikoo - Price : 90 Rs/KG");
			case "str" -> System.out.println("Strawberry - Price : 250 Rs/Box");
			case "kwi" -> System.out.println("Kiwi - Price : 40 Rs/Piece");
			case "mus" -> System.out.println("Muskmelon - Price : 45 Rs/KG");
			case "lem" -> System.out.println("Lemon - Price : 60 Rs/Dozen");
			default -> System.out.println("Fruit Not Available");
			}

		}

		default -> System.out.println("The Entered Category is not available !");

		}

	}

}
