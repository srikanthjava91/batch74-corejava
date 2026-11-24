package com.stringhandling;

import java.util.Scanner;

//WAP to print String in a Reverse Order..? 
//WPA to find the Give String is a Palindrome or not ..? 
public class TestStrDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();// Java ---> 0 1 2 3
		String rstr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);// J a v a
			rstr = c + rstr;// avaJ
		}
		System.out.println("Reverse String of a Given String is : " + rstr);
		
		if(str.equalsIgnoreCase(rstr)) {
			System.out.println("The Given String palindrome !!");
		}else {
			System.out.println("The Given String is not palindrome !!");
		}

	}
}
