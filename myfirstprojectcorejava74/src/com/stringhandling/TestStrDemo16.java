package com.stringhandling;

//length vs length() vs size()  
public class TestStrDemo16 {

	public static void main(String[] args) {
		String s1 = "J2SE";
		String s2 = "J2EE";
		String s3 = "MySql";
		String s4 = "Spring";
		String s5 = "SpringBoot";

		String names = String.join("-", s1, s2, s3, s4, s5);
		System.out.println(names);

		System.out.println("-----------------------------");
		String str = "Java-is-simpl-in-Vcube-at-JNTU ";

		String[] words = str.split("-", 4);
		int count = 0;

		for (String word : words) {
			count++;
			System.out.println(word);
		}

		System.out.println(count);
	}

}
