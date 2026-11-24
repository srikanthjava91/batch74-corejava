package com.stringhandling;

public class TestStrDemo19 {

	public static void main(String[] args) {
		String str = "Java is simple";
		char[] ch = str.toCharArray();
		int count = 0;

		for (char c : ch) {
			System.out.println(c);
			count++;
		}

		System.out.println(count);
	}
}
