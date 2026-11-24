package com.stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {

		String str = "Java is simple";
		System.out.println(str.codePointAt(1));// 97
		System.out.println(str.codePointBefore(3));// 97
		System.out.println(str.codePointCount(3, 10));// 7

		String str1 = "Advaith";
		String str2 = "Abhigna";
		String str3 = "Abhiram";
		String str4 = "abhiram";
//		Compares two strings lexicographically.
		System.out.println(str1.compareTo(str2));// 2
		System.out.println(str2.compareTo(str3));//
		System.out.println(str3.compareTo(str4));// -32
		System.out.println(str3.compareToIgnoreCase(str4));// -32

		String str5 = "Java";// 4
		String str6 = "Java is simple";// 14
		System.out.println(str5.compareTo(str6));// -10

		System.out.println("----------------------------");
		int i = 10;
		int i1 = 20;

		String a = "Java";
		String b = "Vcube";

		System.out.println(a.concat(b));// Javavcube
		System.out.println(a + i + i1);// java1020
		System.out.println(a + b);//Javavcube

	}

}
