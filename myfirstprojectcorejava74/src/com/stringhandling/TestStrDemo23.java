package com.stringhandling;

import java.util.Scanner;

//WAP to print Count Vowels,consonants, numbers & spaces ..? 
public class TestStrDemo23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String !!");
		String str = sc.nextLine().toLowerCase();
		char[] ch = str.toCharArray();
		int chCount = 0;
		int vowCount = 0;
		int conCount = 0;
		int digCount = 0;
		int spaceCount = 0;

		for (char c : ch) {
			if (Character.isAlphabetic(c)) {

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowCount++;
				} else {
					conCount++;
				}
				chCount++;
			} else if (Character.isDigit(c)) {
				digCount++;
			} else if (Character.isSpaceChar(c)) {
				spaceCount++;
			}
		}

		System.out.println("Total Character count : " + chCount);
		System.out.println("Total Vowels count : " + vowCount);
		System.out.println("Total Consonant Count : " + conCount);
		System.out.println("Total Digit Count is : " + digCount);
		System.out.println("Total Space count : " + spaceCount);

	}

}
