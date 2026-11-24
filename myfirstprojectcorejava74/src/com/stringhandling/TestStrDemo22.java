package com.stringhandling;

import java.util.Scanner;

//WAP to print the max Occurrences char of a Given String..? 
//input  : java 
//output :  a

//input : abbccc
//output : c 
public class TestStrDemo22 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();// abbccc --> c

		int[] arr = new int[127];// 0 0 0 0 0 ..... 0 0 0

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}

		int max = -1;
		char maxChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxChar = str.charAt(i);
			}
		}

		System.out.println("Max Occurrences char is : " + maxChar);

	}

}
