package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo10 {

	public static void main(String[] args) {

		String s1 = "Srikanth";

		char[] ch = new char[3];//
		s1.getChars(0, 3, ch, 0);
		System.out.println(ch);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String rstr = "";

		byte[] strbytes = str.getBytes();// java --> 0 1 2 3

		for (byte b : strbytes) {
			char c = (char) b;
			rstr = c + rstr;
		}

		System.out.println("Reverse String of a Give STring : " + rstr);

	}
}
