package com.stringhandling;

public class TestStrDemo18 {

	public static void main(String[] args) {

		String str = "    Java is simple at vcube is in 500090   ";
		str = str.trim();// Returns a string whose value is this string, with all leading and trailing
							// space removed
		System.out.println(str);

		str = str.replace('a', 'A');
		System.out.println(str);

		str = str.replace("is", "ESSSS");
		System.out.println(str);

		str = str.replaceAll("\\s", "");
		System.out.println(str);

		str = str.replaceAll("\\d", "X");
		System.out.println(str);

		String str1 = "Srikanth";
		// Returns a string that is a substring of this string
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(4, 6));// an

	}

}
