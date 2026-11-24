package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

//What is Anagram ..? 
//race --> care ===> true 
//silent --> listen ==> true 
//eat --> tea ==> true 
//shivam --> vamshi  ==> true 

public class TestStrDemo20 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String ");
		String str1 = sc.next();

		System.out.println("Enter second String ");
		String str2 = sc.next();

		if (str1.length() != str2.length()) {
			System.out.println("It is not an anagram ");
			return;
		}

		char[] ch1 = str1.toCharArray();// eat --> e a t
		char[] ch2 = str2.toCharArray();// tea --> t e a

		Arrays.sort(ch1);// aet
		Arrays.sort(ch2);// aet
		
//		System.out.println(ch1);
//		System.out.println(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("The Given String are anagram !");
		} else {
			System.out.println("The Given String are not anagram !");
		}

	}

}
