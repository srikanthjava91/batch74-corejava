package com.stringhandling;

public class TestStrDemo15 {

	public static void main(String[] args) {
		
		String str1 = "";
		String str2 = "        ";
		String str3 = null;
		String str4 = "null";
		
		//Returns true if, and only if, length() is 0.
		System.out.println(str1.isEmpty());//true
		System.out.println(str2.isEmpty());//false
//		System.out.println(str3.isEmpty());//NPE 
		System.out.println(str4.isEmpty());//false
		System.out.println("----------------------");
		
		//Returns true if the string is empty or contains only white space codepoints, 
//		otherwise false.
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		
		
	}

}
