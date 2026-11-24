package com.stringhandling;

//WAP to find the duplicate elements from a Given String..
public class TestStrDemo14 {

	public static void main(String[] args) {

		String str = "Sree";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.indexOf(ch) != str.lastIndexOf(ch) && str.indexOf(ch) == i) {
				System.out.println(ch);
			}
		}
	}
}
