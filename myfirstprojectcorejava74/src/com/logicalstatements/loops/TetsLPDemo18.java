package com.logicalstatements.loops;

import java.util.Scanner;

//do something and the check the condition ..? 
public class TetsLPDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		String yn = ""; 
		do {
			System.out.println("hello");
			System.out.println("Do you want to continue ..? Click Y for Yes Click N fo No");
			yn = sc.next();//Y or N 
		} while (yn.equalsIgnoreCase("y"));
		
		System.out.println("EXIT");

	}

}
